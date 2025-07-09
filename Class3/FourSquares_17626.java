package Class3;

import java.io.IOException;
import java.util.Scanner;

public class FourSquares_17626 {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n+1];

        dp[0]=0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);

            }
        }

        System.out.print(dp[n]);

    }
}
