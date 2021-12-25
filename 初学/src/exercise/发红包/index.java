package exercise.发红包;

import java.util.ArrayList;

public class index {

    public static void main(String[] args) {

        // 创建对象
        Manager manager = new Manager("xiao", 1000);
        Member member1 = new Member("test1", 0);
        Member member2 = new Member("test2", 10);
        Member member3 = new Member("test3", 5);

        // 成员展示
        System.out.println("该群人员如下：");
        manager.show(); // 1000
        member1.show(); // 0
        member2.show(); // 10
        member3.show(); // 5
        System.out.println("===========");

        // 发红包了
        ArrayList<Integer> list1 = manager.send(30, 3);
        member1.receive(list1);
        member2.receive(list1);
        member3.receive(list1);
        System.out.println("第一次发红包后：");
        manager.show(); // 970
        member1.show(); // 10
        member2.show(); // 20
        member3.show(); // 15
        System.out.println("===========");
        ArrayList<Integer> list2 = manager.send(50, 3);
        member1.receive(list2);
        member2.receive(list2);
        member3.receive(list2);
        System.out.println("第二次发红包后：");
        manager.show(); // 920
        member1.show(); // 看运气
        member2.show();
        member3.show();
    }
}
