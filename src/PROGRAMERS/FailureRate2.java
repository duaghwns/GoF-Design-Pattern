package PROGRAMERS;

import java.util.Arrays;

public class FailureRate2 {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        double[] rate = new double[N];
        int CNT = stages.length;
        int rateIndex = 0;
        for(int i=0;i<N;i++){
            if(i<N-1){
                int cnt = 0;
                if(stages[i]==stages[i++]){
                    cnt++;
                } else {
                    rate[rateIndex++] = cnt / CNT;
                    CNT -= cnt;
                }
            }
        }
        return stages;
    }


    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};

        for(int dd: solution(N,stages)){
            System.out.print(dd+" ");
        }
    }
}