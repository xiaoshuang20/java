package study.面向对象.File类;

import java.io.File;

/*
    File类遍历(文件夹)目录功能
        - public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或目录
        - public File[] listFiles(): 返回一个File数组，表示该File目录中的所有的子文件或目录

    注意:
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在,会抛出空指针异常
        如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 */
public class demo_06 {

    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录
        遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件夹封装为File对象,多个File对象存储到File数组中
    */
    private static void show02() {
        File file = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
        public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或目录
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
    */
    private static void show01() {
         // File file = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类\\a.txt");    //NullPointerException
        File file = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象\\File类");
        // 隐藏文件也能遍历
        String[] arr = file.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }
}
