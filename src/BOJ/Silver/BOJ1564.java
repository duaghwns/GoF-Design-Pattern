package BOJ.Silver;

import java.util.Scanner;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = String.valueOf(factorial(sc.nextInt()));
        Stack stack = new Stack();
        String rst = "";

        for(int i=0;i<findByIndex(input)+1;i++){
           stack.push(input.charAt(i));
        }

        for(int i=0;i<5;i++){
            rst += stack.pop();

        }
        StringBuffer sb = new StringBuffer(rst);

//        System.out.println("input : " + input);
//        System.out.println("index : " + findByIndex(input));
//        System.out.println("rst : "+ rst);
        System.out.println(sb.reverse().toString());


    }
}
