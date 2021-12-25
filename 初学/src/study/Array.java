package study;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] nums = new int[5];
        String[] strings = new String[2];

        // 静态创建初始化
        float[] numfs = new float[] {2, 1};
        String[] string = {"Hello", "world", "java"};
        
        // string.fori  这是正序
        // string.forr  这是倒序
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i] + ',');
        }

        // 数组转换为字符串 (会自动引入上面的包)
        System.out.println(Arrays.toString(string));


        // ArrayList 集合，其长度可变
        // <> 内代表泛型，即集合内的数据类型
        // 注意：泛型只能是引用类型，不能是基本类型 (int, float ...)
        ArrayList<String> list = new ArrayList<>();
        // .add()    向集合中添加值，返回布尔值
        list.add("xiao");
        list.add("shuang");
        System.out.println(list);
        // .get(index)  返回对应索引的值
        System.out.println(list.get(0));
        // .remove(index)   删除对应索引的值并将其返回
        System.out.println(list.remove(0));
        System.out.println(list);
        // .size()  返回集合长度
        System.out.println(list.size());

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        System.out.println(listInt);

    }
}
