package BOJ.Bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BOJ1145 {
    /*
        적어도 대부분의 배수

     다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
      서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
    */
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(strArr[i]);
            System.out.print(arr[i]+" ");
        }




    }
}
