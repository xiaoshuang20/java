package exercise;

import java.util.function.Function;

/*
    练习：自定义函数模型拼接
    题目
    请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
        1. 将字符串截取数字年龄部分，得到字符串；
        2. 将上一步的字符串转换成为int类型的数字；
        3. 将上一步的int数字累加100，得到结果int数字。
 */
public class Function接口实例 {

    public static void main(String[] args) {
        // 定义一个字符串
        String str = "xiao,20";
        // 调用change方法,参数传递字符串和3个Lambda表达式
        int num = change(str,
                n -> n.split(",")[1],
                n -> Integer.parseInt(n),
                n -> n + 100);
        System.out.println(num);
    }

    /*
        定义一个方法
        参数传递包含姓名和年龄的字符串
        参数再传递3个Function接口用于类型转换
     */
    public static int change(String s, Function<String,String> fun1,
                             Function<String,Integer> fun2,
                             Function<Integer,Integer> fun3){
        // 使用andThen方法把三个转换组合到一起
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

}
