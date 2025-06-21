package Class3;

import java.io.*;

public class Makeit1_1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        //i를 1로 만들기 위한 최소 연산 횟수
        int[] dp = new int[X+1];

        //최소 연산 횟수를 구하기 위한 점화식..? 작은 문제 -> 큰 문제
        // 1에서 X로 가는 걸로, dp[1]은 1인데 이미 1은 연산이 필요없으므로 i는 2부터 시작

        for(int i=2; i<=X; i++){
            dp[i] = dp[i-1] + 1;
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
        }

        bw.write(String.valueOf(dp[X]));
        bw.flush();
    }


}






