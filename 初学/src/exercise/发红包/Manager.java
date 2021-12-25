package exercise.发红包;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {

    public Manager(String name, int money) {
        super(name, money);
    }

    // 发红包
    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        // 剩余的金额
        int leftMoney = super.getMoney();
        // 若金额不足
        if (totalMoney > leftMoney) {
            System.out.println("当前余额不足！");
            // 直接退出，阻止后续代码
            return list;
        }

        // 金额充足，扣钱
        super.setMoney(leftMoney - totalMoney);
        // 金额平均分成count份
        int avg = totalMoney / count;
        // 有时会有余数
        int mod = totalMoney % count;
        // 将余数随机分配给其中一个红包
        int more = new Random().nextInt(count);
        for (int i = 0; i < count; i++) {
            if (i == more) {
                list.add(avg + mod);
            } else {
                list.add(avg);
            }
        }
        return list;
    }
}
