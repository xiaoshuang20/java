package 挑战赛;

import java.util.Scanner;

/*
    统计1到N（含）之间所有平方数的个数，并输出这个数目
    提示：平方数的个数，如4是2的平方数，16是4的平方数，5不是平方数
    输入说明：一个整数N(N<100000)；
    输出说明：平方数的个数
    输入样例：50
    输出样例：7
 */
public class demo_01 {

    public static void main(String[] args) {
        System.out.println("一个整数N(N<100000):");
        int N = new Scanner(System.in).nextInt();
        int count = 0;
        double result;

        for (int i = 1; i <= N; i++) {
            result = Math.sqrt(i);
            // %: 取余数      /: 取商
            if(result % 1 == 0){
                count++;
            }
        }

        System.out.println("平方数的个数:" + count);
    }
}
