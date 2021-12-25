package study.面向对象.File类;

import java.io.File;
import java.io.FileFilter;

/*
    可以使用过滤器来实现 exercise/递归/文件搜索 案例
    在File类中有两个ListFiles重载的方法,方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)
    java.io.FileFilter接口:用于抽象路径名(File对象)的过滤器
        作用:用来过滤文件(File对象)
        抽象方法:用来过滤文件的方法
            boolean accept(File pathname): 测试指定抽象路径名是否应该包含在某个路径名列表中
            参数:
                File pathname: 使用ListFiles方法遍历目录,得到的每一个文件对象

    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名
        作用:用于过滤文件名称
        抽象方法:用来过滤文件的方法
            boolean accept(File dir, String name): 测试指定文件是否应该包含在某一文件列表中
            参数:
                File dir:构造方法中传递的被遍历的目录
                String name:使用ListFiles方法遍历目录,获取的每一个文件/文件夹的名称
    注意:
        两个过滤器接口是没有实现类的,需要自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class demo_07 {

    public static void main(String[] args) {
        File file = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象");
        getAllFile(file);
    }

    /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
    */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());
        // 也可以使用匿名内部类
        // File[] files = dir.listFiles(new FileFilter() {
        //     @Override
        //     public boolean accept(File pathname) {
        //         // 过滤规则,pathname是文件夹或者是.java结尾的文件返回true
        //         return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
        //     }
        // });

        // 还可以使用Lambda表达式
        // File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");});


        for (File f : files) {
            // 对遍历得到的File对象f进行判断,判断是否是文件夹
            if(f.isDirectory()){
                // f是一个文件夹,则继续遍历这个文件夹
                getAllFile(f);
            } else {
                // f是一个文件,直接打印即可
                System.out.println(f);
            }
        }
    }
}
