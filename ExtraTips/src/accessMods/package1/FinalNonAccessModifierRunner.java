package accessMods.package1;

/*
 * A final class is a modifier that prevents the class to be inheritable.
 *  No class cant extend a final class, for the example String is final.
 * That can be used to prevent extend a class and override some of its methods, so 
 * it is kind of a protective measure. *  
 */

final class FinalClass {

}

/*
 * final methods cannot be overwritten in extended classes
 */
class OtherClass {
    final public void finalMethod() {
    }

}

class SomeOtherClass extends OtherClass {
    // final public void finalMethod() {
    // }
}

public class FinalNonAccessModifierRunner {

    public static void main(String[] args) {

    }

}
