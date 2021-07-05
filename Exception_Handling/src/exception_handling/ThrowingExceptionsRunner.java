package exception_handling;

//I create a new class with a .add method to add amounts of money.
//The add should not ignore the different currencies, not allowing the difference
class Amount {

    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
	super();
	this.currency = currency;
	this.amount = amount;
    }

    public void add(Amount other) throws Exception {

	if (!this.currency.equals(other.currency)) {
	    // I throw a checked exception, forcing the method to contain throws Exception
	    // and the calls to this method to handle it
	    throw new CurrenciesDontMatchException("Currencies don't match :" + this.currency + "&" + other.currency);
	}
	this.amount += other.amount;

    }

    public String toString() {
	return String.format("%d of %s", amount, currency);
    }
}

//Here I create a custom exception to throw when currencies don't match
//It is a checked exception since it extends Exception, could be unchecked if it was extending RuntimeException
class CurrenciesDontMatchException extends Exception {

    // I create constructor, because I want a msg to be diplayed in the stack trace.
    public CurrenciesDontMatchException(String msg) {
	// Since exceptions already have this, I use super with the msg:
	super(msg);
	System.out.println("I can put some other things here :)");
    }
}

public class ThrowingExceptionsRunner {

    public static void main(String[] args) {

	Amount myMoney = new Amount("EUR", 10);
	Amount givenMoney = new Amount("EUR", 10);
	Amount anotherGivenMoney = new Amount("USD", 10);

	System.out.println(myMoney);
	System.out.println("");
	try {
	    myMoney.add(givenMoney);
	    System.out.println(myMoney);
	    int num[] = { 1 };
	    System.out.println(num[1]);
	} catch (CurrenciesDontMatchException e) {
	    System.out.println("Add failed! It throws an exception:");
	    e.printStackTrace();
	} catch (Exception e) {
	    System.out.println("other things failed!");
	    e.printStackTrace();
	}
	System.out.println("");
	try {
	    myMoney.add(anotherGivenMoney);
	    System.out.println(myMoney);
	} catch (Exception e) {
	    System.out.println("Add failed! It throws an exception:");
	    e.printStackTrace();
	}
    }

}
