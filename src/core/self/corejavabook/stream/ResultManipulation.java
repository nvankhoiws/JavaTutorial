package core.self.corejavabook.stream;

import java.util.stream.Stream;

/**
 * Created by KhoiNV6@vttek.vn on 2/12/19
 * Terminating a stream is also called reduction
 **/
public interface ResultManipulation<T> {

	Void forEach();

	Void forEachOrdered();

	Void toArray();

	Void collect();

	Void summarazing();

	Void collectIntoMap();

	Void groupBy();

	Void partitionBy();

	Void downStreamCollect();
}

