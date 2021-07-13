package blocks;

public class BlocksRunner {

    public static void main(String[] args) {
	if (3 > 2)
	    System.out.println("3>2"); // This is a very bad practice

	if (3 > 2) {
	    System.out.println("3>2"); // This is a better practice
	}

	// Blocks can be even used without any conditional, and variables declared
	// inside cannot be used outside:
	{
	    int i = 1;
	    System.out.println(i);
	}
	int i = 2;
	System.out.println(i);
    }

}
