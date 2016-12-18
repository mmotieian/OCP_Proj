package ch8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesClass {

	public static void main(String[] args) {

		try {
			Path path = Paths.get("C:/Users/mmoti/git/OCP_Project/OCP_Project/files.txt");
			Path path2 = Paths.get("C:/Users/mmoti/git/OCP_Project/OCP_Project/files2.txt");
			Files.deleteIfExists(path);
			Files.deleteIfExists(path2);
			Path pathToFile = Files.createFile(path);
			System.out.println(pathToFile);

			Path tempPath = Files.copy(path, path2);
			System.out.println(tempPath);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
