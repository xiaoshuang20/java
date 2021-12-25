package study.面向对象.Object类;

public class demo_06 {

    /*
        字符串是一个常量不可改变，相加字符串时消耗较大，而StringBuilder类允许字符串发送改变，从而提高效率
    */
    public static void main(String[] args) {
        // 空参数构造方法
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:" + s1);

        // 带字符串的构造方法
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println("s2:" + s2);


        // append(): 添加任意类型数据的字符串形式，并返回当前对象自身
        s1.append("abc").append(1 + 2);
        System.out.println("s1:" + s1);
        StringBuilder s3 = s1.append("xiao");
        System.out.println(s1);
        System.out.println(s3);
        // 值为 true, 证明s1, s3是同一个对象，即：返回当前对象自身
        System.out.println(s1 == s3);   // 比较的是地址


        // toString(): 将字符串缓冲区对象StringBuilder转换为String
        // String->StringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        // 往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:" + bu);

        // StringBuilder->String
        String s = bu.toString();
        System.out.println("s:" + s);
    }
}
