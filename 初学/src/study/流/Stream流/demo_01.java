package study.流.Stream流;

import java.util.ArrayList;
import java.util.List;

/*
    使用传统方法需要创建三个数组，使用三次循环

    使用Stream流的方式,遍历集合,对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么,而不是怎么做
 */
public class demo_01 {

    public static void main(String[] args) {
        // 创建一个List集合,存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        // 对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        // 遍历listB集合

        /*
            这个filter()里应该还有一些操作：Predicate判断为true时将数据返回存入暂时的数组

            filter()最后返回的是stream流，其功能类似与C++中的cin和cout，可以实现连续操作，
            而forEach()无返回(看源码)，所以其后面不能再操作
         */
        list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
