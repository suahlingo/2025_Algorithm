package Class3;

import java.io.*;

public class Add123_9095 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());


        int[] dp = new int[11];

        // n = 1~10 이고 각 1부터 10까지의 수를 1,2,3의 합으로 만드는 경우의 수 ..
        // 1 = dp[i]로 둘거임.. 그래서 에를 들어 4의 경우는
        // 4 = 1+1+1+1, 1+1+2, 1+3 = dp[i]+3, dp[i]+3, dp[i]+3
        // 5 = 1+1+1+1+1, 1+1+1+2, 1+1+3, 1+4, 2+3 = dp[i]+4, dp[i]+4, dp[i]+4, dp[i]+1+dp[i]+3.. 이런식으로 패턴 찾아봣는데 재귀하면서 dp[i] 로 하도록 어떰..?

        dp[0] = 1;
        dp[1] =1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(dp[n] + "\n");
        }
        bw.flush();

    }

}
