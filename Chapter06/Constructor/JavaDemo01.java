package Chapter6.Constructor;

public class JavaDemo01 {
    public static void main(String[] args) {

    }
}

class AAA {
    public AAA() {
        // 在这里调用AAA(String name)
        this("aaa");
        System.out.println("AAA()");
    }
    public AAA(String name){
        super();
    }
}