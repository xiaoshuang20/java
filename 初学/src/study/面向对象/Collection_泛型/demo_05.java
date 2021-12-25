package study.面向对象.Collection_泛型;

public class demo_05 {

    public static void main(String[] args) {
        // 不写泛型默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj);

        // 创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();   // 右边可以不写
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        // 创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name1 = gc3.getName();
        System.out.println(name1);


        // 调用含有泛型的方法
        System.out.println("====================");
        gc.method01(10);
        gc.method01("abc");
        gc.method01(8.8);
        gc.method01(true);

        // 调用含有泛型的静态方法 (通过类名直接使用)
        GenericClass.method02("静态方法");
        GenericClass.method02(1);
    }
}
