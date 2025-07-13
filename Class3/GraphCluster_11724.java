package Class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphCluster_11724 {

    static List<List<Integer>> graph = new ArrayList<>();

    static boolean[] visited;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        visited = new boolean[n+1];

        int cnt =0;
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void dfs(int node) {
        visited[node] = true;

        for(int neighbor : graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }

}





