package set_Example;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Example {

    public static void main(String[] args) {

	Set<Integer> numbers = new HashSet<>();
	numbers.add(10);
	numbers.add(15);
	numbers.add(5);
	numbers.add(20);
	// HashSet is a Set that does not store values neither in introduction order or
	// sorted. It is the most efficient
	System.out.println(numbers);
	// in a set you cannot add duplicates, so .add method return false
	System.out.println(numbers.add(100));
	System.out.println(numbers.add(10));
	System.out.println(numbers);

    }

}
