package exercise.Stream流实例;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    练习:集合元素处理（传统方式）
        现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
        1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
        2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中
        3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中
        4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中
        5. 将两个队伍合并为一个队伍；存储到一个新集合中
        6. 根据姓名创建Person对象；存储到一个新集合中
        7. 打印整个队伍的Person对象信息
        -- 就不写了

    练习：集合元素处理（Stream方式）
        将上一题当中的传统for循环写法更换为Stream流式处理方式
        两个集合的初始内容不变，Person类的定义也不变
 */
public class 集合元素处理 {

    public static void main(String[] args) {
        // 第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        // 1. 第一个队伍只要名字为3个字的成员姓名
        // 2. 第一个队伍筛选之后只要前3个人
        Stream<String> oneStream = one.stream()
                                      .filter(name -> name.length() == 3)
                                      .limit(3);

        // 第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("张无忌");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        // 3. 第二个队伍只要姓张的成员姓名
        // 4. 第二个队伍筛选之后不要前2个人
        Stream<String> twoStream = two.stream()
                                      .filter(name -> name.startsWith("张"))
                                      .skip(2);

        // 5. 将两个队伍合并为一个队伍
        // 6. 根据姓名创建Person对象()
        // 7. 打印整个队伍的Person对象信息（数据类型转变）
        /*
            使用方法引用优化Lambda表达式
            构造方法new Person(String name) 已知
            创建对象已知 new
            就可以使用Person引用new创建对象
         */
        Stream.concat(oneStream, twoStream)
              .map(Person::new)
              .forEach(System.out::println);
    }
}
