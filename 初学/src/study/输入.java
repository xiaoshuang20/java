package study;
import java.util.Scanner;

public class 输入 {
    public static void main(String[] args) {

        // 除了java.lang包下的内容不需要导包外，其他的包都需要import导入
        // 键盘输入事件
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据：");
        // 获取键盘输入的一个int数据
        // 键盘输入的其实全是字符串 (同py)，该方法将字符串转化为int型数据
        int age = sc.nextInt();
        // 只输入sc.nextInt()，然后alt + enter 可以将代码补全为下面形式，有返回值的函数调用也可以
        int i = sc.nextInt();
        // 获取键盘输入的一个String数据
        String name = sc.next();

        // 光new不起名字为匿名对象，匿名对象可以作为函数参数和返回值
        // 当确定只需要一次输入时可以直接使用匿名对象形式
        String sex = new Scanner(System.in).next();
        System.out.println(sex);

        System.out.println(age);
        System.out.println(name);
    }
}
