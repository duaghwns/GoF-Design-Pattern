package BOJ.미완성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int i = Integer.parseInt(br.readLine());

        if (i % 4 == 0 && i % 100 != 0 && i % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}