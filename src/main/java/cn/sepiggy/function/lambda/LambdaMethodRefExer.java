package cn.sepiggy.function.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.*;

public class LambdaMethodRefExer {

    public static void main(String[] args) throws Exception {
        String[] array = new String[] { "Orange", "apple", "blackberry", "Pear" };
        ExecutorService executor = Executors.newCachedThreadPool();
        // 忽略大小写异步排序:
        Future<String[]> f = executor.submit(() -> {
            String[] copy = Arrays.copyOf(array, array.length);
            Arrays.sort(copy, Comparator.comparing(String::toLowerCase));
            return copy;
        });
        System.out.println("Original: " + Arrays.toString(array));
        System.out.println("  Sorted: " + Arrays.toString(f.get()));
        executor.shutdown();
    }
}
