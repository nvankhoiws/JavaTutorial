package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/20175:04 PM.
 */
public enum DataType {
    COST("cost_"),
    CONSO("conso_"),
    COSTBYCONSO("costbyconso_"),
    EMISSION("_water_"),
    EAU("_water_");

    private String _default = "";

    DataType(String type) {
        this._default = type;
    }
}
