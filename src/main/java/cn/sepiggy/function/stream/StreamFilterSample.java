package cn.sepiggy.function.stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFilterSample {

    public static void main(String[] args) {
        Stream<Long> natural = Stream.generate(new NaturalSupplier2());
        Stream<Long> odd = natural.filter((n) -> n % 2 == 1);
        odd.limit(20).forEach(System.out::println);
    }
}

class NaturalSupplier2 implements Supplier<Long> {
    long x = 0;

    @Override
    public Long get() {
        return ++x;
    }
}
