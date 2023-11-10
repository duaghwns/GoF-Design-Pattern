package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2439 {
    public static void main(String[] args) throws IOException {
        /**
         * 별 찍기 - 2
         * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
         * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i < n; i++) {
            for(int ii=0; ii < n; ii++) {
                if((n-i-1)>ii) {
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
            }
            if((n-1)>i) {
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}