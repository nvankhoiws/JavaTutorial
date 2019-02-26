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
//        streamTermination.terminateByMax();
//        streamTermination.terminateByMin();
//        streamTermination.terminateByFindFirst();
//        streamTermination.terminateByFindAny();
//        streamTermination.terminateByAnyMatch();
//        streamTermination.terminateByAllMatch();
        streamTermination.terminateByNoneMatch();
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
//        max = Optional.empty();
        System.out.println(max.orElse(new BigInteger(String.valueOf(BigInteger.TEN))));
        return Optional.empty();
    }

    @Override
    public Optional terminateByMin() {
        Optional<BigInteger> min = Stream.iterate(BigInteger.ZERO,
                n-> n.compareTo(BigInteger.valueOf(1000)) < 0,
                n -> n.add(BigInteger.valueOf(10)))
                .min(Comparator.comparing(BigInteger::intValue));
//        min = Optional.empty();
        System.out.println(min.orElse(new BigInteger(String.valueOf(BigInteger.TEN))));
        return Optional.empty();
    }

    @Override
    public Optional terminateByFindFirst() {
        Optional<String> stringOptional = Stream.of("Nguyen", "Van", "Khoi").findFirst();
        stringOptional = Optional.empty();
            stringOptional.ifPresentOrElse(s -> System.out.println(s), () -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Wake up after sleeping 3000ms");
            });
        return Optional.empty();
    }

    @Override
    public Optional terminateByFindAny() {
        Optional<String> stringOptional = Stream.of("empty", "Nguyen", "Van", "Khoi").findAny();
        stringOptional = Optional.empty();
        stringOptional.ifPresentOrElse(s -> System.out.println(s), () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            terminateByMax();
        });
        return Optional.empty();
    }

    @Override
    public Optional terminateByAnyMatch() {
        boolean b = Stream.of("empty", "Nguyen", "Van", "Khoi").anyMatch(s -> {
                    System.out.println("The predicate is evaluated");
                    System.out.println(s);
                    return "NguyenVanKhoi".contains(s);
                });
        System.out.println(b);
        return Optional.empty();
    }

    @Override
    public Optional terminateByAllMatch() {
        boolean b = Stream.of("empty", "Nguyen", "Van", "Khoi").allMatch(s -> {
            System.out.println("The predicate is evaluated");
            System.out.println(s);
            return "NguyenVanKhoi".contains(s);
        });
        System.out.println(b);
        return Optional.empty();
    }

    @Override
    public Optional terminateByNoneMatch() {
        boolean b = Stream.of("empty", "Nguyen", "Van", "Khoi").noneMatch(s -> {
            System.out.println("The predicate is evaluated");
            System.out.println(s);
//            boolean bi = "".contains(s);
            boolean bi = s.length() > 10;
            System.out.println(bi);
            return bi;
        });
        System.out.println(b);
        return Optional.empty();
    }
}
