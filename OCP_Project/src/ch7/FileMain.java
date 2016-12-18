package ch7;

import java.io.File;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mkDirs("./test/txt");
		createFile("./test/txt/text.txt");
	}

	private static void createFile(String fileName) {
		File file = new File(fileName);
		try {
			System.out.println("isDirectory: " + file.isDirectory());
			System.out.println("isFile: " + file.isFile());
			System.out.println("File was created: " + file.createNewFile());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void mkDir(String path) {
		File f = new File(path);

		System.out.println("Directory " + path + " created? " + f.mkdir());

	}

	private static void mkDirs(String path) {
		File f = new File(path);

		System.out.println("Directory " + path + " created? " + f.mkdirs());

	}

}
