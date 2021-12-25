package study.面向对象.List_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo_07 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 往集合中添加多个元素
        // list.add("a");
        // list.add("b");
        // list.add("c");
        // list.add("d");
        // list.add("e");

        // public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);   // [a, b, c, d, e]

        // public static void shuffle(List<?> list): 打乱集合顺序
        // 见斗地主案例
        Collections.shuffle(list);
        System.out.println(list);


        /*
            public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
            注意:
                 sort(List<T> list) 使用前提
                 被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

            Comparable接口的排序规则:
                自己(this) - 参数: 升序
                参数 - 自己(this): 降序
         */
        // 基本的包装类中都有对compareTo方法的重写
        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(1);
        list_1.add(3);
        list_1.add(2);
        System.out.println(list_1); // [1, 3, 2]

        Collections.sort(list_1);   // 默认是升序
        System.out.println(list_1); // [1, 2, 3]

        ArrayList<String> list_2 = new ArrayList<>();
        list_2.add("a");
        list_2.add("c");
        list_2.add("b");
        System.out.println(list_2); // [a, c, b]

        Collections.sort(list_2);
        System.out.println(list_2); // [a, b, c]


        // 自定义的对象排序肯定是要自定义排序规则的
        ArrayList<Person_2> list_3 = new ArrayList<>();
        list_3.add(new Person_2("张三",18));
        list_3.add(new Person_2("李四",20));
        list_3.add(new Person_2("王五",15));
        System.out.println(list_3);

        Collections.sort(list_3);   // 自定义按年龄排序
        System.out.println(list_3);


        /*
             public static <T> void sort(List<T> list，Comparator<? super T> ): 将集合中元素按照指定规则排序

             Comparator和Comparable的区别
                Comparable: 自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
                Comparator: 相当于找一个第三方的裁判,比较两个

            Comparator的排序规则:
                o1 - o2:升序
         */
        ArrayList<Integer> list_4 = new ArrayList<>();
        list_4.add(1);
        list_4.add(3);
        list_4.add(2);
        System.out.println(list_4); // [1, 3, 2]

        Collections.sort(list_4, new Comparator<Integer>() {
            // 知识回顾：匿名内部类
            // 重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                // return o1 - o2;    //升序
                return o2 - o1;   //降序
            }
        });
        System.out.println(list_4);

        ArrayList<Student> list_5 = new ArrayList<>();
        list_5.add(new Student("a迪丽热巴",18));
        list_5.add(new Student("古力娜扎",20));
        list_5.add(new Student("杨幂",17));
        list_5.add(new Student("b杨幂",18));
        System.out.println(list_5);

        // 自定义排序规则
        Collections.sort(list_5, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄升序排序
                int result =  o1.getAge() - o2.getAge();
                // 如果两个人年龄相同,再使用姓名的第一个字比较
                if(result == 0){
                    result =  o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return  result;
            }
        });
        System.out.println(list_5);
    }
}
