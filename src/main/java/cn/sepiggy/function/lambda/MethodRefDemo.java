package cn.sepiggy.function.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用匿名类方式, Lambda方式, 方法引用方式, 三种不同的方式实现对字符串数组排序
 */
public class MethodRefDemo {

    public static void main(String[] args) {
        String[] array = "Piping Randomly Generated Bytes from a Sender Thread to a Receiver Thread".split(" ");
        printArray(array);

        /**
         * 匿名类
         */
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String r1, String r2) {
                return r1.compareToIgnoreCase(r2);
            }
        });
        printArray(array);

        /**
         * Lambda 表达式
         */
        Arrays.sort(array, (s1, s2) -> {
            return s1.compareToIgnoreCase(s2);
        });
        printArray(array);

        /**
         * 方法引用
         */
        Arrays.sort(array, String::compareToIgnoreCase);
        printArray(array);

    }

    private static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
