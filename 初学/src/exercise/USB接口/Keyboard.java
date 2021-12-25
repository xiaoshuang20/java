package exercise.USB接口;

// 键盘是一种USB设备
public class Keyboard implements USB {

    @Override
    public void open() {
        System.out.println("连接键盘");
    }

    @Override
    public void close() {
        System.out.println("断开键盘");
    }

    public void use() {
        System.out.println("使用键盘中。。。");
    }
}
