package ArrayLists;

import java.util.ArrayList;

public class ArrayListRunner {

    public static void main(String[] args) {
	ArrayList<String> words = new ArrayList<String>();
	System.out.println(words);
	words.add("1st");
	words.add("5rd");
	words.add(1, "4nd");
	System.out.println(words);
	ArrayList<String> moreWords = new ArrayList<String>();
	moreWords.add("2th");
	moreWords.add("toModify");
	words.addAll(1, moreWords);
	System.out.println(words);
	words.set(2, "3rd");
	System.out.println(words);
	words.set(1, "toDelete");
	words.set(3, "toDelete");
	System.out.println(words);
	words.remove("toDelete");
	System.out.println(words);
	words.remove(2);
	System.out.println(words);
    }

}
