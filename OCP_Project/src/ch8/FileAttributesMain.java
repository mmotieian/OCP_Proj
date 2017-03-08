/**
 * 
 */
package ch8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;

/**
 * @author Mohammad Najar
 *
 */
public class FileAttributesMain {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("test.txt");

		Map<String, Object> attr = Files.readAttributes(path, "*");
		Object b = Files.getAttribute(path, "creationTime");
		System.out.println("creationTime  " + b);

		FileTime ft = FileTime.fromMillis(System.currentTimeMillis());
		Files.setAttribute(path, "creationTime", ft);

		for (String atr : attr.keySet()) {
			System.out.println(atr + "  " + attr.get(atr));

		}

		BasicFileAttributes a = Files.readAttributes(path, DosFileAttributes.class);

		BasicFileAttributeView attr2 = Files.getFileAttributeView(path, DosFileAttributeView.class);

	}

}
