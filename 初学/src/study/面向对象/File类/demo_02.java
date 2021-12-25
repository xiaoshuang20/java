package study.面向对象.File类;

import java.io.File;

/*
    路径:
        绝对路径:是一个完整的路径
            以盘符(c:,D:)开始的路径
        相对路径:是一个简化的路径
            相对指的是相对于当前项目的根目录
            如果使用当前项目的根目录,路径可以简化书写

        注意:
            1.路径是不区分大小写
            2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠
 */
public class demo_02 {

    public static void main(String[] args) {
        show01();
        show02("D:\\","a.txt");
        show03();
    }

    // 父路径是File类型,可以使用File的方法对路径进行一些操作,再使用路径创建对象
    private static void show03() {
        File parent = new File("D:\\");
        // 中间可以对父路径进行一些操作
        File file = new File(parent,"hello.java");
        System.out.println(file);
    }

    /*
        File(String parent, String child): 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例
        参数:把路径分成了两部分
            String parent:父路径
            String child:子路径
        好处:
            父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /*
        File(String pathname): 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
        参数:
            String pathname:字符串的路径名称
            路径可以是以文件结尾,也可以是以文件夹结尾
            路径可以是相对路径,也可以是绝对路径
            路径可以是存在,也可以是不存在
            创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
     */
    private static void show01() {
        // 绝对路径
        File f1 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类");
        System.out.println(f1); // 知识回顾：直接打印对象不为地址值，重写了toString方法

        // 相对路径
        File f2 = new File("a.txt");
        System.out.println(f2);
    }
}
