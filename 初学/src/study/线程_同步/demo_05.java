package study.线程_同步;

/*
    模拟卖票案例
    创建3个线程,同时开启,对共享的票进行出售
    连接 -- RunnableImpl3、RunnableImpl4、RunnableImpl5
 */
public class demo_05 {

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl5 run = new RunnableImpl5();

        // 创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        // 调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}
