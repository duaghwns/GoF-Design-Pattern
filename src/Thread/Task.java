package Thread;

public class Task implements Runnable{

    @Override
    public void run() {
        int sum = 0;
        for(int i=0;i<10;i++){
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "최종 합 : " + sum);

    }
}
