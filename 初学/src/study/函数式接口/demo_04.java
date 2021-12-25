package study.函数式接口;

import java.util.function.Supplier;

/*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参的方法：
        T get(): 用来获取一个泛型参数指定类型的对象数据
 */
public class demo_04 {
    // 定义一个方法,方法的参数传递Supplier<T>接口,泛型执行String,get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        // 调用getString方法,方法的参数Supplier是一个函数式接口,所以可以传递Lambda表达式
        String s = getString(() -> "xiao");
        System.out.println(s);

        Integer n = getInteger(() -> 5);
        System.out.println(n);
    }
}
