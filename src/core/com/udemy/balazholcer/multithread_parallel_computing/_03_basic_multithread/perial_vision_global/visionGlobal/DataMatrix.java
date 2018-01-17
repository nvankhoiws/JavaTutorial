package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/201711:13 AM.
 */
public class DataMatrix {

    protected static String[][] buildDataMatrix(String dataFrame) {
        try {
            if (dataFrame != null && !dataFrame.equals(VisionGlobalConstants.EMPTY_ARRAY) && dataFrame.length() > 0) {
                JsonObject jsonObject = new Gson().fromJson(dataFrame, JsonObject.class);
                JsonArray a = null;
                if (jsonObject.get("success").toString().equals("true")){
                    JsonObject o = (JsonObject) jsonObject.get("data");
                    if (o.entrySet().size() > 0) {
                        a = o.getAsJsonArray(VisionGlobalConstants.INVOICING_VISION_GLOBAL);
                    }
                }
                if (a != null && a.size() >= 2) {
                    String[][] dataMatrix = new String[a.size()][a.get(0).getAsJsonArray().size()];
                    for (int i = 0; i < a.size(); i++) {
                        JsonArray strings = a.get(i).getAsJsonArray();
                        List<String> l = new ArrayList<String>();
                        for (int j = 0; j < strings.size(); j++) {
                            dataMatrix[i][j] = (String.valueOf(strings.get(j)).equals("null")) ? VisionGlobalConstants.EMPTY_STRING : strings.get(j).getAsString();
                        }
                    }
                    return dataMatrix;
                }
            }
        } catch (Exception e) {
        }
        return null;
    }
}
