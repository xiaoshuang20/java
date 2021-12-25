package study.函数式接口;

import java.util.function.Consumer;

/*
    java.util.function.Consumer<T>接口则正好与Supplier接口相反，
        它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定
    Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。

   Consumer接口是一个消费型接口,使泛型执行什么类型,就可以用accept方法消费什么类型的数据
   至于具体怎么消费(使用),需要自定义(输出,计算....)


      Consumer接口的默认方法andThen
   作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费

   例如:
    Consumer<String> con1
    Consumer<String> con2
    String s = "hello";
    con1.accept(s);
    con2.accept(s);
    连接两个Consumer接口  再进行消费
    con1.andThen(con2).accept(s); 谁写前边谁先消费
 */
public class demo_05 {

    public static void main(String[] args) {
        // 调用method方法,传递字符串姓名,方法的另一个参数是Consumer接口,是一个函数式接口,所以可以传递Lambda表达式
        method1("xiao",(String name)->{
            // 对传递的字符串进行消费
            // 消费方式:直接输出字符串
            // System.out.println(name);

            // 消费方式:把字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });


        // 调用method方法,传递一个字符串,两个Lambda表达式
        method2("Hello",
                t -> System.out.println(t.toUpperCase()),    // 消费方式:把字符串转换为大写输出
                t -> System.out.println(t.toLowerCase())    // 消费方式:把字符串转换为小写输出
                );
    }


    /*
    定义一个方法
    方法的参数传递一个字符串的姓名
    方法的参数传递Consumer接口,泛型使用String
    可以使用Consumer接口消费字符串的姓名
    */
    public static void method1(String name, Consumer<String> con){
        con.accept(name);
    }

    // 定义一个方法,方法的参数传递一个字符串和两个Consumer接口,Consumer接口的泛型使用字符串
    public static void method2(String s, Consumer<String> con1 ,Consumer<String> con2){
        // 使用andThen方法,把两个Consumer接口连接到一起,在消费数据
        con1.andThen(con2).accept(s);   // con1连接con2,先执行con1消费数据,在执行con2消费数据
    }
}
