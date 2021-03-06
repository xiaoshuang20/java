package study.面向对象.Object类;

import java.util.Objects;

public class Person {

    private int age;
    private String name;

    //  @Override
    //  public String toString() {
    //      return "Person{name: " + name + "; age: " + age + "}";
    //  }   可以自动生成

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 这几个判断增加了程序的效率
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o; // 向下转型后才能用子类中的特有属性
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
