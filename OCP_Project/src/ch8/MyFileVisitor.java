/**
 * 
 */
package ch8;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Iterator;

/**
 * @author Mohammad Najar
 *
 */
public class MyFileVisitor extends SimpleFileVisitor<Path> {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		MyFileVisitor visitor = new MyFileVisitor();

		Path path = Paths.get("").toAbsolutePath().resolve("src").resolve("ch8");

		// Iterate over all files and directories in a directory. - Method 1
		doDirectoryStream(path);

		// Iterate over all files and directories in a directory. - Method 2
		// Files.walkFileTree(path, visitor);

	}

	private static void doDirectoryStream(Path path) throws IOException {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, "*.{java}")) {

			for (Path value : stream) {
				System.out.println(value + " -->is a file? " + Boolean.toString(Files.isDirectory(value)).toUpperCase());
			 }

//			System.out.println();
//			Iterator<Path> it = stream.iterator();
//			while (it.hasNext()) {
//				System.out.println(it.next());
//			}

		}
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("File name :" + file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Dir Name: " + dir);
		System.out.println();
		return super.postVisitDirectory(dir, exc);
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Dir Name: " + dir);
		return super.preVisitDirectory(dir, attrs);
	}

}
