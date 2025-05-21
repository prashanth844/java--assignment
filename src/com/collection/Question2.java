package com.collection;
import java.util.HashMap;
import java.util.Map;
public class Question2 {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        System.out.println("Initial HashMap: " + studentMap);

        studentMap.put(111, "Kiran");
        System.out.println("After adding (111, 'Kiran'): " + studentMap);

        int keyToFetch = 104;
        String value = studentMap.get(keyToFetch);
        System.out.println("Value at key " + keyToFetch + ": " + value);

        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Cloned Map: " + clonedMap);

        int keyToCheck = 105;
        System.out.println("Does key " + keyToCheck + " exist? " + studentMap.containsKey(keyToCheck));

        String valueToCheck = "Eva";
        System.out.println("Does value '" + valueToCheck + "' exist? " + studentMap.containsValue(valueToCheck));

        System.out.println("Is the map empty? " + studentMap.isEmpty());

        System.out.println("Size of the map: " + studentMap.size());

        System.out.println("All keys in the map: " + studentMap.keySet());

        System.out.println("All values in the map: " + studentMap.values());

        studentMap.remove(107);
        System.out.println("After removing key 107: " + studentMap);

        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(studentMap);
        System.out.println("New map after copying elements: " + newMap);
    }
}
