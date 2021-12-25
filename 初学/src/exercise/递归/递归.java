package exercise.递归;

import java.io.File;

/*
    练习:
        递归打印多级目录
 */
public class 递归 {

    public static void main(String[] args) {
        File file = new File("D:\\学习\\java\\IdeaProjects\\初学\\src\\study\\面向对象");
        getAllFile(file);
    }

    /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
    */
    public static void getAllFile(File dir){
        System.out.println(dir);    // 打印被遍历的目录名称
        File[] files = dir.listFiles();
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
