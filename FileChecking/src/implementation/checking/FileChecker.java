//program to check whether the file is existing or not
package implementation.checking;

import java.io.File;

public class FileChecker {
	public static void main(String[] args)
	{
		File f=new File("P:\\Users\\sanhegde\\Desktop\\file.txt");//pathname
		
		if(f.exists())
		{
			System.out.println("FileExisted");
			
		}
		else
		{
			System.out.println("not found");
		}
	}

}
