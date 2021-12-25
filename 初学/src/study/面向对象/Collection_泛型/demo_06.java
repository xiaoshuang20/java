package study.面向对象.Collection_泛型;

public class demo_06 {

    public static void main(String[] args) {
        // 创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("只能是字符串");

        // 创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);
    }
}
