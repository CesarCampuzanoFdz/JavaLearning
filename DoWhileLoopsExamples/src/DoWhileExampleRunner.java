import java.util.Scanner;

public class DoWhileExampleRunner {
    public static void main(String[] args) {

	Scanner consola = new Scanner(System.in);
	cubesUntilNegative(consola);

    }

    private static void cubesUntilNegative(Scanner consola) {
	int num = -1;
	do {
	    if (num != -1) {
		System.out.printf("%d^3 = %d\n", num, num * num * num);
	    }
	    System.out.printf("Please introduce a number:");
	    num = consola.nextInt();

	} while (num >= 0);
    }
}
