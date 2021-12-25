package study.面向对象;

public class Student {

    // 成员变量
    String name;
    private int age;
    private boolean man;
    char sex;

    // 构造函数 (alt + lns 打开Generate面板可以快速生成这些代码)
    public Student() {
        }
    public Student(String name, int age, boolean man, char sex) {
            this.name = name;
            this.age = age;
            this.man = man;
            this.sex = sex;
    }

    // 对于private变量，需要定义一对setter/getter方法间接访问
    // 这个名称是固定的，不可有返回值
    public void setAge(int x) {
        if (x < 100 && x > 0) {
            age = x;
        } else {
            System.out.println("数据不合理！");
        }
    }
    // 不可有参数
    // 返回值类型注意对应
    public int getAge() {
        return age;
    }

    // 同名冲突，加上this.
    public void setMan(boolean man) {
        this.man = man;
    }
    // 特例：对于布尔值的getter函数是用is
    public boolean isMan() {
        return man;
    }

    // 成员方法
    public void study() {
        System.out.println("我要学习！");
    }

    public void sleep() {
        System.out.println("我要睡觉！");
    }
}
