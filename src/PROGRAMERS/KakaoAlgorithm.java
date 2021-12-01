package PROGRAMERS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KakaoAlgorithm {
    public static String[] solution(String[] record) {
        int len = record.length;
        String[][] test = new String[len][3];
        Map<String, String> user = new HashMap<String,String>();
        int rstLen = 0;
        for(int i = 0; i < len; i++){
            test[i] = record[i].split(" ");
            if(test[i][0].equals("Enter")||test[i][0].equals("Change")){
                user.put(test[i][1],test[i][2]);
            }
            if(test[i][0].equals("Enter")||test[i][0].equals("Leave")){
                rstLen++;
            }
        }
        String[] answer = new String[rstLen];
        for(int i = 0; i < len; i++){
            if(test[i][0].equals("Enter")){
                answer[i] = user.get(test[i][1]) + "님이 들어왔습니다.";
            } else if(test[i][0].equals("Leave")) {
                answer[i] = user.get(test[i][1]) + "님이 나갔습니다.";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] asdf = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        for(String dd:solution(asdf)){
            System.out.println(dd);
        }
    }
}