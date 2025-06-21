package Class3;

import java.io.*;

public class Makeit1_1463 {

    /*
    X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
dp로 풀기 월요일까지
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        // cnt = min[i*3, i*2, i+1] +1

        bw.write(String.valueOf(res));
        bw.flush();
    }



}






