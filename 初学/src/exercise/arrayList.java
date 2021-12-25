package exercise;

import java.util.Random;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        // 20.fori
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1; // 1~100
            bigList.add(num);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);

        System.out.println("偶数总共有多少个：" + smallList.size());
        // samllList.fori
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    // 这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        // 创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }

}
