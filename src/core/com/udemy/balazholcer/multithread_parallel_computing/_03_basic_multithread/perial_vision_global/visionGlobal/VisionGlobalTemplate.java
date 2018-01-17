package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import com.google.gson.Gson;
import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;

import java.util.*;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/20179:20 AM.
 */
public abstract class VisionGlobalTemplate {

    protected String inputDataFrame;

    protected String[][] dataFrame;

    protected abstract void buildDataMatrix(String inputDataFrame);

    protected abstract List getEnergyPercentData();

    protected abstract List getEmissionCO2Data();

    protected abstract List getFournitureDenergieData();

    protected abstract List getAverageCostData();

    protected abstract List getFournitureDeauData();

    public final String getVisionGlobalData(){
        Map<String, List<Map<?, ?>>> constructor = new HashMap<>();
        buildDataMatrix(inputDataFrame);
        constructor.put(VisionGlobalConstants.ENERGY_PERCENT, getEnergyPercentData());
        constructor.put(VisionGlobalConstants.EMISSION_CO2, getEmissionCO2Data());
        constructor.put(VisionGlobalConstants.FOURNITURE_DENERGIE, getFournitureDenergieData());
        constructor.put(VisionGlobalConstants.AVERAGE_COST, getAverageCostData());
        constructor.put(VisionGlobalConstants.FOURNITURE_DEAU, getFournitureDeauData());
        return new Gson().toJson(constructor);
    }
}
