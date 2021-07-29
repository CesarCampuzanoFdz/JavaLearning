package api.e;

import java.util.List;

/*
 * Type Inference is to skip the type declaration of a variable, letting Java to infer it.
 * It must be used with sense, since all variables being defined as "var" instead of its types can be confusing
 * A variable defined with var, can still be final also (final var num=6;)
 * var variables can be used in enhanced loops
 */

public class TypeInferencesRunner {

    public static void main(String[] args) {
	List<String> names1 = List.of("Cesar", "Lara");
	List<String> names2 = List.of("Cesar", "Lara");
	// I can create a list of lists
	List<List<String>> names = List.of(names1, names2);
	// Or since java 10, I can tell Java to infer it with var
	var otherNames = List.of(names1, names2);

	// anyway of defining the variable have all methods associated to that object:
	names.stream().forEach(System.out::println);
	otherNames.stream().forEach(System.out::println);

    }

}
