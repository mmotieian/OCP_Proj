package ch7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Car car2 = new Car("car2", new Car(),new Engine(2));  // -->  java.io.NotSerializableException
		
		File file = new File("carTest.txt");
		processObjectOutputStream(car1, car2, file); 
		
		processObjectFile(file);
		
		
	}

	private static void processObjectOutputStream(Car car1, Car car2, File file) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
			
			oos.writeObject(car1);
			oos.writeObject(car2);
		
		} catch (IOException e) {			
			e.printStackTrace();
			
		}
	}
	
	public static void processObjectFile(File file){
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
			
			System.out.println((Car)ois.readObject());	// car 1
			System.out.println((Car)ois.readObject());	// car 2
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
