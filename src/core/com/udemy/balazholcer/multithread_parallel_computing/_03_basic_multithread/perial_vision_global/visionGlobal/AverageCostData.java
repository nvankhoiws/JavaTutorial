package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.visionGlobal;

import core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global.VisionGlobalConstants;

import java.util.*;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/11/201711:17 AM.
 */
public class AverageCostData  extends Thread{

    protected static List getAverageCostData(String[][] dataFrame) {
        List averageCostData = new ArrayList();
        Double averageOfTotal = 0.0;
        try {
            if (dataFrame != null && dataFrame.length >= 2) {
                Map<String, Map> accumulator = new HashMap<>();
                for (int col = 0; col < dataFrame[0].length; col++){
                    String elem = dataFrame[0][col];
                    if (elem != null && !elem.isEmpty()
                            && (elem.contains(VisionGlobalConstants.COST_BY_CONSO) || elem.contains(VisionGlobalConstants.CONTRACT_ACTIVE_RECOG_SIGN))) {
                        double originalQuantity=0;
                        String checkQuantily=dataFrame[dataFrame.length - 2][col];
                        if((checkQuantily != null && !checkQuantily.isEmpty() && checkQuantily.length() > 0))
                        originalQuantity = Double.parseDouble(String.valueOf(dataFrame[dataFrame.length - 2][col]));
//                        if(originalQuantity==0) continue;
                        Map obj = new HashMap();
                        String[] atom = new String[0];
                        if (elem != null && !elem.isEmpty()) {
                            atom = elem.split(VisionGlobalConstants.UNDER_SCORE, -1);
                            if (atom.length < 3) continue;
                            if (atom.length == 4 && String.valueOf(atom[1] + "_" + atom[2]).equalsIgnoreCase(VisionGlobalConstants.OTHER_ENERGY)) {
                                atom = new String[]{VisionGlobalConstants.COST_BY_CONSO, VisionGlobalConstants.OTHER_ENERGY, atom[3]};
                            } else if (atom.length == 4 && String.valueOf(atom[2] + "_" + atom[3]).equalsIgnoreCase(VisionGlobalConstants.OTHER_ENERGY)) {
                                atom = new String[]{VisionGlobalConstants.CONTRACT_ACTIVE_RECOG_SIGN.substring(0, VisionGlobalConstants.CONTRACT_ACTIVE_RECOG_SIGN.length() - 1)
                                        , "number", VisionGlobalConstants.OTHER_ENERGY};
                            }
                        }
                        if ((atom[0].contains(VisionGlobalConstants.COST_BY_CONSO) && !atom[1].trim().toLowerCase().equalsIgnoreCase(VisionGlobalConstants.WATER))
                                || (atom[1].equalsIgnoreCase("number") && !atom[2].contains(VisionGlobalConstants.WATER) )) {
                            String fluideName = VisionGlobalConstants.EMPTY_STRING;
                            if (atom[0].contains(VisionGlobalConstants.COST_BY_CONSO)) {
                                fluideName = VisionGlobalConstants.getFluideArrayFromName()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName())
                                        .indexOf(atom[1].toLowerCase().trim())];
                            } else if (atom[1].equalsIgnoreCase("number")) {
                                fluideName = VisionGlobalConstants.getFluideArrayFromName()[Arrays.asList(VisionGlobalConstants.getFluideArrayFromName())
                                        .indexOf(atom[2].toLowerCase().trim())];
                            }
                            if (fluideName.equalsIgnoreCase(VisionGlobalConstants.WATER)) continue;
                            if (accumulator.get(fluideName) != null) {
                                obj = accumulator.get(fluideName);
                            } else {
                                obj.put(VisionGlobalConstants.FLUIDE, VisionGlobalConstants.getFluideArrayColorClass()[Arrays
                                        .asList(VisionGlobalConstants.getFluideArrayFromName()).indexOf(atom[1].toLowerCase().trim())]);
                            }

                            if (elem.contains(VisionGlobalConstants.CONTRACT_ACTIVE_RECOG_SIGN)) {
                                if (checkQuantily != null && !checkQuantily.trim().isEmpty() )
                                    obj.put(VisionGlobalConstants.CONTRACTS_ACTIVE, originalQuantity);
                                else
                                    obj.put(VisionGlobalConstants.CONTRACTS_ACTIVE, null);
                            }

                            if (elem.contains(VisionGlobalConstants.COST_BY_CONSO)) {
                                if (checkQuantily != null && !checkQuantily.trim().equalsIgnoreCase(VisionGlobalConstants.EMPTY_STRING) ){
                                    obj.put(VisionGlobalConstants.COST_BY_CONSO, originalQuantity);
                                    obj.put(VisionGlobalConstants.COST_BY_CONSO_UNIT, dataFrame[dataFrame.length - 1][col]);
                                } else{
                                    obj.put(VisionGlobalConstants.COST_BY_CONSO, null);
                                    obj.put(VisionGlobalConstants.COST_BY_CONSO_UNIT, null);
                                }
                            }

                            accumulator.put(fluideName, obj);
                            if(obj.size()==4){
                            if ((obj.get(VisionGlobalConstants.COST_BY_CONSO)== null && obj.get(VisionGlobalConstants.CONTRACTS_ACTIVE)== null )){
                                accumulator.remove(fluideName);
                            }else if(obj.get(VisionGlobalConstants.CONTRACTS_ACTIVE)!= null){
                                if((obj.get(VisionGlobalConstants.COST_BY_CONSO)== null && Double.parseDouble(String.valueOf(obj.get(VisionGlobalConstants.CONTRACTS_ACTIVE)))==0)){
                                    accumulator.remove(fluideName);
                                }
                            }
                            }
                        }
                    }
                }
                averageCostData = new ArrayList<>(accumulator.values());
                return averageCostData;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
