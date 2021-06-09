
public class Customer {

    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer(String name, Address homeAddress) {
	super();
	this.name = name;
	this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
	this.workAddress = workAddress;
    }

    public String toString() {
	return String.format("name: %s, direccion casa:\n%s\ndireccion trabajo:\n%s\n", this.name, this.homeAddress,
		this.workAddress);
    }
}
