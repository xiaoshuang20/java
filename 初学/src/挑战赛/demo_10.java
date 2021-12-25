package 挑战赛;

/*
    给定一个只包含0-9、‘+’、‘*’的合法数学表达式，规定加号‘+’的优先级高于乘号‘’，请输出计算结果
    输入说明: 合法的数学表达式
    输出说明: 输出表达式的计算结果
    输入样例: 12*3+17
    输出样例： 240
 */

import java.util.Scanner;

public class demo_10 {

    public static void main(String[] args) {
        // 使用 split()切割字符串时，若指定字符在正则表达式中具有特殊含义，则改字符需要转义
        String[] str = new Scanner(System.in).nextLine().split("\\*");
        int sum = 1;
        for (int i = 0; i < str.length; i++) {
            int num = 0;
            String[] s = str[i].split("\\+");
            for (int j = 0; j < s.length; j++) {
                num += Integer.parseInt(s[j]);
            }
            sum *= num; // 这里不太好想
        }

        System.out.println(sum);
    }
}
