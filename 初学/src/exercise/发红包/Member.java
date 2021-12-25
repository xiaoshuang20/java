package exercise.发红包;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{

    public Member(String name, int money) {
        super(name, money);
    }

    // 收红包
    public void receive(ArrayList<Integer> list) {
        // 抢一个，少一个
        int index = new Random().nextInt(list.size());
        int money = list.remove(index);
        // 抢到的放到自己的余额中
        int left = super.getMoney();
        super.setMoney(left + money);
    }
}
