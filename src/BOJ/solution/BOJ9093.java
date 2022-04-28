package BOJ.solution;

import java.util.Scanner;

public class BOJ9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] input = new String[num];
        String answer = "";
        int cnt = 0;

        for(int i=0;i<num;i++){
            input[i] = sc.nextLine();
            cnt = input[i].split(" ").length;
        }

        String[][] word = new String[num][cnt];
        String str ="";

        for(int i=0;i<num;i++){
            word[i] = input[i].split(" ");
            cnt--;
            for(int k=input[i].split(" ").length;k>=0;k--){
                for(int j = word[i][k].length(); j>=0; j--){
                    if(j != 0){
                        str += word[i][j].charAt(j);
                    } else {
                        str += " ";
                    }
                }
            str += "\n";
            }
        }
        System.out.println(str);
    }
}
