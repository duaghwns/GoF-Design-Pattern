package PROGRAMERS.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 신고결과받기2 {
    static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        HashSet<String> set = new HashSet();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Set> singo = new HashMap<>();
        StringTokenizer st;
        for (String s : report) {

        }



        return answer;
    }

    public static void main(String[] args) {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.println(solution(idList,report,k));
    }
}
