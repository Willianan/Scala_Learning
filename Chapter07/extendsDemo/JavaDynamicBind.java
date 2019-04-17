package Chapter7.extendsDemo;

public class JavaDynamicBind {
    /*
    * Java的动态绑定机制
    *   1、如果调用的是方法，则JVM会将该方法和对象的内存地址绑定
    *   2、如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应值。
    * */
    public static void main(String[] args) {
        AA a = new BB();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class AA {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class BB extends AA {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}
