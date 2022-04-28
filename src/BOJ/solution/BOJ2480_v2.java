package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2480_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        int bigger = 0, sameNum = 0, money = 0;
        String[] input = br.readLine().split(" ");

        int i=0;
        while(i<input.length){
            if(i<2){
                if(input[i]==input[i+1]){
                    sameNum = Integer.parseInt(input[i]);
                    cnt++;
                }
                bigger = i>bigger?Integer.parseInt(input[i]):bigger;
            }
            i++;
        }

        switch(cnt){
            case 3: money += sameNum * 1000 + 10000; break;
            case 2: money += sameNum * 100 + 1000; break;
            case 1: money += bigger * 100; break;
        }

        System.out.println(money);
    }
}
