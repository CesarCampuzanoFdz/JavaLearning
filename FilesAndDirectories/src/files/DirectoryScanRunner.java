package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

    public static void main(String[] args) {
	// Paths.get(".") returns the path where the program is been executed
	Path currentDirectory = Paths.get(".");

	try {
	    // Files.list(dir) streams all files in that path (without recursion)
	    Files.list(currentDirectory).forEach(System.out::println);

	    System.out.println();

	    // Files.walk(dir,n) streams all directories within the directory indicated,
	    // entering up to n levels deep
	    Predicate<? super Path> predicate = p -> String.valueOf(p).endsWith(".java");
	    Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);

	    System.out.println();

	    // Files.find(dir,n,matcher) does the same as .walk including a better filter
	    // passing a predicate in the "matcher"
	    BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path)
		    .contains(".java");
	    BiPredicate<Path, BasicFileAttributes> dirMatcher = (path, attributes) -> attributes.isRegularFile();
	    Files.find(currentDirectory, 4, dirMatcher).forEach(System.out::println);

	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

}
