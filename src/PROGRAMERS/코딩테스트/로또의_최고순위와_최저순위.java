package PROGRAMERS.코딩테스트;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 로또의_최고순위와_최저순위 {

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6,6};

        List<Integer> l_lottos = Arrays.stream(lottos).sorted().boxed().collect(Collectors.toList());
        List<Integer> l_win = Arrays.stream(win_nums).sorted().boxed().collect(Collectors.toList());

        for (int i = 0; i < l_lottos.size(); i++) {
            for (int j = 0; j < l_win.size(); j++) {

                if(l_lottos.get(i) == 0) {
                    answer[0]--;
                    i++;
                    if(i==l_lottos.size()-1) break;
                } else {
                    if(l_lottos.get(i)==l_win.get(j)){
                        answer[0]--;
                        answer[1]--;
                    }
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25});
        solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35});
        solution(new int[]{1,2,0,0,5,6}, new int[]{6,5,4,3,2,1});
    }
}