package Class3;

import java.io.*;
import java.util.*;

public class FibonacciFunction_1003 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수
        int t = sc.nextInt();

        // 테스트 케이스 개수만큼의 정수 입력

        //1. 반복되는 재귀 함수니까 dp를 씀
        //2. 0부터 시작해서 최대 40이니까 41
        int[][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;

        dp[1][0] = 0;
        dp[1][1] = 1;


        for (int i = 2; i <=40; i++) {

            //0 리턴 횟수
            dp[i][0]=dp[i-1][0]+dp[i-2][0];

            //1 리턴 횟수
            dp[i][1]=dp[i-1][1]+dp[i-2][1];

        }

        for(int i =0; i<t; i++){
            int n = sc.nextInt();
            //출력?
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }


    }

}
