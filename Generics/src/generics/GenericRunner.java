package generics;

public class GenericRunner {

    public static void main(String[] args) {

	// I create a class, but I want it to work with any type of elements, strings,
	// integers...
	MyCustomList<String> list = new MyCustomList<>();
	list.addElement("hola");
	System.out.println(list);
	String value = list.get(0);
	System.out.println(value);

	MyCustomList<Integer> list2 = new MyCustomList<>();
	list2.addElement(Integer.valueOf(5));
	System.out.println(list2);
	Integer value2 = list2.get(0);
	System.out.println(value2);
    }

}
