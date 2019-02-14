package core.self.corejavabook.stream.impl;

import core.self.corejavabook.stream.StreamManipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by KhoiNV6@vttek.vn on 2/12/19
 **/
public class StreamManipulationImpl implements StreamManipulation {

	public static void main(String[] args) {
		StreamManipulation streamManipulation = new StreamManipulationImpl();
//		streamManipulation.filterStream();
//		streamManipulation.transformStreamByMap();
		streamManipulation.transformStreamByFlatMap();
//		streamManipulation.subStream();
//		streamManipulation.combineStream();
//		streamManipulation.removeDuplicate();
//		streamManipulation.sortingStream();
//		streamManipulation.peekStream();
	}
	@Override
	public Stream filterStream() {
		Stream.iterate(BigInteger.ZERO,
					n-> n.compareTo(BigInteger.valueOf(1000)) < 0,
					n -> n.add(BigInteger.valueOf(10)))
				.filter(bigInteger -> bigInteger.compareTo(BigInteger.valueOf(910)) > 0)
				.forEach(bigInteger -> System.out.println(bigInteger));
		return null;
	}

	@Override
	public Stream transformStreamByMap() {
		Stream.iterate(BigInteger.ZERO,
					n-> n.compareTo(BigInteger.valueOf(1000)) < 0,
					n -> n.add(BigInteger.valueOf(10)))
				.filter(bigInteger -> bigInteger.compareTo(BigInteger.valueOf(910)) > 0)
				.map(bigInteger -> String.valueOf("string of "  + bigInteger))
				.forEach(s -> System.out.println(s));
		return null;
	}

	@Override
	public Stream transformStreamByFlatMap() {
		// By Map
		Stream.of("Nguyen", "Van", "Khoi").map(s -> s+"-f").forEach(s -> System.out.println(s));
		// stream of stream
		Stream.of("Nguyen", "Van", "Khoi").map(s -> codePoints(s)).forEach(s -> s.forEach(value -> System.out.println(value) ));
		// stream of stream be replaced by flatmap
		Stream.of("Nguyen", "Van", "Khoi").flatMap(s -> codePoints(s)).forEach(s -> System.out.println(s + "-f"));
		return null;
	}

	public static Stream<String> codePoints(String s) {
		List<String> result = new ArrayList<>();
		int i = 0;
		while (i < s.length()) {
			int j = s.offsetByCodePoints(i, 1);
			result.add(s.substring(i, j));
			i = j;
		}
		return result.stream();
	}

	@Override
	public Stream subStreamByLimit() {

		return null;
	}

	@Override
	public Stream subStreamBySkip() {
		return null;
	}

	@Override
	public Stream subStreamByFilteringInByCondition() {
		return null;
	}

	@Override
	public Stream subStreamByFilteringOutByCondition() {
		return null;
	}

	@Override
	public Stream combineStreamByConcatination() {
		return null;
	}

	@Override
	public Stream removeDuplicate() {
		return null;
	}

	@Override
	public Stream sortingStream() {
		return null;
	}

	@Override
	public Stream peekStream() {
		return null;
	}
}
