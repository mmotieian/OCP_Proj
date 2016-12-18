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

		File file = new File("C:/Users/mmoti/git/OCP_Project/OCP_Project/src/");
		

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(file.toPath(), "*.{txt}")) {
//			
//			for (Path value : stream) {
//				System.out.println(value + ":" + Files.isDirectory(value));
//			}
//			
			
			System.out.println();
			Iterator<Path> it = stream.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
		}
		
		
//		 Files.walkFileTree(file.toPath(), visitor);

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
