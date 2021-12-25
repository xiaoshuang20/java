package study.面向对象.Object类;

import java.util.Arrays;

public class demo_05 {

    public static void main(String[] args) {
        // System.currentTimeMillis(): 返回以毫秒为单位的当前时间
        long s1 = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 9999; i++) {
            sum += i;
        }
        System.out.println(sum);
        long s2 = System.currentTimeMillis();
        System.out.println("共花费" + (s2 - s1) + "秒");    // 测试程序的效率


        /*
         void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         作用：将数组中指定的数据拷贝到另一个数组中
         参数:
            src - 源数组
            srcPos - 源数组中的起始位置(起始索引)
            dest - 目标数组
            destPos - 目标数据中的起始位置
            length - 要复制的数组元素的数量
        */
        int[] src = {1, 2, 3, 4, 5};       //定义源数组
        int[] dest = {6, 7, 8, 9, 10};     //定义目标数组
        // 直接打印数组返回值为其地址值(回顾：Arrays中重写了toString方法，使其返回字符串)
        System.out.println("复制前:"+ Arrays.toString(dest));
        // 把源数组的前3个元素复制到目标数组的前3个位置上
        System.arraycopy(src,0,dest,1,3);
        System.out.println("复制后:"+ Arrays.toString(dest));

    }
}
