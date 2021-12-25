package 挑战赛;

import java.util.Scanner;

/*
    由N（N<=10000）个整数组成的数组，其中连续K（K<=200）个元素构成一个区间，称为K区间。
    一个K区间中所有素数的和记为Sk，请计算整个数组中，所有K区间中的最大Sk值，并输出。
    输入说明：第一行是两个整数N和K，第二行输入N个数，表示数组中的元素。
    输出说明：最大Sk值
    输入样例：8 2
    12 23 27 34 19 17 45 8
    输出样例：36
 */
public class demo_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int maxSk = 0;
        int[] nums = new int[N];
        // 确定数组内容
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        // 有几组  循环
        for (int i = 0; i < nums.length / K; i++) {
            // 和重置
            int sum = 0;
            // 每组的元素
            for (int j = 0; j < K; j++) {
                if(isSuShu(nums[i * K + j])) {
                    sum += nums[i * K + j];
                }
            }

            // 判断大小
            if(maxSk < sum) {
                maxSk = sum;
            }
        }
        System.out.println(maxSk);
    }

    // 判断素数
    public static boolean isSuShu(int num){
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
