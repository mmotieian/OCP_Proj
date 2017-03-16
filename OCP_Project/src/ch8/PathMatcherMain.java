package ch8;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherMain extends SimpleFileVisitor<Path> {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("").toAbsolutePath();

		PathMatcherMain pathMatcherMain = new PathMatcherMain();
		Files.walkFileTree(path, pathMatcherMain);

	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		// TODO Auto-generated method stub
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("regex:.*.java");
		if (matcher.matches(file)) {
			System.out.println(file);
		}

		return super.visitFile(file, attrs);
	}

}
