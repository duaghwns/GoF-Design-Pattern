package PROGRAMERS.코딩테스트;

import java.util.Arrays;

public class 로또의_최고순위와_최저순위 {

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6,6};

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == 0) {
                    answer[0]--;
                    i++;
                } else {
                    if(lottos[i] == win_nums[j]){
                        answer[0]--;
                        answer[1]--;
                    }
                }
            }
        }

//        for (int i = 0; i < 2; i++) {
//            if(answer[i]==0) answer[i] = 1;
//        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        /*
            6 1등
            5 2등
            4 3등
            3 3등
            2 4등
            1 5등
            0 6등
         */
//        solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}); // 3 4
//        solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
//        solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
//        solution(new int[]{1,2,0,0,5,45}, new int[]{6,5,4,3,2,1});
//        solution(new int[]{0,2,0,0,5,0}, new int[]{6,5,4,3,2,1}); // 1 4
//        solution(new int[]{1,2,0,0,5,45}, new int[]{6,5,4,3,2,1}); // 2 3
//        solution(new int[]{1,2,3,4,5,6}, new int[]{6,5,4,3,2,1}); // 1
//        solution(new int[]{1,2,3,4,5,0}, new int[]{6,5,4,3,2,1}); // 2
//        solution(new int[]{1,2,3,4,0,0}, new int[]{6,5,4,3,2,1}); // 3
//        solution(new int[]{1,2,3,0,0,0}, new int[]{6,5,4,3,2,1}); // 4
//        solution(new int[]{1,2,0,0,0,0}, new int[]{6,5,4,3,2,1}); // 5
//        solution(new int[]{1,0,0,0,0,0}, new int[]{6,5,4,3,2,1}); // 6
        solution(new int[]{0,0,0,0,0,0}, new int[]{6,5,4,3,2,1}); // 1 6
        solution(new int[]{10,20,30,40,50,60}, new int[]{6,5,4,3,2,1}); // 6 6
        solution(new int[]{1,20,30,40,50,0}, new int[]{6,5,4,3,2,1}); // 5 6
        solution(new int[]{10,20,30,40,0,0}, new int[]{6,5,4,3,2,1}); // 6
        solution(new int[]{10,20,30,0,0,0}, new int[]{6,5,4,3,2,1}); // 6
        solution(new int[]{10,20,0,0,0,0}, new int[]{6,5,4,3,2,1}); // 6
        solution(new int[]{10,1,2,0,0,0}, new int[]{6,5,4,3,2,1}); // 6
    }
}