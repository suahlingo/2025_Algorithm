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

        for(int i=0; i<=N; i++){
            list[i] = new ArrayList<>();
        }


        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);


        }

        for(int i=0; i<=N; i++){
            Collections.sort(list[i]);
        }

        boolean[] visitedDFS = new boolean[N + 1];
        List<Integer> dfsResult = new ArrayList<>();
        dfs(V, list, visitedDFS, dfsResult);
        for (int v : dfsResult) {
            System.out.print(v + " ");
        }
        System.out.println();

        boolean[] visitedBFS = new boolean[N + 1];
        List<Integer> bfsResult = bfs(V, list, visitedBFS);
        for (int v : bfsResult) {
            System.out.print(v + " ");
        }
        System.out.println();


    }

    private static void dfs(int curr, List<Integer>[] list, boolean[] visited, List<Integer> result) {
        visited[curr] = true;
        result.add(curr);

        for (int next : list[curr]) {
            if (!visited[next]) {
                dfs(next, list, visited, result);
            }
        }
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
