package accessMods.package2;

//a class from other package need to be imported
import accessMods.package1.ClassAccessModifiers;

/*
 * This can be possible since ClassAccessModifiers is public,
 * since it is in another package (refer to it for comments)
 */
public class ClassAccessModifiersRunnerInOtherPackage {

    public static void main(String[] args) {
	ClassAccessModifiers c = new ClassAccessModifiers();
    }

}
