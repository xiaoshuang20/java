package study.流.字节流_字符流;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写:使用两个参数的构造方法
        FileOutputStream(String name, boolean append): 创建一个向具有指定 name 的文件中写入数据的输出文件流
        FileOutputStream(File file, boolean append): 创建一个向指定 File 对象表示的文件中写入数据的文件输出流
        参数:
           boolean append: 追加写开关
                true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
                false:创建一个新文件,覆盖源文件
 */
public class demo_02 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\study\\字节流_字符流\\b.txt",true);
        for (int i = 1; i <= 10 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
