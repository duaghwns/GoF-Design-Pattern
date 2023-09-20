package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(":");
        String[] b = br.readLine().split(":");

        int now = Integer.parseInt(a[0]) * 3600 + Integer.parseInt(a[1]) * 60 + Integer.parseInt(a[2]);
        int target = Integer.parseInt(b[0]) * 3600 + Integer.parseInt(b[1]) * 60 + Integer.parseInt(b[2]);

        int rst = target - now;

        if (rst < 0) {
            rst += 24 * 3600;
        }

        int h = rst / 3600;
        int m = (rst % 3600) / 60;
        int s = (rst % 3600) % 60;

        if(h == 0 && m == 0 && s == 0) {
            h = 24;
        }
        
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}