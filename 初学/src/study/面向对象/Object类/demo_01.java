package study.面向对象.Object类;

public class demo_01 {

    public static void main(String[] args) {
        Person p = new Person(18, "xiao");
        String s = p.toString();

        System.out.println(s);  // 重写toString()方法，使打印结果为对象字符串
        System.out.println(p);  // 直接打印对象是调用了toString()方法，默认返回地址值

        Person x = new Person(18, "xiao");  // 数据相同的对象，但地址不同
        // equals() 方法比较对象跟比较字符串一样，比较的是地址值
        // 想比较对象里的属性值就得重写 equals()方法    (也可以自动生成)
        System.out.println(p.equals(x));
    }
}
