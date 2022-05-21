package PROGRAMERS.solution;

import java.util.*;

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s : id_list){
            ArrayList<String> list = new ArrayList<>();
            for (String r : report) {
                String[] rs = r.split(" ");

                if(s.equals(rs[0])){
                    list.add(rs[1]);
                    map.put(s, list);
                }
            }
        }

        System.out.println(map);

        return answer;
    }


    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.println(solution(id_list,report,k));
    }
}
