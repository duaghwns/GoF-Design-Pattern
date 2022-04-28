package BOJ.solution;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2480 {
    public static int solution(String input){
        int answer = 0;

        String[] strInput = input.split(" ");
        int[] intInput = new int[strInput.length];

        int i = 0;
        for(String dd:strInput){
            intInput[i++] = Integer.parseInt(dd);
        }

    //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        if(intInput[1]==intInput[0] && intInput[1]==intInput[2]){
            answer = 10000 + (intInput[1] * 1000);
            return answer;
        }
    //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        else if(intInput[1]==intInput[0]||intInput[1]==intInput[2]){
            int val = intInput[1];
            answer = 1000 + val * 100;
            return answer;
    //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        } else if(intInput[1]!=intInput[0] && intInput[1]!=intInput[2]) {
            int max = Arrays.stream(intInput).max().getAsInt();
            answer = max * 100;
            return answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }
}
