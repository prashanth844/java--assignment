package com.collection;
import java.util.HashSet;
import java.util.Iterator;
public class Question3 {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grapes");
        fruits.add("Honeydew");
        fruits.add("Indian Fig");
        fruits.add("Jackfruit");


        System.out.println("Initial HashSet: " + fruits);

        fruits.add("Apple");
        System.out.println("After trying to add duplicate 'Apple': " + fruits);

        fruits.add("Kiwi");
        System.out.println("After adding 'Kiwi': " + fruits);

        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);

        System.out.println("Is 'Banana' present? " + fruits.contains("Banana"));

        System.out.println("Size of the HashSet: " + fruits.size());

        System.out.println("Is the HashSet empty? " + fruits.isEmpty());

        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        fruits.clear();
        System.out.println("After clearing the HashSet: " + fruits);
    }
}
