package study.面向对象;

public class students {
    // 第一行别忘了啊
    public static void main(String[] args) {

        // 对应的类为同目录下的Student文件，在同一个目录下可以省略其导入路径
        // 不同目录下导入类格式为：import 包名称.类名称

        // 创建对象格式
        // new 的都在堆里
        Student stu = new Student();
        stu.name = "xiao";
        // stu.age = 18;
        stu.setAge(18);
        int age = stu.getAge();
        System.out.println(age);

        stu.setMan(true);
        boolean man = stu.isMan();
        System.out.println(man);

        stu.sex = 'm';
        System.out.println(stu.name);

        stu.study();
        stu.sleep();

        // 对象数组
        Student[] students = new Student[2];
        Student stu1 = new Student();
        Student stu2 = new Student();
        students[0] = stu1;
        students[1] = stu2;

        students[0].study();
        students[1].sleep();

    }
}
