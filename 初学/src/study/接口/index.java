package study.接口;

public class index {
    public static void main(String[] args) {

        Fu f = new Zi();
        // java中的普通函数有虚函数的特性
        f.method();     // 子类方法
        // 访问成员变量时是以等号左边为准
        System.out.println(f.num);  // 20
        // 接口中的常量直接通过调用
        System.out.println(MyInterface.num);    // 10

        Zi z = new Zi();
        // 访问成员方法时，方法中的成员变量以方法所在类中的成员变量为准
        z.methodFu();   // 20
        z.methodZi();   // 20 30
    }
}
