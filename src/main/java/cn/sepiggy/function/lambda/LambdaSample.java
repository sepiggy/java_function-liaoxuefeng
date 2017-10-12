package cn.sepiggy.function.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 同样的功能, 新旧两种写法
 */
public class LambdaSample {

    public static void main(String[] args) {
        String[] words = "Improving code with Lambda expressions in Java".split(" ");

        /**
         * 匿名类的写法
         */
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 忽略大小写排序
                return s1.toLowerCase().compareTo(s2.toLowerCase());
            }
        });

        /**
         * Lambda表达式的写法
         */
        Arrays.sort(words, (s1, s2) -> {
            // 忽略大小写排序
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        });

        System.out.println(Arrays.toString(words));
    }
}
