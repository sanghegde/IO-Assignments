//deserialization
package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
public static void main(String args[])
{
	Employee employee;
	try {
		FileInputStream fis=new FileInputStream("new.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		employee=(Employee) ois.readObject();
		System.out.println(employee);
		
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
}
}
