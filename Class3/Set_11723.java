package Class3;

import java.io.*;
import java.util.*;

public class Set_11723 {


    /*
    add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
all: S를 {1, 2, ..., 20} 으로 바꾼다.
empty: S를 공집합으로 바꾼다./
     */
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        Set<Integer> S = new HashSet<>();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            int x = 0;
            if (st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "add":
                    S.add(x);
                    break;
                case "remove":
                    S.remove(x);
                    break;
                case "check":
                    bw.write(S.contains(x) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    if (S.contains(x)) S.remove(x);
                    else S.add(x);
                    break;
                case "all":
                    S.clear();
                    for (int j = 1; j <= 20; j++) S.add(j);
                    break;
                case "empty":
                    S.clear();
                    break;
            }
        }
        bw.flush();


    }


}












