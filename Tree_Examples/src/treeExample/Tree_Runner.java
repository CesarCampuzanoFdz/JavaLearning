package treeExample;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Runner {

    public static void main(String[] args) {

	TreeSet<Integer> numbers = new TreeSet<>(Set.of(2, 23, 25, 234, 65, 98, 100));
	// TreeSet extends navigableSet, so it have some additional methods exploiting
	// the sorting:
	System.out.println("tree: " + numbers);
	System.out.println("floor(25): " + numbers.floor(25));// the <=
	System.out.println("lower(25): " + numbers.lower(25));// the <
	System.out.println("ceiling(25): " + numbers.ceiling(25));// the >=
	System.out.println("higher(25): " + numbers.higher(25));// the >
	// in between (the false and true arguments are to exclude/include the limit
	// values)
	System.out.println("subSet(25, false, 65, false): " + numbers.subSet(25, false, 65, false));
	// All greater or lesser than: (the false and true arguments are to
	// exclude/include the limit values)
	System.out.println("numbers.headSet(25, true): " + numbers.headSet(25, true));
	System.out.println("numbers.tailSet(25, false): " + numbers.tailSet(25, false));

    }

}
