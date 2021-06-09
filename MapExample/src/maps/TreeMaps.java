package maps;

import java.util.TreeMap;

//The TreeMap is sorted by key

//Good for: Searching
//Bad for: Insertions

public class TreeMaps {
    public static void main(String[] args) {
	TreeMap<String, Integer> map1 = new TreeMap<>();
	System.out.printf("map1: %s\n", map1);
	map1.put("A", 5);
	map1.put("F", 6);
	map1.put("C", 7);
	map1.put("D", 4);
	System.out.printf("map1: %s\n", map1);
	System.out.println("Extra methods from navigable Map:");// TreeMap has additional methods:
	System.out.printf("map1.firstEntry(): %s\n", map1.firstEntry());
	System.out.printf("map1.lastEntry(): %s\n", map1.lastEntry());
	System.out.printf("map1.higherKey(\"C\"): %s\n", map1.higherKey("C"));
	System.out.printf("map1.lowerKey(\"C\"): %s\n", map1.lowerKey("C"));
	System.out.printf("map1.ceilingKey(\"C\"): %s\n", map1.ceilingKey("C"));
	System.out.printf("map1.floorKey(\"C\"): %s\n", map1.floorKey("C"));
	System.out.printf("map1.subMap(\"C\", \"F\"): %s\n", map1.subMap("C", "F"));
	System.out.printf("map1.subMap(\"C\", false, \"F\", true): %s\n", map1.subMap("C", false, "F", true));
    }
}