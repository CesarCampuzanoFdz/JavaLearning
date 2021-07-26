package api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    /*
     * Since Java 10 in list, set, interface class there is a new method: copyOf It
     * returns an inmutable copy of mutable objects or the object itself if it is
     * already inmutable, to prevent them to be modified
     */

    public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Abra");
	names.add("Kadabra");
	names.add("Alakazam");
	System.out.println(names);

	// I want to make sure nobody can modify the list I am sending, so instead of
	// names I send an inmutable list copy of names:
	doNotChange(List.copyOf(names));
	System.out.println(names);
    }

    private static void doNotChange(List<String> names) {
	names.add("Should Not WORK!");
    }

}
