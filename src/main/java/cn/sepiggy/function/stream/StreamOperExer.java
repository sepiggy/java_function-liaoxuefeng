package cn.sepiggy.function.stream;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class StreamOperExer {

    public static void main(String[] args) {
        Arrays.stream(new String[]{"HELLO", null, " ", "woRLD", " Java"})
                .filter(s -> {
                    if (StringUtils.isNotBlank(s)) {
                        return true;
                    }
                    return false;
                })
                .map(s -> {
                    String trim = s.trim();
                    String s1 = trim.substring(0, 1);
                    String s2 = trim.substring(1);
                    return s1.toUpperCase() + s2.toLowerCase();
                })
                .sorted()
                .forEach(s -> {
                    System.out.print(s + " ");
                });
        System.out.println();
    }
}
