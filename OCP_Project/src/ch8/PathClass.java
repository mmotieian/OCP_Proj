package ch8;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path path = Paths.get("C:\\Users\\mmoti\\git\\..\\git\\OCP_Project\\test.txt");
		Path path2 = Paths.get("C:\\git\\OCP_Project\\test.txt");
		System.out.println(path.resolve(path2));
		System.out.println(path.resolveSibling(path2));
		System.out.println(path.relativize(path2));

		System.out.println(path.getRoot());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(5));
		System.out.println(path.subpath(0, 3));
		System.out.println(path.toAbsolutePath());
		System.out.println(path.normalize());
	}

}
