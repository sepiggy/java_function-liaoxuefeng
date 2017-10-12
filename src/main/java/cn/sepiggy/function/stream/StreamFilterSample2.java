package cn.sepiggy.function.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFilterSample2 {

    public static void main(String[] args) {
        String[] array = {"Java", " Python ", " ", null, "\n\n", " Ruby "};
        Stream<String> normalized = Arrays.stream(array).filter(s -> s != null && !s.trim().isEmpty())
                .map(s -> s.trim());
        normalized.forEach(System.out::println);
    }
}
