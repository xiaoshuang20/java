package study.流.Stream流;

/*
    方法引用：
        :: 为引用运算符，其所在的表达式为方法引用
    分析:
        Lambda表达式的目的,打印参数传递的字符串
        把参数s,传递给了一对象,调用该对象中的某方法对字符串进行操作
        注意:
            1.对象是已经存在的
            2.方法也是已经存在的
        所以可以使用方法引用来优化Lambda表达式
        可以使用该对象直接引用(调用)某方法
 */
public class demo_04 {

    public static void main(String[] args) {
        // 调用printString方法,方法的参数Printable是一个函数式接口,所以可以传递Lambda
        printString1(s -> System.out.println(s));
        // 方法引用，参数可以省略（应该只适用与参数只有一个的情况吧）
        printString1(System.out::println);

        System.out.println("==============================");

        printString2(s -> {
            // 创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            // 调用该对象中的成员方法printUpperCaseString,把字符串按照大写输出
            obj.printUpperCaseString(s);
        });
        // 方法引用（对象必须存在）
        MethodRerObject obj = new MethodRerObject();
        printString2(obj::printUpperCaseString);
    }

    // 定义一个方法,参数传递Printable接口,对字符串进行打印
    public static void printString1(Printable p) {
        p.print("HelloWorld");
    }

    // 定义一个方法,方法的参数传递Printable接口
    public static void printString2(Printable p){
        p.print("Hello");
    }
}
