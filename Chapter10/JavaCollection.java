package Chapter10;

import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        // 不可变集合类似Java的数组
        int[] nums = new  int[3];
        nums[2] = 11;

        String[] names = {"bj","sh"};
        System.out.println(nums + " " + names);
        // 可变集合举例
        ArrayList al = new ArrayList<String>();
        al.add("zs");
        al.add("zs2");
        System.out.println(al + " " + al.hashCode());
        al.add("zs3");
        System.out.println(al + " " + al.hashCode());
    }
}
