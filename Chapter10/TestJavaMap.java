package Chapter10;

import java.util.HashMap;

public class TestJavaMap {
    // HashMap是一个散列表(数组+链表)，存储的内容是键值对（key-value）映射，
    // Java中的HashMap是无序的,key不能重复。
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("no1",100);
        hm.put("no2",200);
        hm.put("no3",300);
        hm.put("no4",400);

        System.out.println(hm);
        System.out.println(hm.get("no2"));
    }
}
