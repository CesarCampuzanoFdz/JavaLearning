package StringsExamples;

import java.util.Scanner;

public class StringRunner {

    public static void main(String[] args) {
	Scanner consola = new Scanner(System.in);

	String str = consola.nextLine();

	letterByLetter(str);
	wordByWord(str);

//some other important methods:

//	str.isEmpty();
//	str.equals("things");
//	str.startsWith("H");
//	str.endsWith("other");
	consola.close();
    }

    private static void wordByWord(String str) {
	int i = 0;
	int pre = 0;
	while (i < str.length()) {
	    if (str.charAt(i) == ' ') {
		System.out.printf("%s\n", str.substring(pre, i));
		pre = i + 1;
	    } else if (i == str.length() - 1) {
		System.out.printf("%s\n", str.substring(pre, i + 1));
	    }
	    i++;
	}

    }

    private static void letterByLetter(String str) {

	for (int i = 0; i < str.length(); i++) {
	    for (int j = 0; (j < i || j < 0); j++) {
		System.out.printf(" ");

	    }
	    System.out.printf("%c\n", str.charAt(i));
	}

    }

}