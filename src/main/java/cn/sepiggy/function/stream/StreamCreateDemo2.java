package cn.sepiggy.function.stream;

import java.math.BigInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 通过 Supplier 创建无限序列
 */
public class StreamCreateDemo2 {

    public static void main(String[] args) {
        // 表示全体自然数的 Stream
        Stream<BigInteger> s = Stream.generate(new NaturalSupplier());

        // 无限序列变成有限序列才能正常操作
        s.limit(100)
                .forEach(System.out::println);
    }
}

class NaturalSupplier implements Supplier<BigInteger> {
    BigInteger next = BigInteger.ZERO;

    @Override
    public BigInteger get() {
        next = next.add(BigInteger.ONE);
        return next;
    }
}
