package ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOCharacterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// fileWriter("char.txt");
		// fileReader("char.txt");
		printWriter("print.txt");
		fileReader("print.txt");
	}

	private static void printWriter(String string) {
		// TODO Auto-generated method stub

		try (PrintWriter pw = new PrintWriter(new File(string))) {

			pw.println("This is on a new line");
			pw.print("hello world");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void fileReader(String string) {
		// TODO Auto-generated method stub
		char[] cbuf = new char[1];
		try (FileReader fr = new FileReader(new File(string))) {

			while (-1 != fr.read(cbuf)) {
				System.out.print(cbuf);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void fileWriter(String fileName) {
		// TODO Auto-generated method stub

		char[] c = new char[1];

		try (FileWriter fw = new FileWriter(new File(fileName), true)) {

			fw.write("Hello World in Character file \r\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
