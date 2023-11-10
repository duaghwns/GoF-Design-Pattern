package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/1157
public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == null){
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        String maxKey = null;
        int maxVal = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> ety : map.entrySet()) {
            if(ety.getValue() > maxVal) {
                maxKey = ety.getKey().toString();
                maxVal = ety.getValue();
            } else if (ety.getValue() == maxVal) {
                maxKey = "?";
            }
        }

        System.out.print(maxKey);
    }
}
