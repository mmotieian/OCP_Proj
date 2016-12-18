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
		
		Car s1 = new Car();
		Car s2 = new Car();
		
		File file = new File("test.txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
			
			oos.writeObject(s1);
			oos.writeObject(s2);
		
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
		processObjectFile(file);
		
		
	}
	
	public static void processObjectFile(File file){
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
			
			System.out.println(((Car)ois.readObject()).getStr());
			System.out.println(((Car)ois.readObject()).getInstance());
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
