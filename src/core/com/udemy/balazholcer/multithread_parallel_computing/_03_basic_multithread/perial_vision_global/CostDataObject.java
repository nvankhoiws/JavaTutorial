package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/20173:51 PM.
 */
public class CostDataObject extends DataObject implements Comparable<CostDataObject> {

    public CostDataObject(String name, Double data, String fluid, String unit) {
        super(name, data, fluid, unit);
    }

    @Override
    public int compareTo(CostDataObject other) {
        normalizeDataObject(this, other, "cost");
        return (this.data > other.data) ? 1 : ((this.data < other.data) ? -1 : 0);
    }
}
