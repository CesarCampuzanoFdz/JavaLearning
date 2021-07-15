package accessMods.package2;

//a class from other package need to be imported
import accessMods.package1.ExampleClass;

public class MethodAccessRunnerInOtherPackage {

    public static void main(String[] args) {
	ExampleClass ec = new ExampleClass();

	ec.publicMethod();
	// ec.protectedMethod(); -> Protected methods cannot be called from other
	// packages
	// ec.privateMethod(); -> Protected methods cannot be called from other classes
	// ec.defaultMethod(); -> Default methods cannot be called from other packages

    }

}
