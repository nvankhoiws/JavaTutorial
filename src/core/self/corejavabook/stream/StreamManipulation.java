package core.self.corejavabook.stream;

import java.util.stream.Stream;

/**
 * Created by KhoiNV6@vttek.vn on 2/12/19
 **/
public interface StreamManipulation<T> {

	Stream<T> filterStream();

	Stream<T> transformStreamByMap();

	Stream<T> transformStreamByFlatMap();

	Stream<T> subStreamByLimit();

	Stream<T> subStreamBySkip();

	Stream<T> subStreamByFilteringInByCondition();

	Stream<T> subStreamByFilteringOutByCondition();

	Stream<T> combineStreamByConcatination();

	Stream<T> removeDuplicate();

	Stream<T> sortingStream();

	Stream<T> peekStream();

}
