package exercise;

// 自动导包
import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {

        // Random类: 随机生成数字
        boolean active;
        Scanner sc = new Scanner(System.in);
        // 只有10次机会，利用do-while()
        do {
            // 生成的随机数重置
            // 无参数，int范围内的随机；有一个参数x，[0, x)范围内的随机
            // Random r = new Ramdom();
            // int x = r.nextInt(100) + 1;
            int x = new Random().nextInt(100) + 1; // [1, 100]间的随机数
            System.out.println("请输入猜测的数字");
            // 次数重置
            int count = 0;
            do {
                count++;
                int i = sc.nextInt();
                if (i == x) {
                    System.out.println("Congratulation!");
                    System.out.println("You guess " + count + " times.!");
                    break;
                } else if (i > x) {
                    System.out.println("Too big!");
                } else {
                    System.out.println("Too small!");
                }
            } while (count < 10);

            // 10次未中
            if (count == 10) {
                System.out.println("Game over!");
            }
            // 是否再来一次
            // 输入yes后不能跟"yes"比较啊，奇奇怪怪(已解决)
            // 对于引用类型来说，==是进行【地址值】的比较，若想比较字符串本身，利用函数.equals()
            // 字符串也可以直接使用equals()方法，”Hello“.equals("hello")  false
            System.out.println("If you want to try again ?('yes' or 'no')");
            String again = sc.next();
            if (again.equals("yes")) {
                active = true;
            } else {
                active = false;
                System.out.println("程序退出中。。。。。。");
            }
        } while (active);

//        boolean active = true;
//        while (active) {
//            count += 1;
//            // 多次猜测，为其创建一个输入对象
//            int n = sc.nextInt();
//            if (n == x) {
//                System.out.println("Congratulation!");
//                System.out.println("You guess" + count + "times.!");
//                active = false;
//            } else if (n > x) {
//                System.out.println("Too big!");
//            } else {
//                System.out.println("Too small!");
//            }
//        }
//
//        if (count <= 3) {
//            System.out.println("买彩票吧!");
//        } else if (count <= 7) {
//            System.out.println("总算猜对了");
//        } else {
//            System.out.println("你智商余额不足，请及时充值！");
//        }
    }
}
