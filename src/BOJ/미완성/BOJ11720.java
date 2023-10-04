package BOJ.미완성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int rst = 0;
        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            rst += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        System.out.print(rst);
    }
}
