package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {
    public static void main(String[] args) {

	String str0 = " Example string to test map searching String in string 1 ";
	String str = str0.trim();
	System.out.println(str);

	// Search for words and storing them in a LinkedMap(to preserve order of the
	// phrase)
	String[] words = str.split(" ");
	Map<String, Integer> map1 = new LinkedHashMap<>();
	for (String word : words) {
	    if (map1.containsKey(word)) {
		map1.put(word, map1.get(word) + 1);
	    } else {
		map1.put(word, 1);
	    }
	}
	System.out.println(map1);

	// I define a TreeMap to have the keys (chars) alphabetically sorted to iterate
	// the string ch by ch
	Map<Character, Integer> map2 = new TreeMap<>();
	char ch = ' ';
	for (int i = 0; i < str.length(); i++) {
	    ch = str.charAt(i);
	    // System.out.printf("%c", ch);
	    if (map2.containsKey(ch)) {
		map2.put(ch, map2.get(ch) + 1);
	    } else {
		map2.put(ch, 1);
	    }

	}
	System.out.println(map2);

    }
}
