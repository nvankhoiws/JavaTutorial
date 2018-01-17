package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;

import java.util.*;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/201711:17 AM.
 */
public class EmissionCO2Data  extends Thread{

    protected static List getEmissionCO2Data(String[][] dataFrame) {
        List emissionCO2Data = new ArrayList();
        int unitIndex = 100;
        int totalUnitIndex = 0;
        String totalUnit = VisionGlobalConstants.EMPTY_STRING;
        String totalUnitEnd="";
        try {
            if (dataFrame != null && dataFrame.length >= 2) {
                for (int col = 0; col < dataFrame[0].length; col++){
                    String originalUnit = dataFrame[dataFrame.length - 1][col];
                    if(!(originalUnit != null && !originalUnit.isEmpty() && originalUnit.length() > 0)) continue;
                    String elem = dataFrame[0][col];
                    if (elem != null && elem.contains(VisionGlobalConstants.EMISSION_CO2_RECOG_SIGN)) {
                        double originalQuantity=0;
                        String checkQuantily=dataFrame[dataFrame.length - 2][col];
                        if(!(checkQuantily != null && !checkQuantily.isEmpty() && checkQuantily.length() > 0)) continue;
                        originalQuantity = Double.parseDouble(String.valueOf(dataFrame[dataFrame.length - 2][col]));
                        if(originalQuantity==0) continue;
                        String[] atom = elem.split(VisionGlobalConstants.UNDER_SCORE, -1);
                        if (atom.length < 3) continue;
                        if (atom.length == 4 && String.valueOf(atom[1] + "_" + atom[2]).equalsIgnoreCase(VisionGlobalConstants.OTHER_ENERGY)) {
                            atom = new String[]{VisionGlobalConstants.EMISSION_CO2_RECOG_SIGN.substring(0, VisionGlobalConstants.EMISSION_CO2_RECOG_SIGN.length() - 1), VisionGlobalConstants.OTHER_ENERGY, atom[3]};
                        }

                        if (Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).contains(atom[1].toLowerCase().trim())) {
                            Map obj = new HashMap();
                            obj.put(VisionGlobalConstants.FLUIDE, VisionGlobalConstants.getFluideArrayColorClass()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).indexOf(atom[1].toLowerCase().trim())]);
                            try {

                                obj.put(VisionGlobalConstants.EMISSION_QUANTITY, originalQuantity);
                            } catch (Exception e) {
                                obj.put(VisionGlobalConstants.EMISSION_QUANTITY, 0.0);
                            }
                            obj.put(VisionGlobalConstants.EMISSION_UNIT, originalUnit);
//                            if (atom[2] != null && !atom[2].equals(VisionGlobalConstants.EMPTY_STRING) && atom[2].length() > 0) {
//                                String originalUnit = atom[2].trim().toLowerCase();
//                                originalUnit = originalUnit.replace(VisionGlobalConstants.T_CO2, VisionGlobalConstants.EMPTY_STRING);
//                                int currentUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(originalUnit);
//                                obj.put(VisionGlobalConstants.POWER_COEFFICIENCY, currentUnitIndex);
//                                if (currentUnitIndex < unitIndex) unitIndex = currentUnitIndex;
//                            }
                            String originalUnitBlock = originalUnit.trim().toLowerCase();
                            originalUnitBlock = originalUnitBlock.replace(VisionGlobalConstants.T_CO2, VisionGlobalConstants.EMPTY_STRING);
                            int currentUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(originalUnitBlock);
                            obj.put(VisionGlobalConstants.POWER_COEFFICIENCY, currentUnitIndex);
                            if (currentUnitIndex < unitIndex) unitIndex = currentUnitIndex;
                            if (currentUnitIndex < unitIndex && originalQuantity> 0 ){
                                unitIndex = currentUnitIndex;
                                totalUnitEnd  = originalUnit;
                            }
                            if (obj.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY)) {
                                totalUnit = originalUnit;
                                obj.put(VisionGlobalConstants.EMISSION_UNIT, totalUnit);
                                totalUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(totalUnit.trim().toLowerCase()
                                        .replace(VisionGlobalConstants.T_CO2, VisionGlobalConstants.EMPTY_STRING));
                                obj.put(VisionGlobalConstants.POWER_COEFFICIENCY, totalUnitIndex);
                            }
                            emissionCO2Data.add(obj);
                        }
                    }
                }

                for (int i = 0; i < emissionCO2Data.size(); i++) {
                    Map o = (Map) emissionCO2Data.get(i);
//                    if (o != null && o.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY) && totalUnit != null
//                            && !totalUnit.isEmpty()) {
//                        if (totalUnitIndex <= unitIndex) {
//                            o.put(VisionGlobalConstants.EMISSION_QUANTITY, (Double)o.get(VisionGlobalConstants.EMISSION_QUANTITY)
//                                    * Math.pow(1000, unitIndex - totalUnitIndex));
//                        } else {
//                            o.put(VisionGlobalConstants.EMISSION_QUANTITY, (Double)o.get(VisionGlobalConstants.EMISSION_QUANTITY)
//                                    * Math.pow(0.001, totalUnitIndex - unitIndex));
//                        }
//                        o.put(VisionGlobalConstants.EMISSION_UNIT, totalUnit);
//                    } else
                    if (o != null && !String.valueOf(o.get(VisionGlobalConstants.EMISSION_QUANTITY)).trim().isEmpty()
                            && o.get(VisionGlobalConstants.EMISSION_QUANTITY) != null && !o.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY)){
                        o.put(VisionGlobalConstants.EMISSION_QUANTITY, (Double) o.get(VisionGlobalConstants.EMISSION_QUANTITY)
                                * Math.pow(1000, (Integer)o.get(VisionGlobalConstants.POWER_COEFFICIENCY) - unitIndex));
                        o.put(VisionGlobalConstants.ENERGY_UNIT, totalUnitEnd);
                    }
                    o.remove(VisionGlobalConstants.POWER_COEFFICIENCY);
                }
                return emissionCO2Data;
            }
        } catch (Exception e) {
        }
        return null;
    }

}
