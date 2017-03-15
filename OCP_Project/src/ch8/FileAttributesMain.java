/**
 * 
 */
package ch8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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

		doReadAttributes(path);

		doDosFileAttributes(path);

		doDosFileAttributeView(path);

		doAclFileAttributeView(path);

		doFileOwnerAttributeView(path);

		doUserDefinedFileAttributeView(path);

	}

	private static void doUserDefinedFileAttributeView(Path path) {
		UserDefinedFileAttributeView userDefinedFileAttributeView = Files.getFileAttributeView(path,UserDefinedFileAttributeView.class);
		// userDefinedFileAttributeView.delete(blahblah);

	}

	private static void doFileOwnerAttributeView(Path path) {
		FileOwnerAttributeView fileOwnerAttributeView = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
		try {
			fileOwnerAttributeView.getOwner();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void doAclFileAttributeView(Path path) {

		try {
			AclFileAttributeView aclFileAttributeView = Files.getFileAttributeView(path, AclFileAttributeView.class);
			aclFileAttributeView.getAcl();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void doReadAttributes(Path path) throws IOException {
		Map<String, Object> attr = Files.readAttributes(path, "dos:*");
		Object b = Files.getAttribute(path, "creationTime");
		System.out.println("creationTime  " + b);

		FileTime ft = FileTime.fromMillis(System.currentTimeMillis());
		Files.setAttribute(path, "creationTime", ft);

		System.out.println("Files.readAttributes(path, \"*\");");
		System.out.println("----------------------------------");
		Set<String> keySet = new TreeSet<>(attr.keySet());
		for (String atr : keySet) {
			System.out.println(atr + "  " + attr.get(atr));
		}
		System.out.println("----------------------------------");
	}

	private static void doDosFileAttributeView(Path path) throws IOException {
		DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
		dosView.setArchive(true);
	}

	private static void doDosFileAttributes(Path path) throws IOException {
		DosFileAttributes a = Files.readAttributes(path, DosFileAttributes.class);
		System.out.println("a.isArchive():  " + a.isArchive());

		// Dos File Attributes
		// a.isArchive();
		// a.isHidden();
		// a.isReadOnly();
		// a.isSystem();
	}

}
