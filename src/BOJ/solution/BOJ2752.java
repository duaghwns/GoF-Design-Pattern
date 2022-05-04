package BOJ.solution;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        /*
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
         */
        List<Integer> list = new ArrayList<>();
        Integer[] arr;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(scanner.next());
                list.add(input);
        }
        arr = list.toArray(new Integer[0]);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
