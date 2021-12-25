package study.异常;

/*
    多个异常使用捕获又该如何处理呢？
    1. 多个异常分别处理
        多次 try-catch

    2. 多个异常一次捕获，多次处理
        try{
            可能产生异常的代码
        } catch (异常类名 变量名){
            // ...
        } catch (异常类名 变量名){
            // ...
        }
        ...
        注意事项:
        catch里边定义的异常变量,如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
        比如：ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException

    3. 多个异常一次捕获一次处理 (使用所有异常的父类Exception来接收异常)
        try {
            可能产生异常的代码
        } catch (Exception e){
            System.out.println(e);
        }
 */
public class demo_06 {
    public static void main(String[] args) {

    }
}
