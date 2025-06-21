package Class3;

import java.io.*;
import java.util.*;
public class WelcomeKit_30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 신청자 수
        int people = Integer.parseInt(br.readLine());




        //사이즈별 신청자 수
        //리스트로 각 사이즈별(6개) 신청자 수 받기  이거 만들어주셈 변수명은 sizeNum으로
        List<Integer> sizeNum = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizeNum.add(Integer.parseInt(st.nextToken()));
        }

        StringTokenizer stt = new StringTokenizer(br.readLine());
        // 최대 티셔츠 묶음 수
        int t = Integer.parseInt(stt.nextToken());

        // 최대 펜 묶음 수
        int p = Integer.parseInt(stt.nextToken());




        // 티셔츠 주문 묶음 수
        int resT = calTshirts(t, sizeNum);

        // 펜 묶음 주문 수
        int resP = people/p;

        // 펜 자루 주문 수
        int modP = people%p;



        bw.write(String.valueOf(resT) + "\n");
        bw.write(String.valueOf(resP) + " " + String.valueOf(modP));
        bw.flush();

    }

    private static int calTshirts(int t, List<Integer> sizeNum) {
        int total = 0;
        for (int num : sizeNum) {
            total += (num + t - 1) / t;
        }
        return total;
    }

}
