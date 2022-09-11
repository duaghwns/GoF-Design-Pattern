package java_study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class AboutSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        Random rd = new Random();

        do {
            set.add(rd.nextInt(45));
        }
        while(set.size()!=6);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
