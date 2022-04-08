package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1373 {
    // 2진수 8진수로 변환하기
    // https://www.acmicpc.net/problem/1373
    public static void main(String[] args) throws Exception {
        List<String> substr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rst = br.readLine();
        int num;

        switch (rst.length() % 3){
            case 2: rst = "0" + rst; break;
            case 1: rst = "00" + rst; break;
        }

        for(int i=0;i<rst.length();i++){
            if(i+3<=rst.length() && i%3==0){
                substr.add(rst.substring(i, i+3));
            }
        }

        rst = "";

        for (int i = 0; i < substr.size(); i++) {
            num = substr.get(i).charAt(2)=='1' ? 1:0;
            num += substr.get(i).charAt(1)=='1' ? 2:0;
            num += substr.get(i).charAt(0)=='1' ? 4:0;
            rst += num + "";
        }
        System.out.println(rst);
    }
}
