package set_Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Example {
    public static void main(String[] args) {

	Set<Integer> numbers = new LinkedHashSet<Integer>();

	numbers.add(10);
	numbers.add(15);
	numbers.add(5);
	numbers.add(20);
	// LinkedHashSet is a Set that store values in ADDITION order
	System.out.println(numbers);
	// in a set you cannot add duplicates, so .add method return false
	System.out.println(numbers.add(100));
	System.out.println(numbers.add(10));
	System.out.println(numbers);
    }
}
