package ch7;

import java.io.BufferedInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class IOStreamMain {

	public static void main(String[] args) {

		// fileOutputStream("test.txt");
		// fileInputStream("test.txt");
		// bufferedInputStream("test.txt");
		// objectOutputStream("data.dat");
		objectInputStream("data.dat");
	}

	private static void objectInputStream(String fileName) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {

			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			
			for(String str : list)
				System.out.print(str);

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void objectOutputStream(String fileName) {

		List<String> list = new ArrayList<>();
		list.add("HELLO");
		list.add(" WORLD ");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {

			oos.writeObject(list);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static void bufferedInputStream(String fileName) {

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)))) {

			byte[] b = new byte[1];
			while (bis.read(b) != -1) {

				System.out.print(new String(b));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void fileInputStream(String fileName) {

		// Integer data = new Integer(0);
		byte[] data = new byte[1];
		try (FileInputStream fis = new FileInputStream(new File(fileName));) {

			while (fis.read(data) != -1) {

				System.out.print(new String(data));
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static void fileOutputStream(String fileName) {

		byte[] b = new byte[64];
		b = new String("hello world ").getBytes();

		try (FileOutputStream fos = new FileOutputStream(new File(fileName), true);) {

			fos.write(b);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
