//serializationclass
package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
public static void main(String args[])
{
	Employee employee=new Employee(1234,"Sangeeta",12345);
	try {
		FileOutputStream fos=new FileOutputStream("new.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(employee);
		System.out.println("Successful");
	} catch (FileNotFoundException e) {
				e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
