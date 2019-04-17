package Chapter7.JavaPackage;

public class TestTiger {
    public static void main(String[] args) {
        // 使用xm的Tiger
        Chapter7.JavaPackage.xm.Tiger tiger01 = new Chapter7.JavaPackage.xm.Tiger();
        // 使用xh的Tiger
        Chapter7.JavaPackage.xh.Tiger tiger02 = new Chapter7.JavaPackage.xh.Tiger();
        System.out.println("tiger01 = " + tiger01);
        System.out.println("tiger02 = " + tiger02);
    }
}
