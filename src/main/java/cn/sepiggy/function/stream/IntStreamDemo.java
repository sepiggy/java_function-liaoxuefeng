package cn.sepiggy.function.stream;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {
        IntStream intStream = IntStream.generate(new IntSupplier() {
            int next = 99;

            @Override
            public int getAsInt() {
                next++;
                return next;
            }
        });


        intStream.limit(200)
                .forEach(System.out::println);
    }
}
