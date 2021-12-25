package 挑战赛;


import java.util.Scanner;

/*
    统计1到N（含）之间所有立方数的个数，并输出这个数目。
    提示：立方数的个数，如8是2的立方数，27是3的立方数，9不是立方数。
    输入说明：一个整数N(N<100000)；
    输出说明：立方数的个数
    输入样例：200
    输出样例：5
 */
public class demo_06 {

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int num = 0;
        // 1也算立方数
        for (int i = 1; i < Math.sqrt(N); i++) {
            if(i * i * i < N) {
                num++;
            }
        }
        System.out.println(num);
    }

    /*
        另一种思路
        double pow = Math.pow(N, 1.0 / 3);
        int count = (int) (pow / 1);

     */
}
