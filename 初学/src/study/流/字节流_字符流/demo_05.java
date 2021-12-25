package study.流.字节流_字符流;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:字符输出流,是所有字符输出流的最顶层的父类,是一个抽象类

    共性的成员方法:
        - void write(int c): 写入单个字符
        - void write(char[] cbuf): 写入字符数组
        - abstract void write(char[] cbuf, int off, int len): 写入字符数组的某一部分
        - void write(String str): 写入字符串
        - void write(String str, int off, int len): 写入字符串的某一部分
        - void flush(): 刷新该流的缓冲
        - void close(): 关闭此流，但要先刷新它
    注：
        flush()：刷新后缓冲区后，字符输出流对象可以继续使用
        close()：刷新后缓冲区后，字符输出流对象不能继续使用

    java.io.FileWriter extends OutputStreamWriter extends Writer
        FileWriter:文件字符输出流
        作用:把内存中字符数据写入到文件中

    构造方法:
        FileWriter(File file): 根据给定的 File 对象构造一个 FileWriter 对象
        FileWriter(String fileName): 根据给定的文件名构造一个 FileWriter 对象
        参数:写入数据的目的地
            String fileName:文件的路径
            File file:是一个文件
        构造方法的作用:
            1.会创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径,创建文件
            3.会把FileWriter对象指向创建好的文件

    字符输出流的使用步骤(重点):
        1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        4.释放资源(会先把内存缓冲区中的数据刷新到文件中)

    续写和换行
        续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String fileName,File file:写入数据的目的地
            boolean append:续写开关
                true:不会创建新的文件覆盖源文件,可以续写;
                false:创建新的文件覆盖源文件
 */
public class demo_05 {

    public static void main(String[] args) throws IOException {
        // 1.创建FileWriter对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("src\\study\\字节流_字符流\\c.txt");

        // 2.使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        fw.write(97);

        // 3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        // fw.flush();

        // 4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fw.close();


        // 其它写入字符方法
        FileWriter fw1 = new FileWriter("src\\study\\字节流_字符流\\d.txt", true);
        char[] cs = {'a', 'b', 'c', 'd', 'e'};
        // void write(char[] cbuf): 写入字符数组
        fw1.write(cs);  // abcde

        // void write(char[] cbuf, int off, int len):写入字符数组的某一部分
        fw1.write(cs,1,3);  // bcd

        // void write(String str)写入字符串
        fw1.write("传智播客"+ "\n");  // 传智播客

        // void write(String str, int off, int len): 写入字符串的某一部分
        fw1.write("黑马程序员",2,3); // 程序员

        fw1.close();
    }
}
