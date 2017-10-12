package cn.sepiggy.function.stream;

import java.util.Arrays;

public class StreamReduceSample2 {

    public static void main(String[] args) {

        String[] array = "JDK Stream API supports functional-style operation".split(" ");
        String r = Arrays.stream(array).map(String::toLowerCase).reduce((acc, s) -> acc + " ~ " + s).get();
        System.out.println(r);
    }
}
