package animals;

import java.util.ArrayList;

public class animalsRunner {

    public static void main(String[] args) {
	ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();
	animals.add(new Dog());
	animals.add(new Cat());

	for (AbstractAnimal animal : animals) {
	    System.out.println(animal.getClass());
	    animal.bark();
	}
    }
}
