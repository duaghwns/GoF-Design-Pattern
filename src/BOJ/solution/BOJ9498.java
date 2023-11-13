package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        if(s <= 100 && 90 <= s) {
            System.out.print("A");
        } else if(s <= 89 && s >= 80) {
            System.out.print("B");
        } else if(s <= 79 && s >= 70) {
            System.out.print("C");
        } else if(s <= 69 && s >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
