package api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * There is new methods to read and write into files:
 * readString and writeString
 */

public class FileReadWriteRunner {

    public static void main(String[] args) throws IOException {
	Path fichero = Paths.get("./Resources/sampleOfText.txt");
	String fileContent = Files.readString(fichero);
	System.out.println(fileContent);

	String newFileContent = fileContent.toUpperCase();

	Path newFichero = Paths.get("./Resources/newSampleOfText.txt");
	Files.writeString(newFichero, newFileContent);
    }

}
