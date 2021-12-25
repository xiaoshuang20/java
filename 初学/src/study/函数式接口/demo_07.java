package study.函数式接口;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
        前者称为前置条件，后者称为后置条件
    Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
        使用的场景例如：将String类型转换为Integer类型

    可以使用andThen方法,把两次转换组合在一起使用
        String s = fun1.andThen(fun2).apply("123");
    fun1先调用apply方法,把字符串转换为Integer
    fun2再调用apply方法,把Integer转换为字符串
 */
public class demo_07 {

    public static void main(String[] args) {
        // 定义一个字符串类型的整数
        String s = "1234";

        // 调用change1方法, 优化Lambda表达式
        change1(s, n -> Integer.parseInt(n));

        // 调用change2方法，优化Lambda表达式
        change2(s,
                n -> Integer.parseInt(s) + 10,
                n -> n.toString());
    }

    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数传递一个Function接口,泛型使用<String,Integer>
        使用Function接口中的方法apply,把字符串类型的整数,转换为Integer类型的整数
    */
    public static void change1(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);  //自动拆箱 Integer->int
    }

    /*
        定义一个方法
        参数串一个字符串类型的整数
        参数再传递两个Function接口
            一个泛型使用Function<String,Integer>
            一个泛型使用Function<Integer,String>
    */
    public static void change2(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        // 前一个转换后的值作为后一个的参数
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
        System.out.println("str is string ?  --  " + (str instanceof String));
    }
}
