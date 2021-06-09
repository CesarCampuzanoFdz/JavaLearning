package Menu;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {

	menu();

    }

    private static void menu() {
	Scanner consola = new Scanner(System.in);
	System.out.printf("Enter a number: ");
	int number1 = consola.nextInt();
	System.out.printf("Then, Number1 is %d\n", number1);

	System.out.printf("Enter another number: ");
	int number2 = consola.nextInt();
	System.out.printf("Then, Number2 is %d\n", number2);

	int choice = 0;
	while (choice > 4 || choice < 1) {
	    choice = showMenu(consola);
	    menuSelector(number1, number2, choice);
	}
    }

    private static int showMenu(Scanner consola) {
	System.out.printf("Choose an option:\n");
	System.out.printf("\t1) Add\n");
	System.out.printf("\t2) Substract\n");
	System.out.printf("\t3) Divide\n");
	System.out.printf("\t4) Multiply\n");

	System.out.printf("Your choice: ");
	int choice = consola.nextInt();
	return choice;
    }

    private static void menuSelector(int number1, int number2, int choice) {
	switch (choice) {
	case 1: {
	    System.out.printf("%d + %d = %d\n", number1, number2, number1 + number2);
	    break;
	}
	case 2: {
	    System.out.printf("%d - %d = %d\n", number1, number2, number1 - number2);
	    break;
	}
	case 3: {
	    System.out.printf("%d / %d = %1.2f\n", number1, number2, (double) number1 / number2);
	    break;
	}
	case 4: {
	    System.out.printf("%d * %d = %d\n", number1, number2, number1 * number2);
	    break;
	}
	default: {
	    System.out.printf("Not a valid option\n");
	    break;
	}
	}
    }
}
