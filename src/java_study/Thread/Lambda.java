package java_study.Thread;

public class Lambda {
    public static void main(String[] args) {
        Runnable task = () -> {
            int sum =0;
            for(int i=0;i<100;i++){
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread()+"최종 합 : " + sum);
        };
        Thread sub1 = new Thread(task);
        Thread sub2 = new Thread(task);

        sub1.start();
        sub2.start();
    }
}
