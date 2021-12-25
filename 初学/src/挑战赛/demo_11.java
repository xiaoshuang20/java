package 挑战赛;

/*
    有一组均由字符A~Z和a~z组成的字符串，其中要求将字符串中各字符按如下要求进行转换：
    A<->z、B<->y、C<->x、...... 、X<->c、Y<->b、Z<->a
    输入样例复制
        Algorithm
        Hello
    输出样例复制
        zOTLIRGSN
        sVOOL
 */

import java.util.Scanner;

// 答案用 ASCII码值，a+Z = 187
public class demo_11 {

    public static void main(String[] args) {
        char[] string = new Scanner(System.in).next().toCharArray();
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String s = "";
        int index = 0;
        // 熟悉方法的使用：
        // indexOf：返回字符串中指定字符的下标（匹配到的第一个）
        // charAt：返回字符串中指定下标对应的字符
        for (int i = 0; i < string.length; i++) {
            if (string[i] >= 'a' && string[i] <= 'z'){
                index = s1.indexOf(string[i]);
                s += s2.charAt(25 - index);
            } else {
                index = s2.indexOf(string[i]);
                s += s1.charAt(25 - index);
            }
        }

        System.out.println(s);
    }
}
