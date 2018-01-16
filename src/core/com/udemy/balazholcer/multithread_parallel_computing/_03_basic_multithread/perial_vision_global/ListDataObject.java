package core.com.udemy.balazholcer.multithread_parallel_computing._03_basic_multithread.perial_vision_global;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/25/20174:58 PM.
 */
public class ListDataObject <T extends DataObject> {

    private String name;

    List<T> data;

    public ListDataObject(String name, List<T> data) {
        this.name = name;
        this.data = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public List<T> getData() {
        return data;
    }
}
