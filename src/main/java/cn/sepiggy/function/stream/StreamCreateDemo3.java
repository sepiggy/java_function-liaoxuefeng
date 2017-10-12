package cn.sepiggy.function.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 通过其他类的相关方法创建
 */
public class StreamCreateDemo3 {

    public static void main(String[] args) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get("pom.xml"))) {
            lines.forEach(System.out::println);
        }
    }
}
