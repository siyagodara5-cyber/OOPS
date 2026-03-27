import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class SortedMapExample {
    public static void main(String[] args) {

        // Create a SortedMap using TreeMap
        SortedMap<Integer, String> map = new TreeMap<>();

        // 1. Insertion
        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println("After Insertion (Sorted): " + map);

        // 2. Deletion
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // 3. Update
        map.put(1, "Grapes"); // update value of key 1
        System.out.println("After Update: " + map);

        // 4. Searching
        if (map.containsKey(3)) {
            System.out.println("Key 3 found, Value: " + map.get(3));
        } else {
            System.out.println("Key not found");
        }

        // 5. Traversal
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
