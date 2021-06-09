package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner1 {

    public static void main(String[] args) {

	List<String> list1 = List.of("Abra", "Kadabra", "Alakazam");
	loopLogicFP(list1);
    }

    // Classic Object Oriented loop
    private static void loop(List<String> list1) {
	for (String word : list1) {
	    System.out.println(word);
	}
    }

    // Loop with Functional Programming
    // we convert the list into a stream of values with .stream() and with .forEach
    // we pass A LAMBDA EXPRESSION (it is something like a short method)
    private static void loopFP(List<String> list1) {
	list1.stream().forEach(element -> System.out.println("element - " + element));
    }

    // Classic Object Oriented logic
    private static void loopLogic(List<String> list1) {
	for (String word : list1) {
	    if (word.length() > 5) {
		System.out.println(word);
	    }
	}
    }

    // Functional Programming logic
    private static void loopLogicFP(List<String> list1) {
	// to introduce logic in the stream of elements, I use .filter, so it only takes
	// the elements that return "true" from the condition as another stream to the
	// next operation, filter is therefore a INTERMEDIATE OPERATION
	// forEach is a FINAL OPERATION because it "consumes" the elements of the stream
	list1.stream().filter(element -> element.length() > 5)
		.forEach(element -> System.out.println("element - " + element));
    }

}
