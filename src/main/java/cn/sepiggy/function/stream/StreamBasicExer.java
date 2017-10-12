package cn.sepiggy.function.stream;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamBasicExer {

    public static void main(String[] args) {

        Stream<BigInteger> feiBoNaQi = Stream.generate(new Supplier<BigInteger>() {
            BigInteger n1 = BigInteger.ONE;
            BigInteger n2 = BigInteger.ONE;
            BigInteger n3;

            @Override
            public BigInteger get() {
                n3 = n1.add(n2);
                n1 = n2;
                n2 = n3;
                return n3;
            }
        });

        feiBoNaQi.limit(100)
                .forEach(System.out::println);
    }
}
