package maps;

import java.util.HashMap;
import java.util.Map;

//Basic methods for Map Class

public class MapExamples {

    public static void main(String[] args) {
// Map needs to delcare the type of both key and value
// Map.of, as all .of methods create unnmutable objects
	Map<String, Integer> map0 = Map.of("A", 3, "B", 5, "Z", 10);
	Map<String, Integer> map1 = new HashMap<>();
	System.out.printf("map1: %s\n", map1);
	System.out.printf("map1.put(\"F\", 1); %d\n", map1.put("F", 1));// .put returns the previous value of the key
									// added
	map1.putAll(map0);
	System.out.printf("map1: %s\n", map1);
	System.out.printf("map1.get(\"A\"): %d\n", map1.get("A"));
	System.out.printf("map1.get(\"Z\"): %s\n", map1.get("Z"));
	System.out.printf("map1.isEmpty(): %b\n", map1.isEmpty());
	System.out.printf("map1.containsValue(3): %b\n", map1.containsValue(3));
	System.out.printf("map1.containsKey(\"Z\"): %b\n", map1.containsValue(3));
	System.out.printf("map1.keySet(): %s\n", map1.keySet());
	System.out.printf("map1.values(): %s\n", map1.values());

    }

}
