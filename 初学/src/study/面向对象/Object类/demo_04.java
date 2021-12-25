package study.面向对象.Object类;

import java.util.Calendar;
import java.util.Date;

/*
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */
public class demo_04 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);


        // public Date getTime()
        // 返回一个表示此Calendar时间值的Date对象,把日历对象转换为日期对象
        Date d = c.getTime();
        System.out.println(d);


        // 1. public int get(int field): 返回指定日历字段的值
        // 2. public abstract void add(int field, int amount)
        // int field:传递指定的日历字段; int amount:增加/减少指定的值
        // 根据日历的规则，为给定的日历字段添加或减去指定的时间量。把指定的字段增加/减少指定的值
        c.add(Calendar.YEAR,2);     //把年增加2年
        c.add(Calendar.MONTH,-3);   //把月份减少3个月
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);  // 西方的月份0-11 东方:1-12
        // int date = c.get(Calendar.DAY_OF_MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(date);


        // 3. public void set(int field, int value)
        // 将日历字段设置为给定值
        c.set(Calendar.YEAR, 9999);  // 设置年为9999
        c.set(Calendar.MONTH, 9);    // 设置月为9月
        c.set(Calendar.DATE, 9);     // 设置日9日
        // 可以同时设置年月日,可以使用set的重载方法
        c.set(8888,8,8);

        Date d1 = c.getTime();
        System.out.println(d1);

    }
}
