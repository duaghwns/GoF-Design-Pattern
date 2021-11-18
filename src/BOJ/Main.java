package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ii = new int[3];
        int i = 0;

        boolean tt = true;
        do {
            String input = sc.nextLine();
            ii[i++] = Integer.parseInt(input.split(" ")[i++]);
            if(i==2) tt = false;
        } while(tt);

        i=0;
        if(ii[1]==ii[0] && ii[1]==ii[2]){
            i = 10000 + (ii[1] * 1000);
        }
        else if(ii[1]==ii[0]||ii[1]==ii[2]){
            int v = ii[1];
            i = 1000 + v * 100;
        } else if(ii[1]!=ii[0] && ii[1]!=ii[2]) {
            int max = Arrays.stream(ii).max().getAsInt();
            i = max * 100;
        }
        System.out.println(i);
    }
}