package 挑战赛;

import java.util.ArrayList;
import java.util.Scanner;

/*
    字母连连看，给定一个由小写英文字母组成的字符串(长度<1000)，如果字符串中有两个连续的字母相同，
    则这两个字母可同时消除，并不断重复该操作，直到不能消除为止。请编程判断该字符串是否可以完全消除
    输入说明：一个字符串。
    输出说明：如果可以完全消除，输出“YES”，如果不可以，输出消除后的结果。
    输入样例1：abacddcaba
    输出样例1：YES
    输入样例2：asdfghhgf
    输出样例2：asd
 */
public class demo_03 {

    public static void main(String[] args) {
        // 输入字符串并转换为相应ArrayList
        String str = new Scanner(System.in).next();

        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
        }

        ArrayList<Character> s = fun(arr);
        if(s.size() == 0){
            System.out.println("YES");
        } else {
            // 输出对应字符串
            String string = "";
            int i = 0;
            while (s.size() != 0){
                string += s.remove(i);
            }
            System.out.println(string);
        }
    }

    public static ArrayList<Character> fun(ArrayList<Character> list){
        // 先把原始数组长度固定再循环
        int len = list.size();
        for (int i = 0; i <  len / 2; i++) {
            // 每次只删一对相同字符
            for (int j = 0; j < list.size() - 1; j++) {
                if(list.get(j) == list.get(j+1)){
                    // 每次删除操作都会引起数组变化（元素前移）
                    list.remove(j);
                    list.remove(j);
                    break;
                }
            }
        }
        return list;
    }

    // 递归实现
    public static String sub(String str) {
        String s = str;
        // 一次可能删除多对相同字符
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = s.substring(0, i) + s.substring(i + 2, s.length());
            }
        }
        // 操作完后跟原来没区别，表明已经最简了，返回结果
        if (s.equals(str)) {
            return s;
        } else {
            return sub(s);
        }
    }
}
