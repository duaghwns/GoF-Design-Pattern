package PROGRAMERS.solution;

import java.util.*;

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();
        int i = 0;

        for(String user : id_list){
            Set<String> set = new HashSet<>();
            cnt.put(user, 0);
            for (String r : report) {
                String[] repo = r.split(" ");
                // 유저가 신고한 사람들
                if(user.equals(repo[0])){
                    set.add(repo[1]);
                    map.put(user, set);
                }
                // 신고 당한 횟수
                if (user.equals(repo[1])) {
                    cnt.put(user, cnt.get(user)+1);
                }
            }
        }

        for (String user : id_list) {
            int c = 0;
            if (map.get(user) != null) {
                for(String name : map.get(user)){
                    if (cnt.get(name) >= k) {
                        c++;
                    }
                }
            }
            if (answer.length < k) {
                answer[i] = 0;
            } else {
                answer[i] = c;
            }
            i++;
        }

        System.out.println(map);
        System.out.println(cnt);

        return answer;
    }


    public static void main(String[] args) {
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        int k = 2;
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        for (int i : solution(id_list, report, k)) {
            System.out.print(i +" ");
        }
    }
}
