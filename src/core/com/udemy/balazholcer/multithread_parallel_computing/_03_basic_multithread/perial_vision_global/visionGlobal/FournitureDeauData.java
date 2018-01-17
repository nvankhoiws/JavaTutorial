package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;

import java.util.*;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/201711:18 AM.
 */
public class FournitureDeauData  extends Thread{

    protected static List getFournitureDeauData(String[][] dataFrame) {
        List fournitureDeau = new ArrayList();
        Double averageOfTotal = 0.0;
        try {
            if (dataFrame != null && dataFrame.length >= 2) {
                Map<String, Map> accumulator = new HashMap<>();
                int n = dataFrame[0].length;
                for (int col = 0; col < n ; col++){
                    String elem = dataFrame[0][col];
                    if (elem != null
                            && !elem.isEmpty()
                            && (elem.contains(VisionGlobalConstants.CONSO_RECOG_SIGN) || elem.contains(VisionGlobalConstants.COST_BY_CONSO))
                            && elem.contains(VisionGlobalConstants.WATER)) {
                        double originalQuantity=0;
                        String checkQuantily=dataFrame[dataFrame.length - 2][col];
                        if((checkQuantily != null && !checkQuantily.isEmpty() && checkQuantily.length() > 0))
                        originalQuantity = Double.parseDouble(String.valueOf(checkQuantily));
                        Map obj = new HashMap();
                        String[] atom = new String[0];
                        if (elem != null && !elem.equals(VisionGlobalConstants.EMPTY_STRING)) {
                            atom = elem.split(VisionGlobalConstants.UNDER_SCORE, -1);
                            if (atom.length < 3) continue;
                        }
                        String fluideName = VisionGlobalConstants.getFluideArrayFromName()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).indexOf(atom[1].toLowerCase().trim())];
                        if (accumulator.get(fluideName) != null) {
                            obj = accumulator.get(fluideName);
                        } else {
                            obj.put(VisionGlobalConstants.FLUIDE, VisionGlobalConstants.getFluideArrayColorClass()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).indexOf(atom[1].toLowerCase().trim())]);
                        }
                        if (elem.contains(VisionGlobalConstants.CONSO_RECOG_SIGN)
                                && !elem.contains(VisionGlobalConstants.COST_BY_CONSO)) {
                            if (checkQuantily != null && !checkQuantily.trim().isEmpty() ){
                                try {
                                    obj.put(VisionGlobalConstants.CONSO_QUANTITY, originalQuantity);
                                } catch (NumberFormatException e) {
                                    obj.put(VisionGlobalConstants.CONSO_QUANTITY, 0.0);
                                }
                            }
                            obj.put(VisionGlobalConstants.CONSO_UNIT, dataFrame[dataFrame.length - 1][col]);
                        }
                        if (elem.contains(VisionGlobalConstants.COST_BY_CONSO)) {
                            if (checkQuantily != null && !checkQuantily.trim().isEmpty() ){
                                try {
                                    obj.put(VisionGlobalConstants.COST_BY_CONSO, originalQuantity);
                                } catch (NumberFormatException e) {
                                    obj.put(VisionGlobalConstants.COST_BY_CONSO, 0.0);
                                }
                                obj.put(VisionGlobalConstants.COST_BY_CONSO_UNIT, dataFrame[dataFrame.length - 1][col]);
                            } else{
                                obj.put(VisionGlobalConstants.COST_BY_CONSO, 0.0);
                                obj.put(VisionGlobalConstants.COST_BY_CONSO_UNIT, dataFrame[dataFrame.length - 1][col]);
                            }
                        }
                        accumulator.put(fluideName, obj);
                    }
                }
                fournitureDeau = new ArrayList<>(accumulator.values());
                return fournitureDeau;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
