package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;

import java.util.*;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/201711:17 AM.
 */
public class EnergyPercentData extends Thread{

    protected static List getEnergyPercentData(String[][] dataFrame) {
        List energyPercentData = new ArrayList();
        Double total = 0.0;
        int unitIndex = 100;
        int totalUnitIndex = 0;
        String totalUnit = VisionGlobalConstants.EMPTY_STRING;
        String totalUnitEnd="";
        try {
            if (dataFrame != null && dataFrame.length >= 2) {
                for (int col = 0; col < dataFrame[0].length; col++) {
                    String fluideTotalUnit = dataFrame[dataFrame.length - 1][col];
                    if (!(fluideTotalUnit != null && !fluideTotalUnit.isEmpty() && fluideTotalUnit.length() > 0))
                        continue;
                    double originalQuantity=0.0;
                    String headerCol = dataFrame[0][col];
                    // Check if this header is used to draw energy percent chart
                    if (headerCol != null && headerCol.contains(VisionGlobalConstants.COST_RECOG_SIGN)) {
                        String checkQuantily=dataFrame[dataFrame.length - 2][col];
                        if(!(checkQuantily != null && !checkQuantily.isEmpty() && checkQuantily.length() > 0)) continue;
                        originalQuantity = Double.parseDouble(String.valueOf(checkQuantily));
                        if(originalQuantity==0) continue;
                        String[] splittedHeaderCol = headerCol.split(VisionGlobalConstants.UNDER_SCORE, -1);
                        if (splittedHeaderCol.length < 3) continue;
                        // Check if this header container the string "other_energy", so the splitted size is 4, then we remake the splittedHeaderCol size to 3
                        if (splittedHeaderCol.length == 4 && String.valueOf(splittedHeaderCol[1] + VisionGlobalConstants.UNDER_SCORE + splittedHeaderCol[2]).equalsIgnoreCase(VisionGlobalConstants.OTHER_ENERGY)) {
                            splittedHeaderCol = new String[]{VisionGlobalConstants.COST_RECOG_SIGN.substring(0, VisionGlobalConstants.COST_RECOG_SIGN.length() - 1), VisionGlobalConstants.OTHER_ENERGY, splittedHeaderCol[3]};
                        }
                        if (Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).contains(splittedHeaderCol[1].toLowerCase().trim())) {
                            Map obj = new HashMap();
                            obj.put(VisionGlobalConstants.FLUIDE, VisionGlobalConstants.getFluideArrayColorClass()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).indexOf(splittedHeaderCol[1].toLowerCase().trim())]);
                            try {
//                                originalQuantity = Double.parseDouble(String.valueOf(dataFrame[dataFrame.length - 2][col]));
//                                String prefix_originalUnit = splittedHeaderCol[2].trim().toLowerCase().replace(VisionGlobalConstants.EURO, VisionGlobalConstants.EMPTY_STRING);
//                                int originalUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(prefix_originalUnit);
//                                String prefix_totalColUnit = dataFrame[dataFrame.length - 1][col].trim().toLowerCase().replace(VisionGlobalConstants.EURO, VisionGlobalConstants.EMPTY_STRING);
//                                int totalColUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(prefix_totalColUnit);
//                                if (totalColUnitIndex >= originalUnitIndex){
//                                    originalQuantity = originalQuantity * Math.pow(0.001, totalColUnitIndex - originalUnitIndex);
//                                }else{
//                                    originalQuantity = originalQuantity * Math.pow(1000, originalUnitIndex - totalColUnitIndex);
//                                }
                                obj.put(VisionGlobalConstants.ENERGY_QUANTITY, originalQuantity);
                            } catch (Exception e) {
                                obj.put(VisionGlobalConstants.ENERGY_QUANTITY, 0.0);
                            }
                            obj.put(VisionGlobalConstants.ENERGY_UNIT, fluideTotalUnit);
                            String prefix_unit = fluideTotalUnit.trim().toLowerCase().replace(VisionGlobalConstants.EURO, VisionGlobalConstants.EMPTY_STRING);
                            int currentUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(prefix_unit);
                            obj.put(VisionGlobalConstants.POWER_COEFFICIENCY, currentUnitIndex);
                            if (currentUnitIndex < unitIndex && originalQuantity >0){
                                unitIndex = currentUnitIndex;
                                totalUnitEnd=fluideTotalUnit;
                            }
                            if (obj.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY)) {
                                total = (Double) obj.get(VisionGlobalConstants.ENERGY_QUANTITY);
                                totalUnitIndex = (Integer) obj.get(VisionGlobalConstants.POWER_COEFFICIENCY);
                                totalUnit = fluideTotalUnit;
                            }
                            energyPercentData.add(obj);
                        }
                    }
                }
                for (int i = 0; i < energyPercentData.size(); i++) {
                    Map o = (Map) energyPercentData.get(i);
                    if (o != null && !String.valueOf(o.get(VisionGlobalConstants.ENERGY_QUANTITY)).trim().isEmpty() && o.get(VisionGlobalConstants.ENERGY_QUANTITY) != null && !o.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY))  {
                        if (Double.compare(total, 0.0) <= 0 ){
                            o.put(VisionGlobalConstants.ENERGY_PERCENT, 0.0);
                        } else {
                            o.put(VisionGlobalConstants.ENERGY_PERCENT,
                                    ((Double) o.get(VisionGlobalConstants.ENERGY_QUANTITY)
                                            * Math.pow(1000, (Integer) o.get(VisionGlobalConstants.POWER_COEFFICIENCY) - unitIndex)) * 100 /
                                            (total * Math.pow(1000, totalUnitIndex - unitIndex)));
                            o.put(VisionGlobalConstants.ENERGY_QUANTITY,
                                    ((Double) o.get(VisionGlobalConstants.ENERGY_QUANTITY)
                                            * Math.pow(1000, (Integer) o.get(VisionGlobalConstants.POWER_COEFFICIENCY) - unitIndex)));
                            o.put(VisionGlobalConstants.ENERGY_UNIT, totalUnitEnd);
                            o.remove(VisionGlobalConstants.POWER_COEFFICIENCY);
                        }
                    }
//                    if (o.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY) && totalUnit != null && !totalUnit.isEmpty()) {
//                        int displayTotalUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey())
//                                .indexOf(totalUnit.trim().replace(VisionGlobalConstants.EURO, VisionGlobalConstants.EMPTY_STRING).toLowerCase());
//
//                        if (displayTotalUnitIndex >= totalUnitIndex) {
//                            o.put(VisionGlobalConstants.ENERGY_QUANTITY, total * Math.pow(0.001, displayTotalUnitIndex - totalUnitIndex));
//                        } else {
//                            o.put(VisionGlobalConstants.ENERGY_QUANTITY, total * Math.pow(1000, totalUnitIndex - displayTotalUnitIndex));
//                        }
//                        o.put(VisionGlobalConstants.ENERGY_UNIT, totalUnit);
//                    }
                }
                return energyPercentData;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
