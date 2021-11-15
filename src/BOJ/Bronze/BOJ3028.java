package BOJ.Bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ3028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine();

        List<Character> lst = new ArrayList<Character>();

        for(int i=0;i<inputValue.length();i++){
            lst.add(inputValue.charAt(i));
        }

        int index = 1;

        for(int i=0;i<lst.size();i++){
            switch (lst.get(i)){
                case 'A' :
                    switch (index){
                        case 1: index = 2; continue;
                        case 2: index = 1; continue;
                        case 3: continue;
                    }
                case 'B' :
                    switch (index){
                        case 1: continue;
                        case 2: index = 3; continue;
                        case 3: index = 2; continue;
                    }
                case 'C' :
                    switch (index){
                        case 1: index = 3; continue;
                        case 2: continue;
                        case 3: index = 1; continue;
                    }
            }
        }
    System.out.println(index);
    }
}