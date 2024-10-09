package lab6;

import java.time.LocalDate;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // Immutable maps
        Map<String, String> friendPhones = Map.of(
                "Alice", "050-12-34-567",
                "Bob", "067-98-76-543",
                "Carl", "097-12-21-343"
        );

        System.out.println(friendPhones.size()); // 3

        // get a value from a map by its key
        String phone1 = friendPhones.get("Alice"); // 050-12-34-567
        String phone2 = friendPhones.get("Diana"); // null
        String phone3 = friendPhones.getOrDefault("Alex", "Unknown phone"); // Unknown phone

        // access the set of keys and collection of values from a map
        System.out.println(friendPhones.keySet()); // [Bob, Alice, Carl]
        System.out.println(friendPhones.values()); // [067-98-76-543, 050-12-34-567, 097-12-21-343]

        // Iterating over maps
        // printing names
        for (String name : friendPhones.keySet()) {
            System.out.println(name);
        }

        // printing phones
        for (String phone : friendPhones.values()) {
            System.out.println(phone);
        }

        // print a key and its associated value
        for (Map.Entry<String, String> entry : friendPhones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // HashMap
        Map<Integer, String> products = new HashMap<>();

        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products); // {2000=Phone, 1000=Notebook, 3000=Keyboard}
        System.out.println(products.get(1000)); // Notebook

        products.remove(1000);
        System.out.println(products.get(1000)); // null

        products.putIfAbsent(3000, "Mouse"); // it does not change the current element
        System.out.println(products.get(3000)); // Keyboard


        // LinkedHashMap
        Map<Integer, String> products2 = new LinkedHashMap<>();

        products2.put(1000, "Notebook");
        products2.put(2000, "Phone");
        products2.put(3000, "Keyboard");

        System.out.println(products2); // {1000=Notebook, 2000=Phone, 3000=Keyboard}

        // TreeMap
        SortedMap<LocalDate, String> events = new TreeMap<>();

        events.put(LocalDate.of(2024, 10, 6), "The Java Conference");
        events.put(LocalDate.of(2024, 5, 7), "Another Java Conference");
        events.put(LocalDate.of(2024, 1, 8), "Discussion: career or education?");
        events.put(LocalDate.of(2024, 2, 9), "The modern art");
        events.put(LocalDate.of(2024, 7, 10), "Coffee master class");

        System.out.println(events);

    }
}