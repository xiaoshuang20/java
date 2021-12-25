package exercise;

import java.util.function.Consumer;

public class Consumer接口实例 {

    public static void main(String[] args) {
        String[] s = {"xiao,男", "shuang,男", "晓,女"};
        printInfo(
                n -> System.out.print("姓名：" + n.split(",")[0]),
                n -> System.out.println("，性别：" + n.split(",")[1]),
                s
        );

    }

    // 看看就知道干啥了
    public static void printInfo(Consumer<String> con1, Consumer<String> con2, String[] array) {
        for(String info : array) {
            con1.andThen(con2).accept(info);
        }
    }
}
