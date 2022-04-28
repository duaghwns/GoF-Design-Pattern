package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;

public class BOJ1564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputVal = br.readLine();
        br.close();

        // Factorial
        BigInteger big = BigInteger.valueOf(1);

        for(int i=1;i<=Integer.parseInt(inputVal);i++){
            big = big.multiply(BigInteger.valueOf(i));
        }

        // findByIndex
        int index = 0;

        for(int i=String.valueOf(big).length()-1;i>=0;i--) {
            if(String.valueOf(big).charAt(i) != '0') {
                index = i;
                break;
            }
        }

        Stack stack = new Stack();
        StringBuffer rst = new StringBuffer();

        for(int i=0;i<=index;i++){
            stack.push(String.valueOf(big).charAt(i));
        }

        for(int i=0;i<5;i++){
            if(!stack.empty()) rst.append(stack.pop());
        }
        System.out.print(rst.reverse());
    }
}