package study;

import java.util.Scanner;

/*
字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中

对于基本类型来说，==是进行数值的比较,
对于引用类型来说，==是进行【地址值】的比较
 */
public class 字符串 {
    // 创建字符串的常见3+1种方式。
    // 三种构造方法：
    // public String()：创建一个空白字符串，不含有任何内容。
    // public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
    // public String(byte[] array)：根据字节数组的内容，来创建对应的字符串。
    // 一种直接创建：
    // String str = "Hello"; // 右边直接用双引号
    public static void main(String[] args) {

        // 使用空参构造
        String str1 = new String(); // 小括号留空，说明字符串什么内容都没有。
        System.out.println("第1个字符串：" + str1);

        // 根据字符数组创建字符串
        char[] charArray = { 'A', 'B', 'C' };
        String str2 = new String(charArray);
        System.out.println("第2个字符串：" + str2);

        // 根据字节数组创建字符串
        byte[] byteArray = { 97, 98, 99 };
        String str3 = new String(byteArray);
        System.out.println("第3个字符串：" + str3);

        // 直接创建
        String str4 = "Hello";
        System.out.println("第4个字符串：" + str4);


        // 字符串的比较
        // .equals()    比较字符串本身而不是地址
        // .equalsIgnoreCase()  比较字符串时不区分大小写
        // new 出来的在堆中，直接创建的不在字符串常量池中，所以直接比较肯定是false
        String s1 = new Scanner(System.in).next();
        String s2 = "Hello";
        System.out.println(s1 == s2);
        // 比较时推荐将常量写在前面，避免空指针异常
        System.out.println(s2.equals(s1));

        // 常用方法
        // .length()    得到字符串的长度
        String st1 = "savbugeqvnsiusgvq";
        System.out.println(st1.length());
        // .concat(String)    拼接字符串
        String st2 = "Hello";
        String st3 = "World";
        // 原来的字符串不受影响
        System.out.println(st2.concat(st3));
        // .charAt(index)   获取指定索引位置的单个字符
        System.out.println(st2.charAt(0));
        // .indexOf(String)   查找参数字符串在字符串中首次出现的位置，若没有，返回-1
        System.out.println(st2.indexOf("l"));
        // 截取字符串：.substring(index)/ .substring(begin, end) [begin, end)
        System.out.println(st2.substring(2));   // llo
        System.out.println(st2.substring(1, 3));   // el
        // .toCharArray()   将字符串转换为字符数组形式
        System.out.println(st2.toCharArray()[4]);   // o
        // .getBytes()  将字符串转换为字节数组形式
        System.out.println(st2.getBytes()[4]);   // 111
        // .replace(String1, String2)   将字符串中的string1全部替换为string2
        System.out.println(st2.replace("l", "*"));  // He**o
        // .split(String)   截取字符串,按照参数的规则将字符串切割为若干部分，返回字符串数组
        // 切割的字符会除掉
        String st4 = "xiao xiao shuang";
        String[] array = st4.split(" ");// 里面是个正则，切割字符串为"."时应使用"//."
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
