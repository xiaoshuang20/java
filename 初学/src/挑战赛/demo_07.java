package 挑战赛;

import java.util.Scanner;

/*
    统计整数区间[N, M] (N,M<100000)中所有非偶数的合数个数，并输出这个数。
    输入说明：两个整数N、M；
    输出说明：非偶数的合数个数
    输入样例：2 16
    输出样例：2
 */
public class demo_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        int count = 0;
         for(int i = begin; i <= end; i++) {
             if(odd(i) && isHeShu(i)) {
                 count++;
             }
         }

        System.out.println(count);
    }

    public static boolean odd(int num) {
        if(num % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean isHeShu(int num) {
        if(num == 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
