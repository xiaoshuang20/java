package exercise.USB接口;

public class Main {
    public static void main(String[] args) {
        // 先创建一个电脑对象
        Computer computer = new Computer();
        // 开机
        computer.powerOn();

        // 准备一个鼠标
        Mouse mouse = new Mouse();
        computer.useDevice(mouse);  // 使用该USB设备

        // 准备一个键盘
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);   // 使用该USB设备

        // 断开所有USB设备
        computer.removeDevice(mouse);
        computer.removeDevice(keyboard);

        // 关机
        computer.powerOff();

    }
}
