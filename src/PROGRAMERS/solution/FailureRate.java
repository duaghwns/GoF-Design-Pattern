package PROGRAMERS.solution;

import java.util.*;

public class FailureRate {
    public static int[] solution(int N, int[] stages) {
        int len = stages.length;
        arrSort(stages);

        int[] COUNTING = {0, stages.length, 1}; // 0번은 갯수, 1번은 전체 갯수, 2번은 스테이지
        int[][] boonsoo = new int[N+1][3];
        Double[] sosoo = new Double[N+1];

        int n = 0;
        for(int i=0;i<len;i++){
            if(i<len-1){
                if(stages[i]==stages[i+1]&& stages[i]!=0){
                    ++COUNTING[0];
                } else if(stages[i] < stages[i+1]) {
                    boonsoo[n][0] = ++COUNTING[0]; // 분자
                    boonsoo[n][1] = COUNTING[1]; // 분모
                    boonsoo[n++][2] = COUNTING[2]++; // 스테이지
                    // 카운트 초기화
                    COUNTING[1] -= COUNTING[0]; // 전체 카운트 - 갯수
                    COUNTING[0] = 0; // 갯수 초기화
                } else if(stages[i]==0){
                    boonsoo[n][0] = 0;
                    boonsoo[n][1] = COUNTING[1];
                    boonsoo[n++][2] = COUNTING[2]++;
                    // 카운트 초기화
                    COUNTING[1] -= COUNTING[0];
                    COUNTING[0] = 0;
                }
            } else {
                if(stages[i]==N || N ==COUNTING[2]){
                    boonsoo[n][0] = ++COUNTING[0];
                    boonsoo[n][1] = COUNTING[1];
                    boonsoo[n++][2] = COUNTING[2]++;
                    // 카운트 초기화
                    COUNTING[1] -= COUNTING[0];
                    COUNTING[0] = 0;
                } else if(stages[i]==N+1){
                    boonsoo[++n][0] = ++COUNTING[0];
                    boonsoo[n][1] = COUNTING[1];
                    boonsoo[n][2] = ++COUNTING[2];
                }
            }

        }

        // 분수를 소수로 저장
        n = 0;
        for(int i=0;i<N+1;i++){
            sosoo[i] = Double.valueOf(boonsoo[n++][0] / boonsoo[n++][1]);
        }

        // 스테이지 별로 소수 값을 맵에 저장
        Map<Integer,Double> level = new HashMap<>();
        for(int i=0;i<N;i++){
            if(i==boonsoo[i][2]){
                level.put(boonsoo[i][2],sosoo[i]);
            } else if(boonsoo[i][2]==0) {
                level.put(boonsoo[i][2],0.0);
            }
        }

        // 맵을 정렬해서 리스트에 결과값 담기






        int[] answer = stages;
        return answer;
    }

    private static int[] arrSort(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int dd : arr) {
            list.add(dd);
        }
        Collections.sort(list);
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }


    public static void main(String[] args) {
        int N = 5;
        String[] input ={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        int[] stages = {2,1,2,6,2,4,3,3};
        for(int dd:solution(N,stages)){
            System.out.println(dd);
        }
    }
}
