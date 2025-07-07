package Class3;

import java.util.Scanner;

public class PreFixSum4_11659 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        // 왜냐면 1부터가 첫번째를 의미하도록 해야해서.
        int[] list = new int[n+1];

        for(int i=1; i<=n; i++){
            list[i] = sc.nextInt();
        }


        int[] sum = new int[n+1];

        for(int i=1; i<=n; i++){
            sum[i]= sum[i-1] + list[i];
        }

        //누적합 : prefix[j] - prefix[i-1]!
        for(int k=1; k<=m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int res = sum[j] - sum[i-1];
            System.out.println(res);
        }






    }

}







