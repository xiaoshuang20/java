package 挑战赛;

import java.util.Scanner;

/*
    对于给定的字符数组，统计其中字母类型、数字类型和符号类型的字符出现次数，
    其中字母类型是英文字母a-z之间的字符（不区分大小写）；
    数字类型是0-9之间的字符；
    符号类型是除英文字母、数字及空格外的其它字符。
    输入说明：一个字符序列；
    输出说明：第一行字母类型，以a-z标识；第二行数字类型，以0-9标识；第三行符号类型，以others标识
            类别标识 出现次数（中间用一个空格分隔）
    输入样例：Hello World!
    输出样例：a-z 10
            0-9 0
            others 1
 */
public class demo_08 {

    public static void main(String[] args) {
        char[] s = new Scanner(System.in).nextLine().toCharArray();
        int str = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < s.length; i++) {
            if(Character.isDigit(s[i])) {
                num++;
            } else if (isChar(s[i])) {
                str++;
            } else if ((int)s[i] != 32) {
                // 空格的 ASCII码十进制是32，16进制才是20
                other++;
            }
        }

        System.out.println("a-z " + str);
        System.out.println("0-9 " + num);
        System.out.println("others " + other);
    }

    public static boolean isChar(char c) {
        if((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
            return true;
        }
        return false;
    }
}
