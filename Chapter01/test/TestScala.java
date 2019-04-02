package Chapter1.test;

public class TestScala {
    public static void main(String[] paramArrayOfString){
        //TestScala..MODULE$.main(paramArrayOfString);
        TestScala$.MODULE$.main(paramArrayOfString);
    }
}
final class TestScala$
{
    public static final TestScala$ MODULE$;
    static
    {
        MODULE$ = new TestScala$();
    }
    public void main(String[] args)
    {
        System.out.println("Hello,Scala");
    }
    //private TestScala$(){MODULE$ = this}
}