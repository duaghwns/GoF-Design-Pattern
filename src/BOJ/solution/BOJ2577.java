package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String str = a * b * c + "";
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<str.length(); i++){

            switch (str.charAt(i)+"") {
                case "0":
                    arr[0]++;
                    break;
                case "1":
                    arr[1]++;
                    break;
                case "2":
                    arr[2]++;
                    break;
                case "3":
                    arr[3]++;
                    break;
                case "4":
                    arr[4]++;
                    break;
                case "5":
                    arr[5]++;
                    break;
                case "6":
                    arr[6]++;
                    break;
                case "7":
                    arr[7]++;
                    break;
                case "8":
                    arr[8]++;
                    break;
                default:
                    arr[9]++;
            }
            ;
        }

        for (int s : arr) {
            System.out.println(s);
        }
    }
}
