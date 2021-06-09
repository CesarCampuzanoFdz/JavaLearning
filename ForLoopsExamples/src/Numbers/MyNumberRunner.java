package Numbers;

public class MyNumberRunner {

    public static void main(String[] args) {

	MyNumber num = new MyNumber(9);
	System.out.printf("Is the number prime?\n\t%b\n", num.isPrime());
	System.out.printf("The sum up to %d is: %d\n", num.getNum(), num.sumUpToN());
	System.out.printf("The sum of the divisors up to %d is: %d\n", num.getNum(), num.sumDivisorsUpToN());
	num.numberTriangle();
    }

}
