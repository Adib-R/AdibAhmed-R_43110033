package nov27_25;

import java.util.HashMap;
import java.util.Map;

public class Map_Java {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Naruto");
        map1.put(2, "Luffy");
        map1.put(3, "Goku");
        map1.put(1, "Ichigo"); 

        System.out.println("Iterating HashMap...");
        for (Map.Entry<Integer, String> m : map1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("---------------------");

        HashMap<Integer, String> hm = new HashMap<>();
        System.out.println("Initial list of elements: " + hm);

        hm.put(100, "Saitama");
        hm.put(101, "Levi");
        hm.put(102, "Tanjiro");

        System.out.println("After invoking put() method ");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(103, "Eren");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(104, "Light Yagami");
        map.putAll(hm);

        System.out.println("After invoking putAll() method ");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}