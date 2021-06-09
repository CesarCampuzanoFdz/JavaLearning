package generics;

import java.util.ArrayList;

//This implementation only allows String in the list
/*public class MyCustomList {
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String el) {
	list.add(el);

    }

    public void delElement(String el) {
	list.remove(el);
    }
}*/

//Con esta implementacion, se parametriza el tipo a traves de <T> o <TYPE> (all capitals)
public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T el) {
	list.add(el);

    }

    public void delElement(T el) {
	list.remove(el);
    }

    public String toString() {
	return list.toString();

    }

    // Se puede retornar usando el TYPE de la clase
    public T get(int i) {
	return list.get(i);
    }
}