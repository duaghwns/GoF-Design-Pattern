package BOJ.solution;

import java.io.*;
import java.util.Arrays;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int[] index = {0};
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.stream(arr).sorted().forEach(i -> {
            try {
                if(index[0] <2){
                    bw.write(i+" ");
                } else {
                    bw.write(i+"");
                }
                index[0]++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        bw.flush();
        bw.close();
    }
}
