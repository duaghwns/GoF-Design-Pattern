package PROGRAMERS.코딩테스트;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    public static String[] solution(String[] record) {

        int len = record.length;
        String[][] arr = new String[len][3];
        List<String> rst = new ArrayList<>();
        Map<String, String> user = new HashMap<>();

        for(int i = 0; i < len; i++){
            arr[i] = record[i].split(" ");
            if(arr[i][0].equals("Enter")||arr[i][0].equals("Change")){
                user.put(arr[i][1],arr[i][2]);
            }
        }

        for(int i = 0; i < len; i++){
            if(arr[i][0].equals("Enter")){ rst.add(user.get(arr[i][1]) + "님이 들어왔습니다."); }
            else if(arr[i][0].equals("Leave")) { rst.add(user.get(arr[i][1]) + "님이 나갔습니다."); }
        }

        String[] answer = new String[rst.size()];

        int i=0;

        for(String str : rst){
            answer[i++] = str;
        }

        return answer;
    }
}
