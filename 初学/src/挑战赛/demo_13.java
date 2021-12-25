package 挑战赛;

/*
    给出长度N的各不相同整数组成的数组，求解2个数相加为M的情况个数
    输入说明：第一行，数组中元素个数N（N<1000），和值M；第二行，N个数组元素
    输出样例：8 10
    1 4 2 5 3 19 8 6
    输出样例：2
 */

import java.util.Scanner;

public class demo_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int n = 0;

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int j = 0; j < N - 1; j++) {
            for (int k = j + 1; k < N; k++) {
                if (nums[j] + nums[k] == M){
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}
