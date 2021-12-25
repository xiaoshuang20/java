package study.面向对象.List_Set;


import java.util.HashSet;

/*
    哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
    在Object类有一个方法,可以获取对象的哈希值
    int hashCode(): 返回该对象的哈希码值
    hashCode方法的源码:
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */
public class demo_03 {

    public static void main(String[] args) {
        // Person类继承了Object类,所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1); // 1967205423  | 1

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2); // 42121758   |  1

        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1); //  com.itheima.demo03.hashCode.Person@75412c2f
        System.out.println(p2); //  com.itheima.demo03.hashCode.Person@282ba1e
        System.out.println(p1 == p2);   // false

        /*
            String类的哈希值
                String类重写Obejct类的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());  //  96354
        System.out.println(s2.hashCode());  //  96354

        // 两个特殊的字符串
        System.out.println("重地".hashCode());    //  1179395
        System.out.println("通话".hashCode());    //  1179395


        // 创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        // Set集合不允许存储重复元素的原理
        String s_1 = new String("abc");
        String s_2 = new String("abc");
        // add()方法调用hashcode() 跟 equals()方法判断存入的数据是否相同，都为true时判定为相同数据，不存入
        set.add(s_1);
        set.add(s_2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);    // [重地, 通话, abc]
    }
}
