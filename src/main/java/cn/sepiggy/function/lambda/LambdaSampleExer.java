package cn.sepiggy.function.lambda;

public class LambdaSampleExer {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start new thread with 匿名内部类...");
            }
        });

        t.start();

        t = new Thread(() -> {
            System.out.println("start new thread with Lambda表达式...");
        });

        t.start();
    }
}
