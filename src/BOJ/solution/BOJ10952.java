package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str;

        while ((str = br.readLine()) != null) {
            String[] s = str.split(" ");
            int i = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            if (i != 0) {
                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}
