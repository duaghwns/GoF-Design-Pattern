package BOJ.solution;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        final int H = 24;
        final int M = 60;
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        h = m > M ? h : h - 1;
        h = 0 > h ? H - 1 : h;
        m = m > M ? m : (M - 45) + m;
        h = m == M ? 1 : h;
        m = m == M ? 0 : m;

        System.out.printf("%d %d", h,m);
        sc.close();
    }
}
