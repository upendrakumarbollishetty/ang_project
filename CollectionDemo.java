package assignments12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        // ArrayList example
        System.out.println("ArrayList Example:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("Elements in ArrayList: " + arrayList);

        // LinkedList example
        System.out.println("\nLinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("Elements in LinkedList: " + linkedList);

        // HashSet example
        System.out.println("\nHashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        System.out.println("Elements in HashSet: " + hashSet);

        // HashMap example
        System.out.println("\nHashMap Example:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("Elements in HashMap: " + hashMap);

        // Iterating through a collection
        System.out.println("\nIterating through ArrayList:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }
    }
}

