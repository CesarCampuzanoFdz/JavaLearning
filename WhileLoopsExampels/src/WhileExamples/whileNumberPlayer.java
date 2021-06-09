package WhileExamples;

public class whileNumberPlayer {

    private int num;

    public whileNumberPlayer(int num) {
	this.num = num;

    }

    public void squaresUpTo() {
	int i = 1;
	int square = i * i;
	while (square <= num) {
	    System.out.printf("%d ", square);
	    i++;
	    square = i * i;
	}
	System.out.println();
    }

    public void cubesUpTo() {
	int i = 1;
	int square = i * i * i;
	while (square <= num) {
	    System.out.printf("%d ", square);
	    i++;
	    square = i * i * i;
	}
	System.out.println();
    }

}
