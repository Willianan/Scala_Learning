package Chapter7.extendsDemo;

public class JavaNoNameDemo {

    // 匿名子类
    //通过包含带有定义或重写代码块的方式传教一个匿名的子类
    public static void main(String[] args) {
        // 在Java中创建一个匿名子类对象
        A2 a2 = new A2() {
            @Override
            public void cry() {
                System.out.println("cry.......");
            }
        };
        a2.cry();
    }
}

abstract class A2{
    abstract public void cry();
}