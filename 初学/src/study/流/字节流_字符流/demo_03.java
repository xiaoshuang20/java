package study.流.字节流_字符流;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
        此抽象类是表示字节输入流的所有类的超类

    定义了所有子类共性的方法:
         int read(): 从输入流中读取数据的下一个字节
         int read(byte[] b): 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中
         void close(): 关闭此输入流并释放与该流关联的所有系统资源

    java.io.FileInputStream extends InputStream
        FileInputStream:文件字节输入流
    作用:把硬盘文件中的数据,读取到内存中使用

    构造方法:
        FileInputStream(String name)
        FileInputStream(File file)
        参数:读取文件的数据源
            String name:文件的路径
            File file:文件
        构造方法的作用:
            1.创建一个FileInputStream对象
            2.把FileInputStream对象指定构造方法中要读取的文件

    字节输入流的使用步骤(重点):
        1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read,读取文件
        3.释放资源


    字节输入流一次读取多个字节的方法:
        int read(byte[] b): 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中
    明确两件事情:
        1.方法的参数byte[]的作用
            起到缓冲作用,存储每次读取到的多个字节
            数组的长度一把定义为1024(1kb)或者1024的整数倍
        2.方法的返回值int是什么
            每次读取的有效字节个数

    String类的构造方法
        String(byte[] bytes): 把字节数组转换为字符串
        String(byte[] bytes, int offset, int length): 把字节数组的一部分转换为字符串
            offset:数组的开始索引
            length:转换的字节个数
 */
public class demo_03 {

    public static void main(String[] args) throws IOException {
        // 1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("src\\study\\字节流_字符流\\a.txt");

        // 2.使用FileInputStream对象中的方法read,读取文件
        /*
            布尔表达式(len = fis.read())!=-1
                1.fis.read():读取下一个字节
                2.len = fis.read():把读取到的字节赋值给变量len
                3.(len = fis.read()) != -1:判断变量len是否不等于-1
         */
        int len = 0; // 记录读取到的字节
        // while((len = fis.read()) != -1){
        //     System.out.print(len);   // 这里的len是读取到的ASCII码
        // }

        // 一次读取多个字节
        byte[] bytes = new byte[1024];  // 存储读取到的多个字节
        while((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));  // 这里的len是读取到字节的个数
        }

        // 3.释放资源
        fis.close();
    }
}
