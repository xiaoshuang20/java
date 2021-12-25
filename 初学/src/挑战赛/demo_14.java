package 挑战赛;

/*
    在一个由小写英文字母（a-z）组成的字符串中，
    查找最短子串，其头尾字母相同，且中间不包含该头尾字母，并输出最左边的该类子串
    输入说明：待处理字串（长度≤ 200）
    输出说明：子串
    输入样例：adfdasjdoiasldhlfa
    输出样例：dfd
 */

import java.util.Scanner;

public class demo_14 {

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        // 开始令其为最大长度
        int len = s.length();
        String str1 = ""; // 截取的字符串
        String str2 = ""; // 最终的字符串
        int flag = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            flag = s.indexOf(c, i + 1); // 从下一个字母开始找
            if (flag != -1){
                // 截取字符串
                str1 = s.substring(i, flag + 1);
            } else {
                // 没找到直接下一个
                continue;
            }

            if (str1.length() < len){
                len = str1.length();
                str2 = str1;
            }
        }

        System.out.println(str2);
    }
}
