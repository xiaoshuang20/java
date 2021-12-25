package study.面向对象.File类;

import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists(): 此File表示的文件或目录是否实际存在
        - public boolean isDirectory(): 此File表示的是否为目录
        - public boolean isFile(): 此File表示的是否为文件
 */
public class demo_04 {

    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        public boolean isDirectory(): 此File表示的是否为目录
            用于判断构造方法中给定的路径是否以文件夹结尾

        public boolean isFile(): 此File表示的是否为文件
            用于判断构造方法中给定的路径是否以文件结尾

        注意:
            电脑的硬盘中只有文件/文件夹,两个方法是互斥
            这两个方法使用前提是路径必须存在,否则都返回false
     */
    private static void show02() {
        File f1 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类");

        // 不存在,就没有必要获取
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("初学.iml");
        if(f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
    }

    /*
        public boolean exists()： 此File表示的文件或目录是否实际存在
        用于判断构造方法中的路径是否存在
            存在:true
            不存在:false
     */
    private static void show01() {
        File f1 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类");
        System.out.println(f1.exists());

        File f2 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\F");
        System.out.println(f2.exists());

        // 再次注意：该项目的相对路径为：D:\学习\java\IdeaProjects\初学\
        File f3 = new File("初学.iml");    // 相对路径
        System.out.println(f3.exists());

        File f4 = new File("a.txt");    // 不存在
        System.out.println(f4.exists());

        System.out.println("-----------------------------------");
    }
}
