
public class CustomerRunner {
    public static void main(String[] args) {
	Address home = new Address("Tarriba", "San Felices", "Cantabria");
	Customer cust1 = new Customer("César", home);
	System.out.println(cust1);
	cust1.setWorkAddress(home);
	System.out.println(cust1);

    }
}
