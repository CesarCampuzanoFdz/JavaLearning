package InterestCalculator;

public class CalculatorRunner {

    public static void main(String[] args) {
	SimpleInterest example1 = new SimpleInterest("10000", "10");
	System.out.printf("The total value to be paid is : %s", example1.years(2));

    }
}
