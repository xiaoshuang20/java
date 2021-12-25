package 挑战赛;

import java.util.Scanner;

/*
    由N（N<=10000）个整数组成的数组，其中连续K（K<=200）个元素构成一个区间，称为K区间。
    一个K区间中任意两个数求其差值的绝对值，其中最大的绝对值记为Dk。
    请计算整个数组中，所有K区间中的最大Dk值，并输出。
    输入说明：第一行是两个整数N和K，第二行输入N个数，表示数组中的元素。
    输出说明：最大Dk值。
    输入样例：8 2
    12 23 27 34 35 36 8 45
    输出样例：37
 */
public class demo_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        int Dk_all = 0;
        for (int i = 0; i < N / K; i++) {
            // 每组第一个数据
            int max = nums[i*K];
            int min = nums[i*K];
            // 得到每组最值
            for (int j = 1; j < K; j++) {
                max = Math.max(max, nums[i*K+j]);
                min = Math.min(min, nums[i*K+j]);
            }
            // 得到结果
            if (Dk_all < (max - min)){
                Dk_all = max - min;
            }
        }

        System.out.println(Dk_all);
    }
}
