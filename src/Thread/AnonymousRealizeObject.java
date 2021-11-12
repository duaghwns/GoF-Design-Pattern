package Thread;

public class AnonymousRealizeObject {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i=0;i<10;i++){
                    sum += i;
                    System.out.println(sum);
                }
                System.out.println(Thread.currentThread()+ "최종 합 : " + sum);
            }
        };
        Thread sub1 = new Thread(task);
        Thread sub2 = new Thread(task);

        sub1.start();
        sub2.start();
    }
}
