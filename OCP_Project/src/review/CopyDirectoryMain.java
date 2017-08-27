package review;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.regex.PatternSyntaxException;

public class CopyDirectoryMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("availableProcessors: " + Runtime.getRuntime().availableProcessors());
		System.out.println("maxMemory: " + Runtime.getRuntime().maxMemory());
		System.out.println("freeMemory: " + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory: " + Runtime.getRuntime().totalMemory());

		// DosFileAttributes dfa = Files.attribu

		Path dir = Paths.get("D:\\Odin And Stuff");
		DosFileAttributes bfav = Files.readAttributes(dir, DosFileAttributes.class);
		DosFileAttributes dfa = Files.readAttributes(dir, DosFileAttributes.class);// bfav.readAttributes();

		DosFileAttributeView bfa = Files.getFileAttributeView(dir, DosFileAttributeView.class);
		// bfa.readAttributes()

		System.out.println("dfa.isArchive() " + dfa.isArchive());
		System.out.println("dfa.isRegularFile() " + dfa.isRegularFile());
		System.out.println("dfa.isDirectory() " + dfa.isDirectory());

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*");) {
			System.out.println("Directory Size: " + Files.size(dir));
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}

		} catch (PatternSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
