package test;

public class ThreadTestMain {
    public static void main(String[] args) {
        Runnable task = new Task();
        Thread subThread1 = new Thread(task);
        Thread subThread2 = new Thread(task);
        Thread subThread3 = new Thread(task);

        subThread1.start();
        subThread2.start();
        subThread3.start();
    }
}
