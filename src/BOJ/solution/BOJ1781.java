package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1781 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, List<Integer>> map = new HashMap<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if(map.containsKey(d)) {
                map.get(d).add(e);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(e);
                map.put(d, list);
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        Queue<Integer> pq = new PriorityQueue<>();
        for(int deadline : keySet) {
            for(int num : map.get(deadline)) {
                pq.add(num);
                while(pq.size()>deadline) {
                    pq.poll();
                }
            }
        }
        int total=0;
        while(!pq.isEmpty()) {
            total+= pq.poll();
        }
        System.out.println(total);
    }
}
