package accessMods.package1;

/*
 * Final in arguments and variables means they are constant.
 * It is a good practice (and imposed in many coding standards) to make ALL variables
 * and arguments final so they values dont change: INMUTABLE CODING
 */

class RandomClass {
    void method(final int arg) {
	// Final arguments cannot be changed in the method, they are constant
	// arg = 6;
    }
}

public class FinalVariablesAndArguments {

    public static void main(String[] args) {

	// Final variables cannot be changed, they are constant
	final int i = 5;
	// i = 2;

	int j = 10;
	RandomClass rc = new RandomClass();
	rc.method(j);

    }

}
