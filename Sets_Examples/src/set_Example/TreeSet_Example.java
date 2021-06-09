package set_Example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {

	Set<Integer> numbers = new TreeSet<Integer>();

	numbers.add(10);
	numbers.add(15);
	numbers.add(5);
	numbers.add(20);
	// TreeSet is a Set that store values in SORTED order
	System.out.println(numbers);
	// in a set you cannot add duplicates, so .add method return false
	System.out.println(numbers.add(1));
	System.out.println(numbers.add(10));
	System.out.println(numbers);
    }
}
