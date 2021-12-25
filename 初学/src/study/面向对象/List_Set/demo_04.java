package study.面向对象.List_Set;


import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */
public class demo_04 {

    public static void main(String[] args) {
        // 创建HashSet集合存储Person
        HashSet<Person_1> set = new HashSet<>();
        Person_1 p1 = new Person_1("小美女",18);
        Person_1 p2 = new Person_1("小美女",18);
        Person_1 p3 = new Person_1("小美女",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1 == p2);   // false，证明还是不同地址 (两个new)
        System.out.println(p1.equals(p2));  // true，方法被重写
        // p1、p2内容相同，视为相同原宿，在Hashset中不重复存储
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
