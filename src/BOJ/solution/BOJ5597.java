package BOJ.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 28; i++) {
            list.add(sc.nextInt());
        }

        // 정렬
        list.sort(Comparator.naturalOrder());

        list.add(0);
        list.add(0);

        int[] a = new int[30];
        for (int i = 1; i <= 30; i++) {
            a[i-1] = i;
        }


        for (int i = 1; i <= 30; i++) {
            if(list.get(i) != null && list.get(i) == a[i]){
                list.remove(list.get(i));
            } else if(list.get(i)==0){
                list.remove(list.get(i));
            }
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
