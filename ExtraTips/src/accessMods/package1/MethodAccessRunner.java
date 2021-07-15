package accessMods.package1;

public class MethodAccessRunner {

    public static void main(String[] args) {
	ExampleClass ec = new ExampleClass();

	ec.publicMethod();
	ec.protectedMethod();
	// ec.privateMethod(); -> Protected methods cannot be called from other classes
	ec.defaultMethod();

    }

}
