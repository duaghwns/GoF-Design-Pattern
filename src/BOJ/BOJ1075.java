package BOJ;

import java.util.Scanner;

public class BOJ1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        int c= a%b;

        System.out.println(c);

    }
}