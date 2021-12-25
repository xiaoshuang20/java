package study.异常;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    finally代码块：
        1.finally不能单独使用,必须和try一起使用
        2.finally一般用于资源释放(资源回收),无论程序是否出现异常,最后都要资源释放(IO)

    注：如果finally有return语句,永远返回finally中的结果,避免该情况
 */
public class demo_05 {

    public static void main(String[] args) {
        try {
            // 可能会产生异常的代码
            readFile("c:\\a.tx");
        } catch (IOException e) {
            // 异常的处理逻辑 (打印红字)
            e.printStackTrace();
        } finally {
            // 无论是否出现异常,都会执行
            System.out.println("资源释放");
        }
    }

    public static void readFile(String fileName) throws IOException {

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }

        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }

        System.out.println("路径没有问题,读取文件");
    }
}
