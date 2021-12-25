package study.面向对象.List_Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点:
        1.不允许存储重复的元素
        2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历

    java.util.HashSet集合 implements Set接口
    HashSet特点:
         1.不允许存储重复的元素
         2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历
         3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
         4.底层是一个哈希表结构(查询的速度非常的快)
 */
public class demo_02 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // 使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1); // 重复的元素会去掉
        // 使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);  // 1,2,3
        }
        // 使用增强for遍历set集合
        // 注：没有索引是不能使用普通的for循环遍历，普通的for循环遍历才需要索引访问元素
        System.out.println("-----------------");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
