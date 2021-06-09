package maps;

import java.util.HashMap;
import java.util.Map;

// The hashMap doesnt keep insertion order or is sorted in any way

// Good for: Insertions
// Bad for: Iterations

public class HashMaps {

    public static void main(String[] args) {
	Map<String, Integer> map1 = new HashMap<>();
	System.out.printf("map1: %s\n", map1);
	map1.put("A", 5);
	map1.put("F", 6);
	map1.put("C", 7);
	map1.put("D", 4);
	System.out.printf("map1: %s\n", map1);
    }

}
