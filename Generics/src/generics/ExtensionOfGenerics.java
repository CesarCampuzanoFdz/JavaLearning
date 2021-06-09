package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ExtensionOfGenerics {

    // Haciendo un extends de otro TYPE se heredan los metodos de ese tipo heredado
    // y así poder por ejemplo hacer lo que sea sobre una lista
    static <TYPE extends List> boolean duplicateAnyList(TYPE lista) {
	return lista.addAll(lista);
    }

    // This is a UpperBound WildCard, it refers to a list of any Type that extends
    // Number class: List<? extends Number>
    static double sumOfNumberList(List<? extends Number> numbers) {
	double sum = 0.0;

	for (Number num : numbers) {
	    sum += num.doubleValue();
	}

	return sum;
    }

    // This is a LowerBound WildCard
    static void putSomeValues(List<? super Number> numbers) {
	numbers.add(553254353453543535l);
	numbers.add(11);
	numbers.add(5.1);
	numbers.add(87.89f);
    }

    public static void main(String[] args) {

	ArrayList<String> lista1 = new ArrayList<>(List.of("hola", "adios"));
	System.out.println(lista1);
	System.out.println(duplicateAnyList(lista1));
	System.out.println(lista1);

	Vector<Integer> lista2 = new Vector<>(List.of(1, 5));
	System.out.println(lista2);
	System.out.println(duplicateAnyList(lista2));
	System.out.println(lista2);

	LinkedList<Long> longsList = new LinkedList<>(List.of(5l, 7l, 1l));
	System.out.println(longsList);
	System.out.println(sumOfNumberList(longsList));
	Vector<Double> doubleList = new Vector<>(List.of(5.5, 7.8, 1.9));
	System.out.println(doubleList);
	System.out.println(sumOfNumberList(doubleList));
	ArrayList<Number> emptyList = new ArrayList<>();
	System.out.println(emptyList);
	putSomeValues(emptyList);
	System.out.println(emptyList);
    }
}