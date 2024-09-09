package java_study.혼자연습;

public class 정보처리산업기사문제 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int i=0;
        int n = 11;

        while (n > 0) {
            a[i++] = n%2;
            n /= 2;
        }

        for (i = 7; i >= 0; i--) {
            System.out.printf("%d", a[i]);
        }
    }
}
