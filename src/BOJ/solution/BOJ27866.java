package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27866 {
    public static void main(String[] args) throws IOException{
        /**
         * 문제
         * 단어 S와 정수 i가 주어졌을 때,
         * S의 i번째 글자를 출력하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        System.out.println(s.charAt(n-1));
    }
}