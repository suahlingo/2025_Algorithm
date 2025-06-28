package Class3;

import java.io.IOException;
import java.util.*;

public class DFSandBFS_1260 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        List<Integer>[] list = new ArrayList[N+1];

        for(int i=0; i<N; i++){
            list[i] = new ArrayList<>();
            Collections.sort(list[i]);
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[b].add(a);
            list[a].add(b);

        }


    }

}
