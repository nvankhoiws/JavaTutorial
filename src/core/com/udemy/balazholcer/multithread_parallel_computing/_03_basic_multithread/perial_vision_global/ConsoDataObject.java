package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 1/17/20189:25 AM.
 */
public class ConsoDataObject extends DataObject implements Comparable<CostDataObject> {

    public ConsoDataObject(String name, Double data, String fluid, String unit) {
        super(name, data, fluid, unit);
    }

    @Override
    public int compareTo(CostDataObject other) {
        normalizeDataObject(this, other, "conso");
        return (this.data > other.data) ? 1 : ((this.data < other.data) ? -1 : 0);
    }
}
