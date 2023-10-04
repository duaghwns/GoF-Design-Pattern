package BOJ.solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * b);
    }

    public static class BOJ10818 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             int n = Integer.parseInt(br.readLine());

            String[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).sorted()
                    .mapToObj(String::valueOf).toArray(String[]::new);

            System.out.print(arr[0]+" "+arr[n-1]);
        }
    }
}
