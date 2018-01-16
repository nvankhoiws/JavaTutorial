package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

import java.util.Arrays;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/20173:13 PM.
 */
public abstract class DataObject implements VisionGlobalConstants {
    protected String name;

    protected Double data;

    protected String fluid;

    protected String unit;

    public DataObject(String name, Double data, String fluid, String unit) {
        if (name == null) name = EMPTY_STRING;
        this.name = name;
        if (data == null) data = 0.0;
        this.data = data;
        if (fluid == null) fluid = EMPTY_STRING;
        this.fluid = fluid.trim().toLowerCase();
        if (unit == null) unit = EMPTY_STRING;
        this.unit = unit.trim().toLowerCase();
    }

    protected void normalizeDataObject(DataObject o1, DataObject o2, String type){
        String o1_prefix_unit = o1.unit.replace(EURO, EMPTY_STRING);
        int o1_unitIndex = Arrays.asList(PREFIX_KEY).indexOf(o1_prefix_unit);

        String o2_prefix_unit = o2.unit.replace(EURO, EMPTY_STRING);
        int o2_unitIndex = Arrays.asList(PREFIX_KEY).indexOf(o2_prefix_unit);

        int common_unitIndex = (o1_unitIndex >= o2_unitIndex) ? o2_unitIndex : o1_unitIndex;
        String common_unit = (common_unitIndex == o2_unitIndex) ? o2.unit : o1.unit;
        o1.unit = o2.unit = common_unit;

        o1.data = o1.data * Math.pow(1000, o1_unitIndex - common_unitIndex);
        o2.data = o2.data * Math.pow(1000, o2_unitIndex - common_unitIndex);
    }
}
