package Class3;

import java.beans.Introspector;
import java.io.*;
import java.util.StringTokenizer;

public class ATM_11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                if (t[j] > t[j + 1]) {
                    int tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
                }

            }
        }

        int sum = 0;
        int tot = 0;

        for (int i = 0; i < n; i++) {
            sum += t[i];
            tot += sum;
        }

        bw.write(String.valueOf(tot));
        bw.flush();
    }


}


