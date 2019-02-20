package core.self.corejavabook.stream.impl;

import core.self.corejavabook.stream.StreamManipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
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
//		streamManipulation.transformStreamByFlatMap();
//		streamManipulation.subStreamByLimit();
//		streamManipulation.subStreamBySkip();
//		streamManipulation.subStreamByFilteringInByCondition();
//		streamManipulation.subStreamByFilteringOutByCondition();
//		streamManipulation.combineStreamByConcatination();
//		streamManipulation.removeDuplicate();
//		streamManipulation.sortingStream();
		streamManipulation.peekStream();
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
		Stream.of("Nguyen", "Van", "Khoi").flatMap(s -> codePoints(s).map(s1 -> s1+"-f1")).forEach(s -> System.out.println(s + "-f2"));
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
		Stream.generate(() -> Math.random())
				.limit(10)
				.forEach(aDouble -> System.out.println(aDouble));
		return null;
	}

	@Override
	public Stream subStreamBySkip() {
//		int[] indices = new int[1];
		Stream.generate(() -> Math.random())
				.limit(10)
				.skip(5)
				.forEach(aDouble -> System.out.println(aDouble));
		return null;
	}

	@Override
	public Stream subStreamByFilteringInByCondition() {
		// example 1
		Stream.iterate("", s -> s + "s")
				.takeWhile(s -> s.length() < 10)
				.forEach(s -> System.out.println(s));

		// example 2, can see method subStreamByFilteringOutByCondition to has opposite view to deeper understand this example
		Stream.of(2, 4, 6, 8, 9, 10, 12)
				.takeWhile(n -> n % 2 == 0)
				.forEach(System.out::println);

		return null;
	}

	@Override
	public Stream subStreamByFilteringOutByCondition() {
		Stream.of(2, 4, 6, 8, 9, 10, 12)
				.dropWhile(n -> n % 2 == 0)
				.forEach(System.out::println);
		return null;
	}

	@Override
	public Stream combineStreamByConcatination() {
		Stream.concat(Stream.of(2, 4, 6, 8, 9, 10, 12)
				.takeWhile(n -> n % 2 == 0),
				Stream.of(2, 4, 6, 8, 9, 10, 12)
						.dropWhile(n -> n % 2 == 0))
				.forEach(System.out::println);
		return null;
	}

	@Override
	public Stream removeDuplicate() {
		Stream.of("merrily", "gently", "merrily").distinct().forEach(System.out::println);
		return null;
	}

	@Override
	public Stream sortingStream() {
		Stream.of("merrily", "gently", "kjhkhkhkjhkjhkhk").sorted(Comparator.comparing(String::length)).forEach(System.out::println);

		Stream.of(2, 4, 6, 8, 9, 10, 12).sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(System.out::println);
		return null;
	}

	@Override
	public Stream peekStream() {
		// Call other stream
		Stream.iterate(1.0, p -> p * 2)
			.peek(e -> System.out.println("Fetching " + e))
			.limit(10).toArray();

		// For debugging
		Stream.iterate(1.0, p -> p * 2)
			.peek(e -> {
				return;})
			.limit(10).toArray();

		return null;
	}
}
