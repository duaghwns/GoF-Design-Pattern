package PROGRAMERS.solution;

import java.util.*;

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> map = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(String repo : report){
            set.add(repo);
        }

        for(String user : id_list){
            cnt.put(user,0);
            List<String> list = new ArrayList<>();
            Iterator iter = set.iterator();

            while(iter.hasNext()){
                String[] a = iter.next().toString().split(" ");
                if(user.equals(a[0])){
                    list.add(a[1]);
                    map.put(user,list);
                }

                if (user.equals(a[1])) {
                    cnt.put(user, cnt.get(user)+1);
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
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 3;

        for (int i : solution(id_list, report, k)) {
            System.out.print(i +" ");
        }
    }
}
