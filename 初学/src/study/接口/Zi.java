package study.接口;

public class Zi extends Fu implements MyInterface{

    int num = 30;

    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        // 巧记：子可以访问父，父不可访问子
        /* 这里，子类可以访问父类的方法，
           而父类中的方法有打印num的语句，
           父类是不能访问子类中的数据的，
           所以打印的num还是父类中的num
        */
        super.methodFu();
        System.out.println(num);
    }
}
