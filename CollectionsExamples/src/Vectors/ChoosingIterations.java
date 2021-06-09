package Vectors;
//Vectors are like LinkedLists but thread safe!

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ChoosingIterations {
    public static void main(String[] args) {
	List<String> init = List.of("Apple", "Bat", "Cat");
	Vector<String> words = new Vector<>(init);
	System.out.println(words);
	// to print values, for enhanced loop is the best

	for (String word : words) {
	    if (word.contains("at")) {
		System.out.printf("%s ", word);
	    }
	}
	System.out.println();
	// to modify, it is better the iterator NO the enhanced
	Iterator<String> wordIterator = words.iterator();
	while (wordIterator.hasNext()) {
	    if (wordIterator.next().contains("at")) {
		wordIterator.remove();
	    }
	}
	System.out.println(words);
    }
}
