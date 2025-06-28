package Class3;

import java.io.*;
import java.util.*;

public class AC_5430 {

    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String cmd = sc.next();
            int n = sc.nextInt();
            String arrStr = sc.next();

            List<Integer> ls = new ArrayList<>();
            arrStr = arrStr.substring(1, arrStr.length() - 1);
            if (!arrStr.isEmpty()) {
                String[] nums = arrStr.split(",");
                for (String num : nums) {
                    ls.add(Integer.parseInt(num));
                }
            }

            long dCount = cmd.chars().filter(c -> c == 'D').count();
            if (dCount > ls.size()) {
                System.out.println("error");
                continue;
            }

            boolean rev = false;
            for (char c : cmd.toCharArray()) {
                if (c == 'R') {
                    rev = !rev;
                } else if (c == 'D') {
                    if (rev) {
                        ls.remove(ls.size() - 1);
                    } else {
                        ls.remove(0);
                    }
                }
            }

            if (rev) Collections.reverse(ls);
            System.out.println(ls.toString().replace(" ", ""));
        }
    }

}
