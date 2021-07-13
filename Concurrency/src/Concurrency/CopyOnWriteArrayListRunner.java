package Concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * The CopyOnWriteArrayList is a thread-safe option for ArrayList that makes
 *  a copy of the Array each time an operation is perfomed.
 *  It is very unneficient for modifying the array, but extreamly efficient
 *  to concurrently read (get) the array.
 * 
 * Therefore, it is only recommended for cases where there are multiple threads
 * reading and few modifying.
 */

public class CopyOnWriteArrayListRunner {

    public static void main(String[] args) {

	List<String> list = new CopyOnWriteArrayList<String>();
	// This should be rare for this class:
	list.add("Abra");
	list.add("Kadabra");
	list.add("Alakazam");

	// This should be common:
	for (int i = 0; i < list.size(); i++) {
	    System.out.printf("%d, %s\n", i, list.get(i));
	}

    }

}
