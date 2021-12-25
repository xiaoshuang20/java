package study.面向对象.Object类;

import java.util.Date;

public class demo_02 {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // 距 1970.1.1 00:00:00过了多少毫秒

        Date d1 = new Date();
        System.out.println(d1);  // 获取本地的当前时间
        Date d2 = new Date(60000);
        System.out.println(d2); // 从1970.1.1 00:00:00开始经过参数 date指定的毫秒数后的日期
        System.out.println(d1.getTime());   // 返回自1970.1.1 00:00:00以来，该对象表示的毫秒数，类似第一个打印语句中的方法

    }
}
