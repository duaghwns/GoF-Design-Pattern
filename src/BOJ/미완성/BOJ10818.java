package BOJ.미완성;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10818 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        String[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).sorted()
                .mapToObj(String::valueOf).toArray(String[]::new);

        for(int i = 0; i < n; i++) {
            if(i==0 || i==(n-1)) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
