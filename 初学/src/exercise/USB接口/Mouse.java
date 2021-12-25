package exercise.USB接口;

// 鼠标是一种USB设备
public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标");
    }

    public void use() {
        System.out.println("使用鼠标中。。。");
    }
}
