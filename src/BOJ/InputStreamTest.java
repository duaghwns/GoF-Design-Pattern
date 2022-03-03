package BOJ;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        Reader reader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.print("입력 : ");
        String lineString =  bufferedReader.readLine();
        bw.write("출력 : " + lineString);

        System.out.print("입력 : ");
        String hi = bufferedReader.readLine();
        bw.write("출력 : " + hi);
        bw.flush();

        bufferedReader.close();
        bw.close();
    }
}
