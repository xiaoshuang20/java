package study.面向对象.File类;

// 注：该文件看看就行，别运行了

import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        - public boolean createNewFile(): 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
        - public boolean delete(): 删除由此File表示的文件或目录
        - public boolean mkdir(): 创建由此File表示的目录
        - public boolean mkdirs(): 创建由此File表示的目录，包括任何必需但不存在的父目录
 */
public class demo_05 {

    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }

    /*
        public boolean delete(): 删除由此File表示的文件或目录
        此方法,可以删除构造方法路径中给出的文件/文件夹
        返回值:布尔值
            true:文件/文件夹删除成功,返回true
            false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
        注意:
            delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
    private static void show03() {
        File f1 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类\\b.txt");
        boolean b1 = f1.delete();
        System.out.println("b1:" + b1);

        File f2 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类\\zxs");
        System.out.println(f2.delete());
    }

    /*
       public boolean mkdir(): 创建单级空文件夹
       public boolean mkdirs(): 既可以创建单级空文件夹,也可以创建多级文件夹
       创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件夹不存在,创建文件夹,返回true
            false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
     */
    private static void show02() {
        File f1 = new File("aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:" + b1);

        File f2 = new File("111\\222\\333\\444");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:" + b2);

        File f3 = new File("abc.txt");
        boolean b3 = f3.mkdirs();   // 别被名称迷惑，这还是一个文件夹
        System.out.println("b3:" + b3);

        System.out.println("---------------------------");
    }

    /*
        public boolean createNewFile(): 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
            创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常

        public boolean createNewFile() throws IOException
        createNewFile声明抛出了IOException,调用这个方法,就必须的处理这个异常,要么throws,要么try-catch
     */
    private static void show01() throws IOException {
        File f1 = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类\\b.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:" + b1);

        // File f2 = new File("新建文件夹");
        // System.out.println(f2.createNewFile()); // 这还是文件,不要被名称迷糊,要看类型

        // File f3 = new File("1234\\3.txt");
        // System.out.println(f3.createNewFile()); //路径不存在,抛出IOException

        System.out.println("----------------------------------");
    }
}
