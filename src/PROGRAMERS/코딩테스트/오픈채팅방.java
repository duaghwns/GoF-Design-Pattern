package PROGRAMERS.코딩테스트;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    static String[] solution(String[] record) {
        String[][] arr = new String[record.length][3];
        List<String> rst = new ArrayList<>();
        Map<String, String> user = new HashMap<>();

        for(int i = 0; i < record.length; i++){
            arr[i] = record[i].split(" ");

            if( "Enter".equals(arr[i][0]) || "Change".equals(arr[i][0]) ) {
                user.put(arr[i][1],arr[i][2]);
            }
        }

        for(int i = 0; i < record.length; i++){
                 if("Enter".equals(arr[i][0])) rst.add(user.get(arr[i][1]) + "님이 들어왔습니다.");
            else if("Leave".equals(arr[i][0])) rst.add(user.get(arr[i][1]) + "님이 나갔습니다.");
        }

        return rst.toArray(new String[rst.size()]);
    }
}
