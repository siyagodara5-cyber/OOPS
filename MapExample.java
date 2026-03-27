import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // Create a HashMap (Key, Value)
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Insertion
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        System.out.println("After Insertion: " + map);

        // 2. Deletion
        map.remove(2);
        System.out.println("After Deletion: " + map);

        // 3. Update
        map.put(1, "Grapes"); // updates value of key 1
        System.out.println("After Update: " + map);

        // 4. Searching
        if (map.containsKey(3)) {
            System.out.println("Key 3 found, Value: " + map.get(3));
        } else {
            System.out.println("Key not found");
        }

        // 5. Traversal (Using for-each loop)
        System.out.println("Traversal:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
