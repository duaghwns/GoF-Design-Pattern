package BOJ.백준제출시복붙용;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] s = br.readLine().split(" ");

        MinMax minMax = new MinMax(0,0);

        for (int i = 0; i < arr.length; i++) {
            minMax.setMinMax(Integer.parseInt(s[i]));
        }

        System.out.print(minMax.returnMinMax());
    }

    static class MinMax {
        int min;
        int max;

        public void setMinMax(int n) {
            if(min == 0 || min > n) {
                min = n;
            }
            if(max < n) {
                max = n;
            }
        }

        public String returnMinMax() {
            return String.format("%d %d", min, max);
        }

        public MinMax(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }
}