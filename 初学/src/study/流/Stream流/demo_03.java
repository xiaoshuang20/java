package study.流.Stream流;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
    Stream流中的常用方法: map()
        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    如果需要将流中的元素映射到另一个流中，可以使用map方法
    该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流


    Stream流中的常用方法: count()
        long count();
    count方法是一个终结方法,返回值是一个long类型的整数,后面不能再使用Stream流


    Stream流中的常用方法: limit()
        Stream<T> limit(long maxSize);
            参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作
    limit方法可以对流进行截取，只取用前n个
    limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流


    Stream流中的常用方法: skip()
        Stream<T> skip(long n);
    如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流
    注：如果流的当前长度小于n，将会得到一个长度为0的空流（即没有n个元素可以跳过）


    Stream流中的常用方法: concat()
        static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
 */
public class demo_03 {
    public static void main(String[] args) {
        // 获取一个String类型的Stream流
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        // 使用map方法,把字符串类型的整数,转换(映射)为Integer类型的整数
        stream1.map(n -> Integer.parseInt(n))
              .forEach(n -> System.out.println(n));


        System.out.println("==========================");
        // 获取一个Stream流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        long count = list.stream().count();
        System.out.println(count);


        System.out.println("============================");
        // 创建一个数组
        String[] arr = {"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"};
        // 使用limit对Stream流中的元素进行截取,只要前3个元素
        // 再遍历stream2流
        Stream.of(arr)
              .limit(3)
              .forEach(n -> System.out.println(n));


        System.out.println("=================================");
        // 使用skip方法跳过前3个元素
        // 遍历stream2流
        Stream.of(arr)
              .skip(3)
              .forEach(n -> System.out.println(n));


        System.out.println("==================================");
        // 创建一个Stream流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "周芷若", "张无忌");
        // 把两个流组合为一个流（数据合并）
        // 再遍历concat流
        Stream.concat(stream, Stream.of(arr))
              .forEach(n -> System.out.println(n));
    }
}
