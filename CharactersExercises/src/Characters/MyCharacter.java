package Characters;

public class MyCharacter {

    char ch;

    public MyCharacter(char ch) {
	this.ch = ch;

    }

    public boolean isVowel() {
	boolean vowel;
	if (this.ch == 'a' || this.ch == 'e' || this.ch == 'i' || this.ch == 'o' || this.ch == 'u' || this.ch == 'A'
		|| this.ch == 'E' || this.ch == 'I' || this.ch == 'O' || this.ch == 'U') {
	    vowel = true;
	} else {
	    vowel = false;
	}
	return vowel;
    }

    public boolean isDigit() {
	boolean digit;
	if ((int) this.ch >= 48 && (int) this.ch <= 57) { // 0 to 9
	    digit = true;
	} else {
	    digit = false;
	}
	return digit;
    }

    public boolean isAlphabet() {
	boolean alphabet;
	// a to z or A to Z
	if (((int) this.ch >= 97 && (int) this.ch <= 122) || ((int) this.ch >= 65 && (int) this.ch <= 90)) {
	    alphabet = true;
	} else {
	    alphabet = false;
	}

	return alphabet;

    }

    public boolean isConsonant() {
	boolean consonant;
	if (this.isAlphabet() && !this.isVowel()) {
	    consonant = true;
	} else {
	    consonant = false;
	}
	return consonant;
    }

    public static void printLowerCaseAlphabet() {
	for (int i = 97; i <= 122; i++) {
	    System.out.printf("%c ", (char) i);
	}
	System.out.printf("\n");
    }

    public static void printUpperCaseAlphabet() {
	for (int i = 65; i <= 90; i++) {
	    System.out.printf("%c ", (char) i);
	}
	System.out.printf("\n");
    }

}
