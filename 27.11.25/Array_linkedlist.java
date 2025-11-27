package nov27_25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_linkedlist {
    public static void main(String[] args) {

        String[] values = {"Adib", "$", "Ganesh", "#", "Gopi", "/", "Acelin", "@"};

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (String v : values) {
            arrayList.add(v);
            linkedList.add(v);
        }

        System.out.println("ArrayList Values: " + arrayList);
        System.out.println("LinkedList Values: " + linkedList);
    }
}