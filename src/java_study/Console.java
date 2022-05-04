package java_study;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Console {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "예금 조회");
        menu.put(2, "예금 출금");
        menu.put(3, "예금 입금");
        menu.put(4, "종료");
        int i=1;
        System.out.println("== Menu ==");
        while(i<menu.size()+1){
            System.out.println(i + ". " + menu.get(i));
            i++;
        }

        int asciiCode = is.read();
        String message = "를 선택하셨습니다.";
        switch (asciiCode) {
            case 1:
                System.out.println(menu.get(1)+message);
            case 2:
                System.out.println(menu.get(2)+message);
            case 3:
                System.out.println(menu.get(3)+message);
            case 4:
                System.out.println(menu.get(4)+message);
        }
//        char inputChar = (char)is.read();

    }
}
