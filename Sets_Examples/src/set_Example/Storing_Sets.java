package set_Example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Storing_Sets {
    public static void main(String[] args) {

	// we want to store the unique values of the next list:
	List<Character> chars = List.of('a', 'c', 'f', 'b', 'A', 'f', 'd', 'B');

	// To store the list with addition order, we use a LinkedHashSet
	Set<Character> chars1 = new LinkedHashSet<>(chars);
	System.out.printf("LinkedHashSet: %s\n", chars1);

	// If we want to store it sorted without duplicates, we use a TreeSet
	Set<Character> chars2 = new TreeSet<>(chars);
	System.out.printf("TreeSet: %s\n", chars2);

	// If we dont care about the order they are stored, we use a HashSet
	// It actually depends on the Hashing code, so it is not reliable sorting
	Set<Character> chars3 = new HashSet<>(chars);
	System.out.printf("HashSet: %s\n", chars3);
    }
}
