package LinkedLists;
//The fastest insertion and deletion

import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

    public static void main(String[] args) {
	// the second <> inherits the 1st one
	// Integer, not int. It is created the wrapper class!!
	LinkedList<Integer> numeros = new LinkedList<>();

	for (int i = 0; i < 10; i++) {
	    numeros.add((i + 1) * 10);
	}
	System.out.println(numeros);
	// Classic for i loop
	for (int i = 0; i < numeros.size(); i++) {
	    System.out.printf("%d ", numeros.get(i));
	}
	System.out.printf("\n");
	// Enhanced loop
	for (int num : numeros) {
	    System.out.printf("%d ", num);
	}
	System.out.printf("\n");
	// while loop with iterator

	Iterator<Integer> numIterator = numeros.iterator();

	while (numIterator.hasNext()) {
	    System.out.printf("%d ", numIterator.next());
	}
	System.out.printf("\n");

	// need to reset the iterator to iterate again
	numeros.add(0, 0);
	Iterator<Integer> numIterator2 = numeros.iterator();
	while (numIterator2.hasNext()) {
	    System.out.printf("%d ", numIterator2.next());
	}
    }

}
