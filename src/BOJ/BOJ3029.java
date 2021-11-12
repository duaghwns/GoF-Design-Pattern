package BOJ;

import java.util.Scanner;

public class BOJ3029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String currentInput = sc.nextLine();
        String waitInput = sc.nextLine();

        String[] currentTime = currentInput.split(":");
        String[] waitTime = waitInput.split(":");


        for (String dd:currentTime) {
        System.out.println(dd);
        }

        for (String dd:waitTime) {
            System.out.println(dd);
        }
    }
}
