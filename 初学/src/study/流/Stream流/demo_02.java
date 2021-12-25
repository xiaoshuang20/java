package study.流.Stream流;

import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口（这并不是一个函数式接口）
    获取一个流非常简单，有以下几种常用的方式：
        1.所有的Collection集合都可以通过stream默认方法获取流
            - List<String> list = new ArrayList<>();
              Stream<String> stream1 = list.stream();

            - Set<String> set = new HashSet<>();
              Stream<String> stream2 = set.stream();

            - Map<String,String> map = new HashMap<>();
              Set<String> keySet = map.keySet();
              Stream<String> stream3 = keySet.stream();

              Collection<String> values = map.values();
              Stream<String> stream4 = values.stream();

              Set<Map.Entry<String, String>> entries = map.entrySet();
              Stream<Map.Entry<String, String>> stream5 = entries.stream();


        2.Stream接口的静态方法of可以获取数组对应的流
            - Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);

            - Integer[] arr = {1,2,3,4,5};
              Stream<Integer> stream7 = Stream.of(arr);

            - String[] arr2 = {"a","bb","ccc"};
              Stream<String> stream8 = Stream.of(arr2);
 */

/*
    Stream流中的常用方法: forEach()
        void forEach(Consumer<? super T> action);
    该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理
    简单记:
        forEach方法,用来遍历流中的数据
        是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法

    Stream流中的常用方法: filter()
        Stream<T> filter(Predicate<? super T> predicate);
    该方法接收一个Predicate接口函数，对数据进行过滤（根据Predicate的返回值），返回的还是一个Stream流

 */
public class demo_02 {

    public static void main(String[] args) {
        // 获取一个Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        // 使用Stream流中的方法forEach对Stream流中的数据进行遍历
        stream1.forEach(name -> System.out.println(name));
        // 好像可以更简单
        Stream.of("x", "i", "a", "o").forEach(s -> System.out.print(s));
        System.out.println("==================================");



        // 对Stream流中的元素进行过滤,只要姓张的人，并打印
        // forEach()后就不能再使用Stream流了（已经关闭）
        stream1.filter(n -> n.startsWith("张"))
                .forEach(n -> System.out.println(n));
    }
}
