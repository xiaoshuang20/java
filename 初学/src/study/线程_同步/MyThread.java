package study.线程_同步;

/*
    获取线程的名称:
        1.使用Thread类中的方法 getName()
            String getName(): 返回该线程的名称
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
            static Thread currentThread(): 返回对当前正在执行的线程对象的引用

    设置线程的名称:(了解)
        1.使用Thread类中的方法setName(名字)
            void setName(String name): 改变线程名称，使之与参数 name 相同
        2.创建一个带参数的构造方法,参数传递线程的名称;调用父类的带参构造方法,把线程名称传递给父类,让父类(Thread)给子线程起一个名字
            Thread(String name) 分配新的 Thread 对象
 */

// 1.创建一个Thread类的子类
public class MyThread extends Thread {

    public MyThread () {}

    public MyThread(String name){
        super(name);    //把线程名称传递给父类,让父类(Thread)给子线程起一个名字
    }

    // 2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么)
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("run:" + i);
        }

        // 获取线程名称
        // String name = getName();
        // System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t);   // Thread[Thread-0,5,main]
        String name = t.getName();
        System.out.println(name);

        // 链式编程 (我觉得好像可以直接getName() ---- 可以，这是在创建Thread类或其子类的前提下)
        System.out.println(Thread.currentThread().getName());
    }
}
