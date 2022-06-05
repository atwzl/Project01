package com.wzl.ceshi;

import java.util.HashMap;

/**
 * @author 吴志亮有限公式创作
 * @date 2022/6/3 - 19:50
 */
public class DebugTesy {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name","liqiang");
        map.put("age","12");
        map.put("school","jxgzy");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
