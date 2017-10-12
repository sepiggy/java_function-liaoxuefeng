Demos for 廖雪峰 Java函数式编程[https://www.feiyangedu.com/course/1ap2ji3hj0ag08300028]
# Java 函数式编程
## 1 Lambda 表达式
### 1.1 Lambda 基础
1. Java方法分类
    - 实例方法 `boolean Integer.equals(Object o)`
    - 静态方法 `int Integer.parseInt(String s)`

2. Java的方法相当于过程式语言的函数, 其中实例方法隐含的传入一个`this`变量

3. 函数式编程:
    - 把函数作为基本运算单元
    - 函数可以作为变量
    - 函数可以接收函数
    - 函数可以返回函数
    
4. 引入 Lambda 表达式的两个好处
    - 简化单抽象方法接口的实现
    - 实现了类型的自动推断
    
5. 单抽象方法接口被称为函数式接口，标注为@FunctionalInterface

### 1.2 Method Reference
1. 定义: 如果某个方法签名(参数类型+返回值)和接口恰好一致, 可以直接传入方法引用, 形如`String::compareTo`

2. 需要 `Functional Interface` 的地方可以传入:
 - 接口的实现类 (代码较繁琐)
 - Lambda表达式
 - 方法引用
    - 符合方法签名的静态方法
    - 符合方法签名的实例方法 (实例类型被看做第一个参数类型)
    - 符合方法签名的构造方法 (实例类型被看做返回类型)

## 2 Stream
### 2.1 Stream 简介
1. java.util.stream: 顺序输出的任意 Java 对象

2. Stream 的特点:
    - 可以"存储"(已经存储或实时计算)有限个或无限个元素
    - 可以转换为另一个 Stream (而不是修改 Stream 本身)
    - 计算通常发生在最后结果的获取 (惰性计算)
    
3. 通常把 Stream 的操作写成链式结构

4. Stream API 的特点:
    - 提供了一套新的流式处理的抽象序列
    - 支持函数式编程／链式操作
    - Stream 可以表示无限序列，并且大多数情况下是惰性求值的
    
### 2.2 创建 Stream
1. 创建 Stream 的三种方法:
    - 通过指定元素／现有数组／现有 Collection 创建有限序列
      - Stream.of(T... t)
      - Arrays.stream(array)
      - collection.stream()
      
    - 通过 Supplier 创建无限序列
    
    - 通过其它类的相关方法创建
    
2. 基本类型的 Stream 有 IntStream／LongStream／DoubleStream

### 2.3 Stream.map
1. 将一个 Stream 的每个元素映射成另一个元素并生成一个新的 Stream

2. 可以将一种元素类型转换成另一种元素类型

### 2.4 Stream.filter
1. 将一个 Stream 的每个元素进行测试，通过测试的元素被过滤后生成一个新的 Stream

2. 用于排除不满足条件的元素

### 2.5 Stream.reduce
1. 将一个 Stream 的每个元素依次作用于 BiFunction，并将结果合并

2. reduce 是聚合方法, 把一个 Stream 的所有元素聚合成一个结果

3. 聚合方法会立刻对 Stream 进行运算

4. reduce 有两个重载方法, 提供初始值的和使用 Stream 的第一个元素作为默认初始值的

### 2.6 常用 Stream 操作
java.util.stream.Stream 提供了许多实用的功能：

1. 转换操作：map, filter, sorted, distinct

2. 合并操作：concat, flatMap

3. 并行处理：parallel

4. 聚合操作：reduce, count, max, min, sum, average

5. 其他操作：allMatch, anyMatch, forEach

6. Stream 转换为集合／数组类型：toArray, collect
