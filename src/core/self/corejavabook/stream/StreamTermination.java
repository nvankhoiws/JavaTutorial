package core.self.corejavabook.stream;

import java.util.Optional;

/**
 * Created by KhoiNV6@vttek.vn on 2/12/19
 **/
public interface StreamTermination<T> {

	Void terminateByCount();

	Optional<T> terminateByMax();

	Optional<T> terminateByMin();

	Optional<T> terminateByFindFirst();

	Optional<T> terminateByFindAny();

	Optional<T> terminateByAnyMatch();

	Optional<T> terminateByAllMatch();

	Optional<T> terminateByNoneMatch();
}
