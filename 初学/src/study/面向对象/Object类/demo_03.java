package study.面向对象.Object类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class demo_03 {

    public static void main(String[] args) throws ParseException {
        // String format (Date date)        将日期按格式字符串化
        // Date parse (String source)       将符合格式的字符串转化为日期

        Date d = new Date();
        // DataFormat 是一个抽象类，不能直接使用
        // 使用其子类 SimpleDateFormat创建对象，括号内为指定日期格式 (连接符可以改)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        Date d1 = sdf.parse("2021-09-20  19:13:23");
        System.out.println(d1);
    }
}
