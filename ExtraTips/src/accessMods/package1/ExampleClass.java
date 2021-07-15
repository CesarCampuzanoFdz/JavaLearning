package accessMods.package1;

/*
 * There are 4 acces modifiers public, protected, (default) and private:
 * This is not a security measure, but for encapsulation, allowing
 *  or denaying access to this class in different sections of the code
 * 
 * For methods:
 * 
 * -Default: Can be used within the same package
 * -Public: Can be used everywhere where the class is
 * -Protected: Can be used in the same package or in classes that extend the class where it is defined
 * 	(default + inheritance)
 * -Private: Can only be used in the same class where it is defined
 * 
 */
public class ExampleClass {

    public void publicMethod() {
    }

    protected void protectedMethod() {
    }

    private void privateMethod() {
    }

    void defaultMethod() {
    }

    public void main() {
	ExampleClass ec = new ExampleClass();

	ec.publicMethod();
	ec.protectedMethod();
	ec.privateMethod();
	ec.defaultMethod();

    }
}
