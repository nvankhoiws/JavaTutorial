package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/20179:38 AM.
 */
public class VisionGlobal extends VisionGlobalTemplate {

    public VisionGlobal(String inputDataFrame) {
        super.inputDataFrame = inputDataFrame;
    }

    @Override
    protected void buildDataMatrix(String inputDataFrame) {
        dataFrame = DataMatrix.buildDataMatrix(inputDataFrame);
    }

    @Override
    protected List getEnergyPercentData() {
        return EnergyPercentData.getEnergyPercentData(dataFrame);
    }

    @Override
    protected List getEmissionCO2Data() {
        return EmissionCO2Data.getEmissionCO2Data(dataFrame);
    }

    @Override
    protected List getFournitureDenergieData() {
        return FournitureDenergieData.getFournitureDenergieData(dataFrame);
    }

    @Override
    protected List getAverageCostData() {
        return AverageCostData.getAverageCostData(dataFrame);
    }

    @Override
    protected List getFournitureDeauData() {
        return FournitureDeauData.getFournitureDeauData(dataFrame);
    }
}
