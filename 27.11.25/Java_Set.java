package nov27_25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Java_Set {

    public static void main(String[] args) {
        // 1) HashSet
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(7);
        set1.add(67);
        set1.add(8);
        set1.add(7);
        set1.add(5);
        set1.add(5);

        System.out.println("HashSet (Integers): " + set1);

        // 2) LinkedHashSet
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Naruto");
        set2.add("Luffy");
        set2.add("Goku");
        set2.add("Ichigo");
        set2.add("Saitama");

        System.out.println("LinkedHashSet (Anime Characters): " + set2);

        // 3) TreeSet 
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Eren");
        set3.add("Levi");
        set3.add("Tanjiro");
        set3.add("Nezuko");
        set3.add("Zoro");
        set3.add("Light");

        System.out.println("TreeSet (Anime Characters): " + set3);
    }
}