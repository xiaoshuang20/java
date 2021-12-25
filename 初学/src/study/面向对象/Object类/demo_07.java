package study.面向对象.Object类;

/*
    装箱: 把基本类型的数据,包装到包装类中(基本类型的数据 -> 包装类)
        构造方法:
            Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值
                传递的字符串,必须是基本类型的字符串,否则会抛出异常
        静态方法:
            static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象
    拆箱: 在包装类中取出基本类型的数据(包装类 -> 基本类型的数据)
        成员方法:
            int intValue() 以 int 类型返回该 Integer 的值
 */
public class demo_07 {

    public static void main(String[] args) {
        // 装箱
        //构造方法
        Integer in1 = new Integer(1);   // 方法上有横线,说明方法过时了
        System.out.println(in1);    // 回顾：直接打印对象不是地址，重写了toString方法

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);

        // Integer in4 = Integer.valueOf("a");  //NumberFormatException数字格式化异常
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        // 自动装箱: 直接把int类型的整数赋值包装类
        Integer in = 1;


        // 拆箱
        int i = in1.intValue();
        System.out.println(i);

        /*
            自动拆箱: in是包装类,无法直接参与运算,可以自动转换为基本数据类型,在进行计算
            in+2;   就相当于 in.intVale() + 2 = 3
            in = in.intVale() + 2 = 3 又是一个自动装箱
         */
        in = in + 2;
        System.out.println(in);
    }
}
