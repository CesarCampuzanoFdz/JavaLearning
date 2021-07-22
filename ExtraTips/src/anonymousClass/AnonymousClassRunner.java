package anonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//An anonymous class is a class without name, use it with care

public class AnonymousClassRunner {
    public static void main(String[] args) {
	List<String> lista = new ArrayList<>(List.of("Abra", "Kadabra", "Alakazam"));

	Collections.sort(lista, new Comparator<String>() {
	    // Here I create a anonymous class, because this class defined here has no name.
	    public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	    }
	});// By default .sort uses alphabetical order but I use a comparator to compare by
	   // lenght.

	// I can create a local variable with the comparator, but as the name has a
	// name, the class is still unnamed, an anonymous class
	Comparator<String> lengthComparator = new Comparator<String>() {
	    public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	    }
	};
	Collections.sort(lista, lengthComparator);

	System.out.println(lista);
    }
}
