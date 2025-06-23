package Class3;
import java.io.*;
import java.util.*;

public class NeverHeardSeen_1764 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> heard = new TreeSet<>();
        Set<String> seen = new TreeSet<>();

        // 두개 집합 비교해서 중복인거 찾아서 개수랑 사전순 정렬 (기본이 사전순 정렬이엿나;) => 응 아니야 TreeSet이 사전순 자동정렬 근데 개느림

        for(int i=0; i<N; i++){
            String name = br.readLine();
            heard.add(name);
        }

        for(int i=0; i<M; i++){
            String name = br.readLine();
            seen.add(name);
        }


        Set<String> res = new TreeSet<>();

        // 교집합 찾기
        for(String name:seen){
            if(heard.contains(name)){
                res.add(name);
            }
        }



        bw.write(String.valueOf(res.size()) + "\n");
        for(String name:res){
            bw.write(name+"\n");
        }
        bw.flush();

    }

}




