package Chapter7.extendsDemo;
// 对于同一个对象，用父类的引用去取值（字段），会去的父类的字段的值，用子类的引用去取值（字段），则取得子类字段的值
public class JavafiledOverride {
    public static void main(String[] args) {
        Sub2 c1 = new Sub2();
        System.out.println(c1.s);
        System.out.println(((Super2)c1).s);         // 通过强转，任然可以访问到被隐藏字段
        Super2 c2 = new Sub2();
        System.out.println(c2.s);
    }
}

class Super2{
    String s = "super";
}

class Sub2 extends Super2{
    String s = "Sub";
}