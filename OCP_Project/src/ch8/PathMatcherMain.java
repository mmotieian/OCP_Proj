package ch8;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("test.txt");
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");

		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));

		while (matcher.matches(path)){
			System.out.println(path);
		}

	}

}
