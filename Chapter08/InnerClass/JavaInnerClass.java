package Chapter8.innerclass;

public class JavaInnerClass {
    public static void main(String[] args) {
        // 创建一个外部类对象
        OuterClass outer1 = new OuterClass();
        // 创建一个外部类对象
        OuterClass outer2 = new OuterClass();
        // 创建Java成员内部类
        // 说明在Java中，将成员内部类当作一个属性，因此使用下面的方式来创建outer1.new InnerClass().
        OuterClass.InnerClass inner1 = outer1.new InnerClass();
        OuterClass.InnerClass inner2 = outer2.new InnerClass();

        // 下面的方法调用说明在Java中，内部类值和类型相关，也就是说，只要是
        // OuterClass.InnerClass类型的对象可以传给形参InnerClass ic
        inner1.test(inner2);
        inner1.test(inner1);
        inner2.test(inner1);

        //创建Java静态内部类
        //因为在Java中静态内部类是和类相关的，使用new OuterClass.StaticInnerClass()
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
    }
}

class OuterClass {//外部类

    class InnerClass {   // 内部类
        public void test(InnerClass ic) {
            System.out.println(ic);
        }
    }

    static class StaticInnerClass {  // 静态内部类

    }
}
