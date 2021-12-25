package 挑战赛;

import java.util.Scanner;

/*
    对于给出的长度为N(N<1000)的正整数数组，满足连续3个元素均为合数的区间称为3合数区间，计算该数组中3合数区间的个数
    输入说明：第一行，数组中元素个数N，第二行，N个正整数，用空格隔开
    输出说明：3合数区间的个数
    输入样例：7
    6 8 4 9 7 5 8
    输出样例：2
 */
public class demo_02 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int count = 0;
        int N = scanner.nextInt();
        int[] nums = new int[N];

        // 确定数组内容
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        // 判断条件
        for (int i = 0; i < N - 2; i++) {
            if(isHeShu(nums[i]) && isHeShu(nums[i+1]) && isHeShu(nums[i+2])){
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isHeShu(int num){
        // 2不是合数
        if(num == 2){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return true;
            }
        }
        return false;
    }
}
