package 挑战赛;

/*
    统计从1到N的整数中，所有立方值的平方根为整数的数的格式
    输入说明：整数N（N<10000）
    输出说明：符合条件的数的个数，如4^3= 64 = 8^2
    输入样例：10
    输出样例：3
    （说明：样例中符合条件的3个数是1、4、9）
 */

import java.util.Scanner;

public class demo_12 {

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int num = 0;
        for (int i = 1; i <= N; i++) {
            if (isRight(i)){
                num++;
            }
        }

        System.out.println(num);
    }

    public static boolean isRight(int n) {
        double num = Math.pow(n, 3);
        if (Math.sqrt(num) % 1 != 0){
            return false;
        }
        return true;
    }
}
