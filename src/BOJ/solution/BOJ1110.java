package BOJ.solution;

import java.io.*;

public class BOJ1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] arr = new String[2];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.charAt(i)+"";
            System.out.println(arr[i]);
        }

    }
}
