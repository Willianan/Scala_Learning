package Chapter5.ExceptionHandling;

public class JavaExceptionDemo01 {
    public static void main (String[] args) {
        try{
            // 可疑代码
            int i = 0;
            int b = 10;
            int c = b / i;    // 执行代码时，会抛出ArithmeticException异常
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 最终要执行的代码
            System.out.println("Java finally");
        }
    }
}
