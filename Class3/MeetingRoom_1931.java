package Class3;

import java.io.*;
import java.util.*;

public class MeetingRoom_1931 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] meetings = new int[n][2];

        for(int i=0; i<n; i++){
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }

        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int cnt = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            if (meetings[i][0] >= end) {
                end = meetings[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}
