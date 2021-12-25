package 挑战赛;

import java.util.Scanner;

public class _2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = 0;
        int numB = 0;

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String people = scanner.next();    // 人员
            String color = scanner.next();  // 颜色
            String cas = scanner.next();    // 接种情况
            String result = scanner.next(); // 结果
            int time = scanner.nextInt();   // 最近一次时间

            if ("L".equals(people)){
                if ("D".equals(cas) && keyi(color, result, time)){
                    numA++;
                } else if ("E".equals(cas) && keyi(color, result, time)){
                    numB++;
                }
            } else {
                if ("E".equals(cas) && keyi(color, result, time)){
                    numB++;
                }
            }
        }

        System.out.println(numA + " " + numB);
    }

    public static boolean keyi(String s1, String s2, int n){
        if ("G".equals(s1)){
            return true;
        } else {
            if (n < 3 && "N".equals(s2)){
                return true;
            }
        }
        return false;
    }
}
