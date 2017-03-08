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
			Path path3 = Paths.get("");
			
			
			System.out.println(path3.toAbsolutePath());
			Files.createDirectories(path3.toAbsolutePath().resolve(Paths.get("foo/bar/")));
			
			// get current directory and specify file name.
			path3 = path3.toAbsolutePath().resolve("files3.txt");
			
			System.out.println(Files.exists(path3));	
			
			Files.deleteIfExists(path);
			Files.deleteIfExists(path2);
			Files.deleteIfExists(path3);
			
			Files.createFile(path3);
			
			
			Path pathToFile = Files.createFile(path);			
			System.out.println(pathToFile);

			Path tempPath = Files.copy(path, path2);
			System.out.println(tempPath);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
