package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;
import java.util.*;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/201711:17 AM.
 */
public class FournitureDenergieData extends Thread{

    protected static List getFournitureDenergieData(String[][] dataFrame) {
        List fournitureDenergieData = new ArrayList();
        int unitIndex = 100;
        Double total = 0.0;
        String totalUnit = VisionGlobalConstants.EMPTY_STRING;
        int totalUnitIndex = 0;
        String totalUnitEnd="";
        try {
            if (dataFrame != null && dataFrame.length >= 2) {
                int colLength =dataFrame[0].length;
                for (int col = 0; col < colLength; col++){
                    String originalUnit =dataFrame[dataFrame.length - 1][col];
                    if(!(originalUnit != null && !originalUnit.isEmpty() && originalUnit.length() > 0)) continue;
                    double originalQuantity=0.0;
                    String elem = dataFrame[0][col];
                    if (elem != null && !elem.isEmpty() && elem.contains(VisionGlobalConstants.CONSO_RECOG_SIGN)
                            && !elem.contains(VisionGlobalConstants.COST_BY_CONSO)) {
                        String checkQuantily=dataFrame[dataFrame.length - 2][col];
                        if(!(checkQuantily != null && !checkQuantily.isEmpty() && checkQuantily.length() > 0)) continue;
                        originalQuantity = Double.parseDouble(String.valueOf(dataFrame[dataFrame.length - 2][col]));
                        if(originalQuantity == 0) continue;
                        String[] atom = elem.split(VisionGlobalConstants.UNDER_SCORE, -1);
                        if (atom.length < 3) continue;
                        if (atom.length == 4 && String.valueOf(atom[1] + "_" + atom[2]).equalsIgnoreCase(VisionGlobalConstants.OTHER_ENERGY)) {
                            atom = new String[]{VisionGlobalConstants.CONSO_RECOG_SIGN.substring(0, VisionGlobalConstants.CONSO_RECOG_SIGN.length() - 1), VisionGlobalConstants.OTHER_ENERGY, atom[3]};
                        }
                        if (Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).contains(atom[1].toLowerCase().trim()) && !atom[1].toLowerCase().trim().equalsIgnoreCase(VisionGlobalConstants.WATER)) {
                            Map obj = new HashMap();
                            obj.put(VisionGlobalConstants.FLUIDE, VisionGlobalConstants.getFluideArrayColorClass()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName()).indexOf(atom[1].toLowerCase().trim())]);
                            obj.put(VisionGlobalConstants.CONSO_QUANTITY, originalQuantity);
                            obj.put(VisionGlobalConstants.CONSO_UNIT, originalUnit);
                            String originalUnitBlock = originalUnit.trim().toLowerCase();
                            originalUnitBlock = originalUnitBlock.replace(VisionGlobalConstants.WH_UNIT, VisionGlobalConstants.EMPTY_STRING);
                            int currentUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(originalUnitBlock);
                            obj.put(VisionGlobalConstants.POWER_COEFFICIENCY, currentUnitIndex);

                            if (obj.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY)) {
                                total = originalQuantity;
                                totalUnit = originalUnit;
                                obj.put(VisionGlobalConstants.CONSO_UNIT, totalUnit);
                                totalUnitIndex = Arrays.asList(VisionGlobalConstants.getPrefixKey()).indexOf(totalUnit.trim().toLowerCase()
                                        .replace(VisionGlobalConstants.WH_UNIT, VisionGlobalConstants.EMPTY_STRING));
                                obj.put(VisionGlobalConstants.POWER_COEFFICIENCY, totalUnitIndex);
                            }else{
                                if (currentUnitIndex < unitIndex && originalQuantity>0){
                                    unitIndex = currentUnitIndex;
                                    totalUnitEnd  = originalUnit;
                                }
                            }
                            fournitureDenergieData.add(obj);
                        }
                    }
                }
                for (int i = 0; i < fournitureDenergieData.size(); i++) {
                    Map o = (Map) fournitureDenergieData.get(i);
//                    if (o.get(Constants.FLUIDE).equals(Constants.TOTAL_ENERGY) && totalUnit != null
//                            && !totalUnit.isEmpty()) {
//                        if (totalUnitIndex <= unitIndex) {
//                            o.put(Constants.CONSO_QUANTITY, (Double)o.get(Constants.CONSO_QUANTITY)
//                                    * Math.pow(1000, unitIndex - totalUnitIndex));
//                        } else {
//                            o.put(Constants.CONSO_QUANTITY, (Double)o.get(Constants.CONSO_QUANTITY)
//                                    * Math.pow(0.001, totalUnitIndex - unitIndex));
//                        }
//                        o.put(Constants.CONSO_UNIT, totalUnit);
//                    } else
                    if (o != null && o.get(VisionGlobalConstants.CONSO_QUANTITY) != null && !o.get(VisionGlobalConstants.FLUIDE).equals(VisionGlobalConstants.TOTAL_ENERGY)) {
                        if (Double.compare(total, 0.0) <= 0) {
                            o.put(VisionGlobalConstants.ENERGY_PERCENT, 0.0);
                        }else{
                            o.put(VisionGlobalConstants.ENERGY_PERCENT,    ((Double) o.get(VisionGlobalConstants.CONSO_QUANTITY)
                                    * Math.pow(1000, (Integer) o.get(VisionGlobalConstants.POWER_COEFFICIENCY) - unitIndex)) * 100 /
                                    (total * Math.pow(1000, totalUnitIndex - unitIndex)));
                            o.put(VisionGlobalConstants.CONSO_QUANTITY, (Double) o.get(VisionGlobalConstants.CONSO_QUANTITY)
                                    * Math.pow(1000, (Integer)o.get(VisionGlobalConstants.POWER_COEFFICIENCY) - unitIndex));
                            o.put(VisionGlobalConstants.CONSO_UNIT, totalUnitEnd);
                        }
                    }
                    o.remove(VisionGlobalConstants.POWER_COEFFICIENCY);
                }
                return fournitureDenergieData;
            }
        } catch (Exception e) {
        }
        return null;
    }

}
