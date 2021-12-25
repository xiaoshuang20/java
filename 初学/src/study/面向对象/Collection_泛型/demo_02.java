package study.面向对象.Collection_泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口: 迭代器(对集合进行遍历)
    两个常用的方法
        boolean hasNext(): 如果仍有元素可以迭代，则返回 true
        E next(): 返回迭代的下一个元素,没有元素,在取出元素会抛出NoSuchElementException异常
    Iterator迭代器,是一个接口,无法直接使用
    Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
        Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器

    迭代器的使用步骤(重点):
        1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
        3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class demo_02 {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        // 往集合中添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");

        // <E> 注意泛型类型
        Iterator<String> it = coll.iterator();

        // 两种循环方式
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("----------------------");

        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }
    }
}
