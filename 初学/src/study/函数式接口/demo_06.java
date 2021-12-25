package study.函数式接口;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    作用:对某种数据类型的数据进行判断,结果返回一个boolean值

    Predicate接口中包含一个抽象方法：
        boolean test(T t):用来对指定数据类型数据进行判断的方法
            结果:
                符合条件,返回true
                不符合条件,返回false
*/
public class demo_06 {

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "abcdef";

        // 优化Lambda表达式
        // 对参数传递的字符串进行判断,判断字符串的长度是否大于5,并把判断的结果返回
        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);

        // 调用checkString方法,参数传递字符串和两个Lambda表达式
        boolean b1 = checkString1(s,
                n -> n.length() > 5,
                n -> n.contains("a"));
        System.out.println(b1);

        boolean b2 = checkString2(s,
                n -> n.length() > 5,
                n -> n.contains("x"));
        System.out.println(b2);

        boolean b3 = checkString3(s,
                n -> n.length() > 5);
        System.out.println(b3);
    }

    /*
        定义一个方法
        参数传递一个String类型的字符串
        传递一个Predicate接口,泛型使用String
        使用Predicate中的方法test对字符串进行判断,并把判断的结果返回
    */
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static boolean checkString1(String s, Predicate<String> pre1,Predicate<String> pre2){
        // 等价于return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static boolean checkString2(String s, Predicate<String> pre1,Predicate<String> pre2){
        // 等价于return pre1.test(s) || pre2.test(s);
        return pre1.or(pre2).test(s);
    }

    public static boolean checkString3(String s, Predicate<String> pre){
        // 等价于return !pre.test(s);
        return pre.negate().test(s);
    }
}
