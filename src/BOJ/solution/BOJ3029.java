package BOJ.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] now = br.readLine().split(":");
        String[] target = br.readLine().split(":");

        int nowTime = Integer.parseInt(now[0]) * 3600 + Integer.parseInt(now[1]) * 60 + Integer.parseInt(now[2]);
        int targetTime = Integer.parseInt(target[0]) * 3600 + Integer.parseInt(target[1]) * 60 + Integer.parseInt(target[2]);

        int result = targetTime - nowTime;

        if (result < 0) {
            result += 24 * 3600;
        }

        int hour = result / 3600;
        int minute = (result % 3600) / 60;
        int second = (result % 3600) % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}