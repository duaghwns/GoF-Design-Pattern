package BOJ.Silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] input = new String[num];

        for(int i=0;i<num;i++){
            input[i] = sc.nextLine();
        }
        List list = new ArrayList();

        for(String dd:input){
            if(dd.charAt(1)=='u') { // push
                list.add(dd.split(" ")[1]);
                continue;
            } else if(dd.charAt(0)=='t'&&dd.charAt(1)=='o') { // top
                if(list.size()==0){
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(list.size()-1));
                }
                continue;
            }
            else if(dd.charAt(0)=='p'&&dd.charAt(1)=='o'){ // pop
                if(list.size()==0){
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(list.size()-1));
                    list.remove(list.size()-1);
                }
                continue;
            }
            else if(dd.charAt(1)=='i'){ // size
                System.out.println(list.size());
                continue;
            } else if(dd.charAt(1)=='m'){ // empty
                if (list.size() == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                continue;
            }
        }
    }
}
