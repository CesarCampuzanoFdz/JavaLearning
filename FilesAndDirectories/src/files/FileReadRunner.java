package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FileReadRunner {

    public static void main(String[] args) throws Exception {
	// Paths.get(".") returns the path where the program is been executed
	Path cd = Paths.get("./resources");
	BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> path.endsWith("data.txt");
	Optional<Path> readDir = Files.find(cd, 1, matcher).findFirst();

	if (readDir.isPresent()) {
	    // readAllLines takes the whole file to the stream, it is very ineficient
	    Files.readAllLines(readDir.get()).forEach(System.out::println);
	    System.out.println();

	    Function<? super String, ? extends String> shine = (str) -> {
		str = str.trim().toLowerCase();
		str = str.substring(0, 1).toUpperCase().concat(str.substring(1));
		return str;
	    };

	    // lines get the lines one by one, allowing filtering and mapping
	    Files.lines(readDir.get()).map(shine).forEach(System.out::println);

	}

	// Files.readAllLines(currentDirectory)
    }

}
