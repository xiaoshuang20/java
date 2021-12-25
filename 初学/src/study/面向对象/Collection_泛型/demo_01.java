package study.面向对象.Collection_泛型;

import java.util.Collection;
import java.util.HashSet;

/*
    共性的方法:
      public boolean add(E e)：        把给定的对象添加到当前集合中
      public void clear()              清空集合中所有的元素
      public boolean remove(E e)       把给定的对象在当前集合中删除
      public boolean contains(E e)     判断当前集合中是否包含给定的对象
      public boolean isEmpty()         判断当前集合是否为空
      public int size()                返回集合中元素的个数
      public Object[] toArray()        把集合中的元素，存储到数组中
 */
public class demo_01 {

    public static void main(String[] args) {
        // Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);   // 打印出的不是地址值，证明重写了toString方法


        // public boolean add(E e)
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);   // 添加成功 true
        System.out.println(coll);
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);


        // public boolean remove(E e)
        boolean b2 = coll.remove("赵六");   // 无改元素，false
        System.out.println("b2:" + b2);

        boolean b3 = coll.remove("李四");
        System.out.println("b3:" + b3);
        System.out.println(coll);


        // public boolean contains(E e)
        boolean b4 = coll.contains("张三");
        System.out.println("b4:" + b4);    // 包含，true

        boolean b5 = coll.contains("赵四");
        System.out.println("b5:" + b5);    // 不包含，false


        // public boolean isEmpty()
        boolean b6 = coll.isEmpty();
        System.out.println("b6:" + b6);   // coll不为空，false

        // public int size()
        int size = coll.size();
        System.out.println("size:" + size);

        // public Object[] toArray()
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // public void clear()
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty()); //为空，true
    }
}
