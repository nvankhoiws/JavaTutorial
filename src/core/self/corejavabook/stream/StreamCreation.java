package core.self.corejavabook.stream;

import java.util.stream.Stream;

/**
 * Created by KhoiNV6@vttek.vn on 2/12/19
 **/
public interface StreamCreation<T> {

	Stream<T> createStreamFromEmpty();

	Stream<T> createStreamFromConstant();

	Stream<T> createStreamFromRandom();

	Stream<T> createStreamFromInfiniteIteration();

	Stream<T> createStreamFromFiniteIteration();

}
