package PROGRAMERS.solution;

import java.util.Arrays;

class Solution {
    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == 0) {
                    answer[0]++;
                    i++;
                } else {
                    if(lottos[i] == win_nums[j]){
                        answer[0]++;
                        answer[1]++;
                    }
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            switch (answer[i]){
                case 6: answer[i] = 1; break;
                case 5: answer[i] = 2; break;
                case 4: answer[i] = 3; break;
                case 3: answer[i] = 4; break;
                case 2: answer[i] = 5; break;
                default: answer[i] = 6;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        /*
            6 1등
            5 2등
            4 3등
            3 4등
            2 5등
            1 6등
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
        solution(new int[]{10,0,0,0,0,0}, new int[]{6,5,4,3,2,1}); // 6
    }
}