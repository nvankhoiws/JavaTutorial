package core.self.corejavabook.stream.impl;

import core.self.corejavabook.stream.StreamTermination;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminationImpl implements StreamTermination {
    public static void main(String[] args) {
        StreamTerminationImpl streamTermination = new StreamTerminationImpl();
//        streamTermination.terminateByCount();
        streamTermination.terminateByMax();
    }

    @Override
    public Void terminateByCount() {
        long counter = Stream.iterate(BigInteger.ZERO,
                n-> n.compareTo(BigInteger.valueOf(1000)) < 0,
                n -> n.add(BigInteger.valueOf(10)))
                .count();
        System.out.println(counter);
        return null;
    }

    @Override
    public Optional terminateByMax() {
        Optional<BigInteger> max = Stream.iterate(BigInteger.ZERO,
                n-> n.compareTo(BigInteger.valueOf(1000)) < 0,
                n -> n.add(BigInteger.valueOf(10)))
                .max(Comparator.comparing(BigInteger::intValue));
        max = new Optional<>()
        System.out.println(max.orElse(new BigInteger(String.valueOf(BigInteger.TEN))));
        return Optional.empty();
    }

    @Override
    public Optional terminateByMin() {
        return Optional.empty();
    }

    @Override
    public Optional terminateByFindFirst() {
        return Optional.empty();
    }

    @Override
    public Optional terminateByFindAny() {
        return Optional.empty();
    }

    @Override
    public Optional terminateByAnyMatch() {
        return Optional.empty();
    }

    @Override
    public Optional terminateByAllMatch() {
        return Optional.empty();
    }

    @Override
    public Optional terminateByNoneMatch() {
        return Optional.empty();
    }
}
