package Class3;

import java.io.*;
import java.util.*;

public class Virus_2606 {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        List<Integer>[] com = new ArrayList[n+1];

        for(int i=0; i<=n; i++){
            com[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            com[a].add(b);
            com[b].add(a);

        }

        //음 .. DFS보다는 BFS가 더 빠를거가틍ㅁ.
        boolean[] visitedBFS = new boolean[n + 1];
        List<Integer> bfsResult = bfs(1,com, visitedBFS);
        int cnt=bfsResult.size()-1;
        System.out.print(cnt);


    }

    private static List<Integer> bfs(int start, List<Integer>[] list, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            result.add(curr);

            for (int next : list[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        return result;
    }

}
