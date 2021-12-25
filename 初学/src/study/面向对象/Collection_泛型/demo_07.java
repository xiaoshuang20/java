package study.面向对象.Collection_泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    泛型的通配符:
        ?:代表任意的数据类型
    使用方式:
        不能创建对象使用,只能作为方法的参数使用
 */
public class demo_07 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");

        printArray(list1);
        printArray(list2);


        /*
            泛型的上限限定: ? extends E  代表使用的泛型只能是E类型的子类/本身
            泛型的下限限定: ? super E    代表使用的泛型只能是E类型的父类/本身
        */
        Collection<Integer> list_1 = new ArrayList<Integer>();
        Collection<String> list_2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElement1(list_1);
        // getElement1(list_2); // 报错
        getElement1(list3);
        // getElement1(list4);  // 报错

        // getElement2(list_1);  // 报错
        // getElement2(list_2);  // 报错
        getElement2(list3);
        getElement2(list4);

        /*
            附：
            类与类之间的继承关系
            Integer extends Number extends Object
            String extends Object
        */
    }

    /*
        定义一个方法,能遍历所有类型的ArrayList集合
        这时候不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
        注意：泛型没有继承的概念，<> 里写Object没用
     */
    public static void printArray(ArrayList<?> list) {
        // 使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            // it.next()方法,取出的元素是Object,可以接收任意的数据类型
            Object o = it.next();
            System.out.println(o);
        }
    }

    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){
        System.out.println("xiao");
}
    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){
        System.out.println("shuang");
    }
}
