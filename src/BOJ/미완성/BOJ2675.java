package BOJ.미완성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        char[] arr = new char[str.length()];

        str.getChars(0,str.length(),arr,0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i]);
            }
        }
    }
}
