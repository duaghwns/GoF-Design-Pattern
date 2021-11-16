package PROGRAMERS;

import java.util.*;

class Solution {
    public static String[] solution(String[] record) {
        String[] answer = {};
        List<String> rsltAnswer = new ArrayList<>();
        List<String> inputStr = new ArrayList<>();
        List<String[]> rsltStr = new ArrayList<>();

        Map<String,String> user = new HashMap<>();

        for(int i=0;i< record.length;i++){
            inputStr.add(record[i]);
        }

        for (int i=0;i<inputStr.size();i++) {
            rsltStr.add(inputStr.get(i).split(" "));
        }

        for (int i=0;i<inputStr.size();i++) {
            if(rsltStr.get(i)[0].equals("Enter")){
                user.put(rsltStr.get(i)[1],rsltStr.get(i)[2]);
            } else if(rsltStr.get(i)[0].equals("Change")){
                user.remove(rsltStr.get(i)[1]);
                user.put(rsltStr.get(i)[1],rsltStr.get(i)[2]);
            }
        }

        for (int i=0;i<inputStr.size();i++) {
            if(rsltStr.get(i)[0].equals("Enter")){
                rsltAnswer.add(user.get(rsltStr.get(i)[1]) + "님이 들어왔습니다.");
            } else if(rsltStr.get(i)[0].equals("Leave")){
                rsltAnswer.add(user.get(rsltStr.get(i)[1]) + "님이 나갔습니다.");
            } else {
                continue;
            }
        }

        answer = new String[rsltAnswer.size()];
        int size = 0;
        for(String dd:rsltAnswer){
            answer[size++] = dd;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] asdf = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        asdf = solution(asdf);

        for(String dd:asdf){
            System.out.println(dd);
        }
    }
}