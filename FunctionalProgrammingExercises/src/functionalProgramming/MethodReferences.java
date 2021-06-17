package functionalProgramming;

import java.util.List;

//Using method references makes the code easier to read when using functional programming

class MethodClassContainer {

    public static void printMethod(Integer i) {
	System.out.println(i);
    }

}

public class MethodReferences {

    public static void main(String[] args) {

	// a basic operation of functional programming
	List.of("Abra", "Kadabra", "Alakazam").stream().map(e -> e.length()).forEach(e -> System.out.println(e));

	System.out.println();

	// using method reference: System.out::println
	// It means, of the class "System.out" use the method "println"
	List.of("Abra", "Kadabra", "Alakazam").stream().map(e -> e.length()).forEach(System.out::println);

	System.out.println();

	// or using a method created:
	List.of("Abra", "Kadabra", "Alakazam").stream().map(e -> e.length()).forEach(MethodClassContainer::printMethod);

	// For example, in a more "advanced" code:
	int max = List.of(-1, 2, 3, -4, 1, 5, 2, 7, -214, 123, 1511).stream().map(Math::abs)
		.filter(MethodReferences::onlyEven).max(Integer::compare).orElse(-1);
	System.out.println("maximo = " + max);

    }

    public static boolean onlyEven(Integer i) {
	return i.intValue() % 2 == 0;
    }

}
