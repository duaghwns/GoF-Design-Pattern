package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int qty = Integer.parseInt(br.readLine());

        for(int i=0;i<qty;i++){
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);

            for(int ii = 0;ii < s[1].length(); ii++){
                for(int iii=0; iii< n; iii++){
                    sb.append(s[1].charAt(ii));
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}