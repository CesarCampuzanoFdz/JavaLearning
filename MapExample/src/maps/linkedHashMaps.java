package maps;

import java.util.LinkedHashMap;
import java.util.Map;

//The LinkedHashMap keeps insertion order 

//Good for: Iterations
//Bad for: Insertions

public class linkedHashMaps {
    public static void main(String[] args) {
	Map<String, Integer> map1 = new LinkedHashMap<>();
	System.out.printf("map1: %s\n", map1);
	map1.put("A", 5);
	map1.put("F", 6);
	map1.put("C", 7);
	map1.put("D", 4);
	System.out.printf("map1: %s\n", map1);
    }
}
