package cn.sepiggy.function.stream;

import java.util.Arrays;

public class StreamBasic {

    public static void main(String[] args) {
        String[] array = "JDK Stream API supports functional-style operation".split(" ");

        // array -> stream
        long n = Arrays.stream(array)
                // 全大写
                .filter((s) -> s.equals(s.toUpperCase()))
                .count();

        System.out.println("How many words? " + n);
    }
}
