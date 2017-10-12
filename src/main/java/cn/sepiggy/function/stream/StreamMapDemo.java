package cn.sepiggy.function.stream;

import java.util.stream.Stream;

public class StreamMapDemo {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> s2 = s.map((n) -> n * n);
        s2.forEach(System.out::println);
    }
}
