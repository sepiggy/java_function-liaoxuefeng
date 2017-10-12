package cn.sepiggy.function.stream;

import java.util.stream.Stream;

public class StreamReduceDemo {

    public static void main(String[] args) {
        Integer result;

        // 取第一个元素初始化 acc
        result = Stream.of(1, 2, 6, 8, 9).reduce((acc, n) -> acc + n).get();
        System.out.println(result);

        result = Stream.of(1, 2, 6, 8, 9).reduce((acc, n) -> acc * n).get();
        System.out.println(result);

        // 初始化 acc 为 1000
        result = Stream.of(1, 2, 6, 8, 9).reduce(1000, (acc, n) -> acc * n);
        System.out.println(result);
    }
}
