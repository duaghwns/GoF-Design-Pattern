package PROGRAMERS.solution;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 신고결과받기2 {
    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();

        // 중복제거
        List<Object> list = Stream.of(Arrays.stream(report).distinct().toArray()).collect(Collectors.toList());

        for (String user : id_list) {
            // 신고받은 유저 0으로 초기화
            cnt.put(user, 0);

            ArrayList li = new ArrayList();

            for (Object obj : list) {
                String[] item = obj.toString().split(" ");

                // 사용자 신고
                if(user.equals(item[0])){
                    li.add((item[1]));
                    map.put(user, li);
                }
                // 신고받은 유저 카운트
                if (user.equals(item[1])) {
                    cnt.put(user, cnt.get(user) + 1);
                }
            }
        }

        int i=0;
        for(String user : id_list){
            int c = 0;
            if (map.get(user) != null) {
                for(String name : map.get(user)){
                    if (cnt.get(name) >= k) {
                        c++;
                    }
                }
            }
            answer[i] = c;
            i++;
        }

        System.out.println(map);
        System.out.println(cnt);
        return answer;
    }

    public static void main(String[] args) {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println("main : " + solution(idList,report,k));
    }
}
