package firstpackage.cecf;

public class MultiplicationTable {

    void print() {
	print(5, 1, 10);
    }

    void print(int number) {
	print(number, 1, 10);
    }

    void print(int number, int lowerlimit, int upperlimit) {
	for (int i = lowerlimit; i < upperlimit; i++) {
	    System.out.printf("%d * %d = %d", number, i, number * i).println();
	}
    }

}
