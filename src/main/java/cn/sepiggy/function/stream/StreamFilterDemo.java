package cn.sepiggy.function.stream;

import java.util.stream.Stream;

public class StreamFilterDemo {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> s2 = s.filter((n) -> n % 2 == 1);
        s2.forEach(System.out::println);
    }
}
