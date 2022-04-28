package BOJ.solution;

import java.io.*;
import java.util.Stack;

public class BOJ10828_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        int num = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        for(int i=0;i<num;i++){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push":
                    stack.push(input[1]);
                    break;
                case "pop":
                    if(stack.empty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.pop()+"\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.empty()){
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "top":
                    if(stack.empty()){
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.peek()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
