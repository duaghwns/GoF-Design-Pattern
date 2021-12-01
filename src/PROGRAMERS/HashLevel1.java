package PROGRAMERS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashLevel1 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,String> human = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0;i<participant.length;i++){
            list.add(participant[i]);
        }
        for(int j=0;j< completion.length;j++){
            list.remove(completion[j]);
        }

        for(int i=0;i<human.size();i++){
            answer += list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] asdf = {"kiki", "eden","leo"};
        String[] aaaa = {"kiki", "eden"};
        System.out.println(solution(asdf,aaaa));
    }
}
