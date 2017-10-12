package cn.sepiggy.function.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 通过指定元素／现有数组／现有 Collection 创建
 */
public class StreamCreateDemo1 {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        s = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});
        s = Arrays.asList(1, 2, 3, 4, 5).stream();
        s.forEach(System.out::print);
        System.out.println();
    }

}

