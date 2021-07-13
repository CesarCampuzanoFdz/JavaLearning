package equals;

class Client {
    private int id;

    public Client(int id) {
	super();
	this.id = id;
    }

    public int getId() {
	return id;
    }

    // Right click -> Source -> Generate hashCode() and equals()

    /*
     * The hash code is the function that "sorts" the objects in different "boxes",
     * and it should do it evenly among them, so the hash code should have at least
     * 2 properties:
     * 
     * -> If two objects are equal, their hash code should be the same
     * 
     * -> The hash code of an object should not vary if the object does not vary
     */

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
    }

    @Override
    public boolean equals(Object that) {
	if (this == that)
	    return true;
	if (that == null)
	    return false;
	if (getClass() != that.getClass())
	    return false;
	Client other = (Client) that;
	if (id != other.id)
	    return false;
	return true;
    }

}

public class EqualRunner {

    public static void main(String[] args) {
	Client c1 = new Client(12);
	Client c2 = new Client(12);
	Client c3 = new Client(13);
	// The default .equals ihereted from object only compare memory, It only
	// returns true when they are the same object, like:
	System.out.println(c1.equals(c1));

	// To create a better equal, I override it in the class
	System.out.println(c1.equals(c1));
	System.out.println(c2.equals(c3));
    }

}
