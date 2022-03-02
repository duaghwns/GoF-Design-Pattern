package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1564 {
    private static Long factorial(int num){
        Long rst = 1L;
        for(Long i=1L;i<=num;i++){
            rst *= i;
        }
        return rst;
    }

    private static int findByIndex(String str){
        int inx = 0;
        for(int i=str.length()-1;i>=0;i--) {
            if(str.charAt(i) != '0'){
                return i;
            }
        }
        return inx;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();
        StringBuffer rst = new StringBuffer();
        String input = String.valueOf(factorial(Integer.parseInt(br.readLine())));

        for(int i=0;i<=findByIndex(input);i++){
           stack.push(input.charAt(i));
        }
        for(int i=0;i<5;i++){
            rst.append(stack.pop());
        }
        System.out.print(rst.reverse());
    }
}
