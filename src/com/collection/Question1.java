package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        System.out.println("Initial ArrayList: " + list);

        list.add("Kiwi");
        System.out.println("After adding 'Kiwi': " + list);

        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        list.add(2, "Blueberry");
        System.out.println("After adding 'Blueberry' at index 2: " + list);

        list.remove("Date");
        System.out.println("After removing 'Date': " + list);

        list.remove(4);
        System.out.println("After removing element at index 4: " + list);

        list.set(3, "Dragonfruit");
        System.out.println("After updating element at index 3 to 'Dragonfruit': " + list);

        if (list.size() > 5 && list.get(5) != null) {
            System.out.println("Element at index 5 is present: " + list.get(5));
        } else {
            System.out.println("No element present at index 5");
        }

        System.out.println("Element at index 1: " + list.get(1));

        System.out.println("Size of the ArrayList: " + list.size());

        String elementToCheck = "Kiwi";
        System.out.println("Is '" + elementToCheck + "' present? " + list.contains(elementToCheck));

        list.clear();
        System.out.println("After removing all elements: " + list);
    }
}
