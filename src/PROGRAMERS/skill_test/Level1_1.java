package PROGRAMERS.skill_test;

import java.util.Scanner;

public class Level1_1 {
    static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = n > m ? m : n;
        int dd = 0;
        for (int i=1;i<=min;i++){
            if(n % i == 0 && m % i == 00) dd = i;
        }
        answer[0] = dd;
        answer[1] = n * m / dd;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(),sc.nextInt()));
        sc.close();
    }
}
