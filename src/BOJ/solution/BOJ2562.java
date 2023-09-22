package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MaximumValue maximumValue = new MaximumValue(0,0);
        int[] arr = new int[9];

        int length = arr.length;

        for(int i = 0; i< length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        for (int i = 0; i < length; i++) {
            if (maximumValue.getValue() < arr[i]) {
                maximumValue.setValue(arr[i]);
                maximumValue.setIndex(i+1);
            }
        }

        System.out.println(maximumValue.getValue());
        System.out.println(maximumValue.getIndex());
    }

    private static class MaximumValue {
        private int value;
        private int index;

        public MaximumValue(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}
