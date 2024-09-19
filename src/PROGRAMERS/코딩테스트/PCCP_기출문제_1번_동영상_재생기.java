package PROGRAMERS.코딩테스트;

import java.util.Arrays;

/**
 * [PCCP 기출문제] 1번 / 동영상 재생기
 *
 * 당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원합니다. 각 기능이 수행하는 작업은 다음과 같습니다.
 *
 * 10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.
 * 10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.
 * 오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.
 * 동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열 commands가 매개변수로 주어집니다. 이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return 하도록 solution 함수를 완성해 주세요.
 *
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/340213?language=java
 */
public class PCCP_기출문제_1번_동영상_재생기 {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = check_to_opening(pos, op_start, op_end);

        for(String s : commands){
            if(s.equals("next")){
                answer = check_to_opening(next(answer), op_start, op_end);
            } else if(s.equals("prev")){
                answer = check_to_opening(prev(answer), op_start, op_end);
            }
        }

        return answer;
    }

    private static String check_to_opening(String time, String op_start, String op_end) {
        int[] start_arr = Arrays.stream(op_start.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] end_arr = Arrays.stream(op_end.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] time_arr = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();

        if(start_arr[0] <= time_arr[0] && end_arr[0] >= time_arr[0]){
            if(start_arr[1]<=time_arr[1] && end_arr[1] >= time_arr[1]){
                return op_end;
            }
        }

        return time;
    }

    private static String next(String time){
        String[] times = time.split(":");
        int minute = Integer.parseInt(times[0]);
        int seconds = Integer.parseInt(times[1]) + 10;

        if(seconds >= 60) {
            minute++;
            seconds -= 60;
        }

        return (minute < 10 ? "0" + minute : minute + "") + ":" + (seconds < 10 ? "0" + seconds : seconds + "");
    }

    private static String prev(String time){
        String[] times = time.split(":");
        int minute = Integer.parseInt(times[0]);
        int seconds = Integer.parseInt(times[1]) - 10;

        if(seconds < 0) {
            minute--;

            if(minute < 0){
                return "00:00";
            }

            seconds += 60;
        }



        return (minute < 10 ? "0" + minute : minute + "") + ":" + (seconds < 10 ? "0" + seconds : seconds + "");
    }

    public static void main(String[] args) {
        String[] video_len = {"34:33","10:55","07:22"};
        String[] pos = {"13:00","00:05","04:05"};
        String[] op_start = {"00:55","00:15","00:15"};
        String[] op_end = {"02:55","06:55","04:07"};
        String[][] commands = {{"next", "prev"},{"prev", "next", "next"},{"next"}};

        for(int i=0;i<3;i++){
            System.out.println(solution(video_len[i], pos[i], op_start[i], op_end[i], commands[i]));
        }
    }
}
