package BOJ.미완성;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[Integer.parseInt(br.readLine())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                for (int j = 0; j < arr[i].length(); j++) {
                    sb.append(arr[i].charAt(j));
                }
            } else {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (sb.charAt(j) != arr[i].charAt(j)) {
                        sb.replace(j, j + 1, "?");
                    }
                }
            }
        }

        System.out.print(sb.toString());
    }
}