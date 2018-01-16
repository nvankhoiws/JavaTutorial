package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/20174:35 PM.
 */
public class CostApp {

    public static void main(String[] args) {
        List<CostDataObject> costData = new ArrayList<>();

        costData.add(new CostDataObject("GAS",1.0,"GAS","keuro"));
        costData.add(new CostDataObject("ELEC",1.0,"ELEC","euro"));
        costData.add(new CostDataObject("WATER",1.0,"WATER","geuro"));
        costData.add(new CostDataObject("HEAT",1.0,"HEAT","meuro"));

        for (int i = 0, length = costData.size(); i < length; i++) {
            System.out.println(costData.get(i).toString());
        }

        Collections.sort(costData);
        System.out.println();

        for (int i = 0, length = costData.size(); i < length; i++) {
            System.out.println(costData.get(i).toString());
        }
    }


}
