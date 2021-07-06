package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

    public static void main(String[] args) throws IOException {
	// Paths.get(".") returns the path where the program is been executed
	Path file2Write = Paths.get("./resources/filetoWrite.txt");

	List<String> lista = List.of("Line1", "Line2", "Line3");
	// write() directly writes into the file all contents in the list
	Files.write(file2Write, lista);

    }
}