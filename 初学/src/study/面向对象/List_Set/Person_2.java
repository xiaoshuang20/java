package study.面向对象.List_Set;

public class Person_2 implements Comparable<Person_2>{
    private String name;
    private int age;

    public Person_2() {
    }

    public Person_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person_2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写排序的规则
    @Override
    public int compareTo(Person_2 o) {
        // return 0;    // 认为元素都是相同的
        //  自定义比较的规则,比较两个人的年龄(this,参数Person)
        return this.getAge() - o.getAge();   // 年龄升序排序
        // return o.getAge() - this.getAge();  // 年龄升序排序
    }
}
