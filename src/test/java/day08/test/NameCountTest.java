package day08.test;

import java.util.HashMap;

public class NameCountTest {
	public static void main(String[] args) {
        String input = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";

        HashMap<String, Integer> map1 = new HashMap<>();
        String[] names = input.split(",\\s*");

        for (String name : names) {
            if (map1.containsKey(name)) {
                int count = map1.get(name);
                map1.put(name, count + 1);
            } else {
                map1.put(name, 1);
            }
        }

        for (String name : map1.keySet()) {
            int count = map1.get(name);
            System.out.println(name + ": " + count);
        }
    }
}
