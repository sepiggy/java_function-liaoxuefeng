package cn.sepiggy.function.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperDemo {

    public static void main(String[] args) {

        /**
         * 排序
         */
        // 按元素默认大小排序
        Stream.of(88, 23, 56, 99, 101)
                .sorted()
                .forEach(System.out::println);


        // 按指定 Comparator 比较的结果排序
        Stream.of(88, 23, 56, 99, 101)
                .sorted((i1, i2) -> {
                    if (i1 == i2) {
                        return 0;
                    }
                    return i1 > i2 ? -1 : 1;
                }).forEach(System.out::println);


        /**
         * 去除重复元素
         */
        Stream.of(1, 2, 5, 2, 6, 5, 7)
                .distinct()
                .forEach(System.out::println);

        /**
         * 截取
         */
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .limit(5)
                .forEach(System.out::println);

        /**
         * 跳过
         */
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .skip(5)
                .forEach(System.out::println);

        /**
         * 合并
         */
        Stream<Integer> concat = Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6));
        concat.forEach(System.out::println);

        /**
         * flatMap 方法把元素映射为 Stream 然后合并成一个新的 Stream
         */
        // Stream 的元素本身是一个 List<Integer>
        Stream<List<Integer>> s = Stream.of(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        // 可将元素转换为 Integer
        Stream<Integer> i = s.flatMap(list -> list.stream());
        i.forEach(System.out::println);

        /**
         * 聚合
         */
        System.out.println("count: " + Stream.of(11, 22, 33, 44, 55).count());
        System.out.println("max: " + Stream.of(11, 22, 33, 44, 55).max((i1, i2) -> {
            if (i1 == i2) return 0;
            return i1 > i2 ? 1 : -1;
        }).get());
        System.out.println("min: " + Stream.of(11, 22, 33, 44, 55).min((i1, i2) -> {
            if (i1 == i2) return 0;
            return i1 > i2 ? 1 : -1;
        }).get());
        System.out.println("sum: " + IntStream.of(11, 22, 33, 44, 55).sum());
        System.out.println("average: " + IntStream.of(11, 22, 33, 44, 55).average().getAsDouble());

        /**
         * 测试 Stream 的元素是否满足一定的条件
         */
        System.out.println("is all match: " + IntStream.of(-1, -2, 3, 4, 5).allMatch(value -> {
            if (value > 0) {
                return true;
            }
            return false;
        }));

        System.out.println("is any match: " + IntStream.of(-1, -2, 3, 4, 5).anyMatch(value -> {
            if (value > 0) {
                return true;
            }
            return false;
        }));

        /**
         * 循环处理 Stream 的每个元素
         */
        Stream.of("Java", "Python", "Go").forEach(s1 -> System.out.println("Hello, " + s1));

        /**
         * 把 Stream 转换为数组或 List/Set
         */
        Object[] array = Stream.of("1", "2", "3").toArray();
        String[] strings = Stream.of("1", "2", "3").toArray(String[]::new);
        List<Integer> list = Stream.of(1, 2, 3).collect(Collectors.toList());

        IntStream.range(1, 10).filter(a -> a % 2 == 0).forEach(System.out::println);
    }
}

