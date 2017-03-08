package ch8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesClass {

	public static void main(String[] args) {

		// doCopy();
		doCopyFromConsole();
		// doCreateFilesAndDir();
	}

	private static void doCopyFromConsole() {
		// TODO Auto-generated method stub

		Path path = Paths.get("").toAbsolutePath().resolve("consoleInput.txt");
		try (InputStream input = System.in;) {

			Files.copy(input, path, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Success!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void doCreateFilesAndDir() {
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

	private static void doCopy() {
		// TODO Auto-generated method stub
		Path path1 = Paths.get("").toAbsolutePath();
		Path path2 = Paths.get("").toAbsolutePath().resolve("copyData.dat");

		path1 = path1.resolve("data.dat");

		try {
			Files.copy(path1, path2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Success!");

	}

}
