package PROGRAMERS.skill_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 로또당첨여부_구하기 {

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Arrays.stream(lottos).sorted();
        Arrays.stream(win_nums).sorted();

        List<Integer> max = new ArrayList(Arrays.asList(lottos));
        List<Integer> min = new ArrayList(Arrays.asList(win_nums));

        max.forEach(i -> System.out.println(i));
        min.forEach(i -> System.out.println(i));

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,6,4,2,7,3}, new int[]{3, 2, 0, 6, 2, 3});
    }
}