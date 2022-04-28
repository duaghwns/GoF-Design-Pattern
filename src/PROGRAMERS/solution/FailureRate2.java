package PROGRAMERS.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FailureRate2 {
    public static double[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        double[] rate = new double[N];
        Map<Integer,Double> map = new HashMap<Integer,Double>();

        int rateIndex = 0;
        int cnt = 0;
        int CNT = stages.length;
        for(int i=0;i<N;i++) {
            if(i<N-1) {
                if(stages[i]==stages[i++]) {
                    cnt++;
                } else {
                    rate[rateIndex++] = (double)cnt / (double) CNT;
                    CNT -= cnt;
                    cnt = 0;
                }
            }
        }



        return rate;
    }


    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};

        for(double dd: solution(N,stages)) {
            System.out.print(dd+" ");
        }
    }
}