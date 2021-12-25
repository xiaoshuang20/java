package study.面向对象.Collection_泛型;

/*
    定义一个含有泛型的类,模拟ArrayList集合
    泛型是一个未知的数据类型,当不确定什么什么数据类型的时候,可以使用泛型
    泛型可以接收任意的数据类型,可以使用Integer,String,Student...
    创建对象的时候确定泛型的数据类型
 */
public class GenericClass<E>{
    private E name;

    // 定义一个含有泛型的方法
    public <M> void method01(M m){
        System.out.println(m);
    }

    // 定义一个含有泛型的静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
