package ch8;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path path = Paths.get("C:\\Users\\mmoti\\git\\..\\git\\OCP_Project\\test.txt");
		Path path2 = Paths.get("C:\\git\\OCP_Project\\test.txt");

		doResolve();
		doResolveSibling();

		System.out.println(path.startsWith(path2.getRoot()));
		System.out.println(path.startsWith(path2.subpath(0, 1)));

		System.out.println("----------------------");

		System.out.println("path.resolve(path2) --> " + path.resolve(path2));
		System.out.println("path.resolveSibling(path2) --> " + path.resolveSibling(path2));
		System.out.println("path.relativize(path2) -->" + path.relativize(path2));

		System.out.println(path.getRoot());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(3));
		System.out.println("path.subpath(0, 4) --> " + path.subpath(0, 4));
		System.out.println(path.toAbsolutePath());
		System.out.println(path.normalize());
		

		Path path3 = Paths.get("ABC.txt");
		System.out.println(path3.toAbsolutePath());
	}

	private static void doResolveSibling() {
		// TODO Auto-generated method stub
		Path path1 = FileSystems.getDefault().getPath("/hello/world/text.txt");
		Path path2 = Paths.get("/hello/foo/bar");

		System.out.println("path1.resolveSibling(path2)  " + path1.resolveSibling(path2));
		System.out.println("path2.resolveSibling(path1)  " + path2.resolveSibling(path1));
	}

	private static void doResolve() {
		// TODO Auto-generated method stub
		Path path1 = FileSystems.getDefault().getPath("C:/hello/world/text.txt");
		Path path2 = Paths.get("C:/hello/foo/bar");

		System.out.println("path1.resolve(path2)  " + path1.resolve(path2));
		System.out.println("path2.resolve(path1)  " + path2.resolve(path1));

		System.out.println("path1.relativize(path2)  " + path1.relativize(path2) + "\n");
		
		path1 = FileSystems.getDefault().getPath("C:/hello");

		System.out.println("path1.resolve(path2)  " + path1.resolve(path2));
		System.out.println("path2.resolve(path1)  " + path2.resolve(path1));
		
		

	}

}
