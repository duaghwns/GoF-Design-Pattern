package BOJ.solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1373 {
    // 2진수 8진수로 변환하기
    // https://www.acmicpc.net/problem/1373
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        String rtn = "";

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() / 3; i++) {
            list.add(str.substring(len-3 , len));
            rtn = convertBinaryToDecimal(str.substring(len-3 , len)) + rtn;
            len = len -3;
        }

        if(len % 3 > 0) {
            rtn = convertBinaryToDecimal(str.substring(0, len % 3)) + rtn;
        }


        System.out.println(rtn);
    }


    private static String convertBinaryToDecimal(String str) {
        int a = 0;

        switch (str.length()){
            case 3:
                if(str.charAt(0) == '1') {
                    a += 4;
                }
                if(str.charAt(1)== '1'){
                    a += 2;
                }
                if(str.charAt(2) == '1') {
                    a += 1;
                }
                break;
            case 2:
                if(str.charAt(0)== '1'){
                    a += 2;
                }
                if(str.charAt(1) == '1') {
                    a += 1;
                }
                break;
            case 1:
                if(str.charAt(0) == '1') {
                    a += 1;
                }
                break;
        }

        return a + "";
    }
}
