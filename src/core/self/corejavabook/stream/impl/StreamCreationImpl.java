package core.self.corejavabook.stream.impl;

import core.self.corejavabook.stream.StreamCreation;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Created by KhoiNV6@vttek.vn on 2/12/19
 **/
public class StreamCreationImpl implements StreamCreation {
	public static void main(String[] args) {
		StreamCreation streamCreation = new StreamCreationImpl();
//		streamCreation.createStreamFromEmpty();
//		streamCreation.createStreamFromConstant();
//		streamCreation.createStreamFromRandom();
//		streamCreation.createStreamFromInfiniteIteration();
		streamCreation.createStreamFromFiniteIteration();
	}

	@Override
	public Stream createStreamFromEmpty() {
		System.out.println(Stream.empty().count());
		return null;
	}

	@Override
	public Stream createStreamFromConstant() {
		System.out.println(Stream.generate(() -> "Constants").findFirst().get());
		return null;
	}

	@Override
	public Stream createStreamFromRandom() {
		Stream.generate(() -> Math.random())
				.limit(10)
				.forEach(aDouble -> System.out.println(aDouble));
		return null;
	}

	@Override
	public Stream createStreamFromInfiniteIteration() {
		// Tao list cac so nguyen nho hon 1000, moi so cach nhau 10 don vi
		Stream.iterate(BigInteger.ZERO,
					n-> n.compareTo(BigInteger.valueOf(1000)) < 0,
					n -> n.add(BigInteger.valueOf(10)))
				.forEach(bigInteger -> System.out.println(bigInteger));
		return null;
	}

	@Override
	public Stream createStreamFromFiniteIteration() {
		// To stream tu array
		Stream.of("Nguyen", "Van", "Khoi")
				.forEach(s -> System.out.println(s));
		return null;
	}
}
