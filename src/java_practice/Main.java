package java_practice;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[6];
        int i=0;

        while(i<10000){
            int ranNum = random.nextInt(6)+1;
            switch (ranNum){
                case 1:
                    nums[0]++;
                    break;
                case 2:
                    nums[1]++;
                    break;
                case 3:
                    nums[2]++;
                    break;
                case 4:
                    nums[3]++;
                    break;
                case 5:
                    nums[4]++;
                    break;
                case 6:
                    nums[5]++;
                    break;
            }
            i++;
        }
        int cnt = 1;
        for(int count : nums){
            System.out.printf("%d번 : ",cnt);
            System.out.println(count);
            cnt++;
        }
    }
}
