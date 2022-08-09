package BOJ.solution;

import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count=0;

        int[] A = new int[N * M];
        int[] B = new int[N * M];

        for (int i = 1; i <= M*N; i++) {
            A[i - 1] = sc.nextInt(); //A배열에 입력값을 담았다.
        }
        for (int i = 1; i <= M*N; i++) {
            B[i - 1] = sc.nextInt(); //B배열에 입력값을 담았다.
        }
        for (int k=1;k<=M;k++) {
            for (int i = 0; i <N; i++) {
                int R = A[count] + B[count];
                count++;
                System.out.print(R+" ");
            }
            sc.close();
        }
    }
}