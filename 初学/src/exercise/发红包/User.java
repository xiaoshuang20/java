package exercise.发红包;

// 基类用户
public class User {

    private String name;
    private int money;

    public void show() {
        System.out.println("我是" + name + ", 余额为" + money);
    }

    // 构造函数
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // Setter/Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
