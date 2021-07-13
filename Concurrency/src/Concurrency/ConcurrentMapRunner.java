package Concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

/*
Concurrent HashMap has Atomic operations that allow thread-safety, plus it uses 
different locks for different sections of the map, speeding up the common concurrency

*/
public class ConcurrentMapRunner {
    public static void main(String[] args) {

	// Random string to test map:
	String str = "a Af asf FJAS afk alilY fklsjl POUFN";

	Map<Character, LongAdder> ocurrencias0 = new HashMap<Character, LongAdder>();
	// I count the number of ch of the string and map it, in a "usual" way
	for (char ch : str.toCharArray()) {
	    LongAdder n = ocurrencias0.get(ch);
	    if (n == null) {
		n = new LongAdder();
	    }
	    n.increment();
	    ocurrencias0.put(ch, n);
	}

	System.out.println(ocurrencias0);

	// Now i use a concurrent map, because it is thread safe:
	// ConcurrentMap offers atomic methods in addition to the locks:
	ConcurrentMap<Character, LongAdder> ocurrencias1 = new ConcurrentHashMap<>();

	for (char ch : str.toCharArray()) {
	    // computeIfAbsent executes the lambda expression of the 2nd argument:
	    ocurrencias1.computeIfAbsent(ch, c -> {
		LongAdder value = new LongAdder();// LongAdder is initialized, and since that value is returned wether
						  // is present or not, it is passed to .increment()
		return value;
	    }).increment();
	}

	System.out.println(ocurrencias1);
    }
}