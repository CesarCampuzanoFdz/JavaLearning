package data.types;

public class NumbersRunner {

    public static void main(String[] args) {

	Numbers numeros = new Numbers(100, 4);
	System.out.println(numeros.getFirst());
	System.out.println(numeros.getSecond());
	System.out.println(numeros.add());
	System.out.println(numeros.multiply());
	numeros.doubleThem();
	System.out.println(numeros.getFirst());
	System.out.println(numeros.getSecond());
	System.out.println(numeros.divide());

    }
}
