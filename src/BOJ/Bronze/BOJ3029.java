package BOJ.Bronze;

import java.util.Scanner;

public class BOJ3029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String currentInput = sc.nextLine();
        String waitInput = sc.nextLine();

        String[] currentTime = currentInput.split(":");
        String[] waitTime = waitInput.split(":");

        int[] intCurrent = new int[currentTime.length];
        int[] intWait = new int[waitTime.length];

        int j = 0;
        for (String dd:currentTime) {
            intCurrent[j] = Integer.parseInt(dd);
            j++;
        }
        j=0;
        for (String dd:waitTime) {
            intWait[j] = Integer.parseInt(dd);
            j++;
        }

        final int HH = 24;
        final int MMSS = 60;
        int hh = 0;
        int mm = 0;
        int ss = 0;

        if(intCurrent[0]>intWait[0]){
            hh = HH - intCurrent[0] + intWait[0];
        } else {
            hh = intWait[0] - intCurrent[0];
        }

        if(intCurrent[1]>intWait[1]){
            mm = MMSS - intCurrent[1] + intWait[1];
        } else {
            mm = intWait[1] - intCurrent[1];
        }

        if(intCurrent[2]>intWait[2]){
            ss = MMSS - intCurrent[2] + intWait[2];
            mm--;
        } else {
            ss = intWait[2] - intCurrent[2];
        }
        String rst ="";
        rst += hh>10 ? String.valueOf(hh):"0" + hh;
        rst += ":";
        rst += mm>10 ? String.valueOf(mm):"0" + mm;
        rst += ":";
        rst += ss>10 ? String.valueOf(ss):"0" + ss;

        System.out.println(rst);
    }
}