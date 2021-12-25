package 挑战赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    仓库新进了几批物资，只知道每批物资的数量和单价，请编写程序，按照每种物资的总价值，由高到低次序输出
    输入说明：第1行 一个整数N，表明物资的批次数量
    第2 -- N+1行，每批物资的类别、数量及单价，中间用空格隔开，其中类别用A-Z加以区分。
    输出说明：按物资价值降序输出排序结果，每行输出一种物资。
    输入样例：5
        A 5 10.00
        B 3 2.00
        A 5 8.00
        B 3 2.50
        C 10 3.50
    输出样例：A 90.00
            C 35.00
            B 13.50
 */
public class demo_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 存在两个数组里
        List<String> name = new ArrayList<>();
        List<Float> sum = new ArrayList<>();
        int N = scanner.nextInt();
        String s;
        int num;
        float price;

        for (int i = 0; i < N; i++) {
            s = scanner.next();
            num = scanner.nextInt();
            price = scanner.nextFloat();

            // 如果物资已存在，则只改变其价值
            if(name.contains(s)) {
                for (int j = 0; j < name.size(); j++) {
                    // 字符串比较
                    if(name.get(j).equals(s)) {
                        sum.set(j, sum.get(j) + num * price);
                    }
                }
            } else {
                // 一起存，对应值的下标相同
                name.add(s);
                sum.add(num * price);
            }
        }

        String temp1;
        float temp2;
        // 根据价值排序
        for (int i = 0; i < name.size() - 1; i++) {
            for (int j = i + 1; j < name.size(); j++) {
                // 重点：要两个一起交换（name和 price）
                if(sum.get(i) < sum.get(j)) {
                    temp1 = name.get(i);
                    name.set(i, name.get(j));
                    name.set(j, temp1);

                    temp2 = sum.get(i);
                    sum.set(i, sum.get(j));
                    sum.set(j, temp2);
                }
            }
        }

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + " " + sum.get(i));
        }
    }
}
