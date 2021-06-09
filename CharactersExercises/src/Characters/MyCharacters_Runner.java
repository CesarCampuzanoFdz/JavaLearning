package Characters;

public class MyCharacters_Runner {

    public static void main(String[] args) {

	MyCharacter ch = new MyCharacter('A');

	System.out.printf("is vowel? \n\t%b\n", ch.isVowel());
	System.out.printf("is digit? \n\t%b\n", ch.isDigit());
	System.out.printf("is alphabet? \n\t%b\n", ch.isAlphabet());
	System.out.printf("is consonant? \n\t%b\n", ch.isConsonant());

	MyCharacter.printLowerCaseAlphabet();
	MyCharacter.printUpperCaseAlphabet();

    }

}
