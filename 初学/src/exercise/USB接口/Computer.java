package exercise.USB接口;

public class Computer {

    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    // 使用USB设备
    public void useDevice(USB usb) {
        usb.open();     // 打开设备
        // 判断是什么设备再使用
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.use();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.use();
        }
    }

    public void removeDevice(USB usb) {
        usb.close();    // 关闭设备
    }
}
