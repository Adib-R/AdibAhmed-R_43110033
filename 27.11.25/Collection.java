package nov27_25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Adib");
        list.add("Acelin");
        list.add("Gopi");
        System.out.println("ArrayList : ");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------");

        // LinkedList
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ganesh");
        ll.add("Sakthi");
        ll.add("Luffy");
        System.out.println("LinkedList : ");
        System.out.println(ll);

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------------------");

        // Speed test between these 2 ...
        long startTime = System.currentTimeMillis();
        ArrayList<String> test1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            test1.add("TEST_1");
            test1.add("TEST_2");
            test1.add("TEST_3");
        }
        System.out.println("Time taken by ArrayList: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        LinkedList<String> test2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            test2.add("TEST_1");
            test2.add("TEST_2");
            test2.add("TEST_3");
        }
        System.out.println("Time taken by LinkedList: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println();
    }
}