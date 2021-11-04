package BOJ;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        Reader reader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int count = 1;
        while((a+(b*count))>c*count){
            count++;
        }

        System.out.println(count+1);
    }
}
