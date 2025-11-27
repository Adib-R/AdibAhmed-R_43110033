package nov27_25;

import java.util.Arrays;

public class Array_AddOperations {

    public static String[] addElement(String[] arr, String element) {
    
        String[] newArr = new String[arr.length + 1];
        
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        newArr[arr.length] = element;
        
        return newArr;
    }

    public static String[] addElementAt(String[] arr, int index, String element) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Invalid index");
        }

        String[] newArr = new String[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = element;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        String[] values = {"Adib", "Ganesh", "Gopi"};

        System.out.println("Original Array: " + Arrays.toString(values));

        // Add at end
        values = addElement(values, "Ace");
        System.out.println("After adding at end: " + Arrays.toString(values));

        // Add at index
        values = addElementAt(values, 2, "Shiro");
        System.out.println("After adding at index 2: " + Arrays.toString(values));
    }
}