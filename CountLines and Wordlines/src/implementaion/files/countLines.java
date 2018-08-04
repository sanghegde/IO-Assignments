//program to count the number of lines in a file
package implementaion.files;

import java.io.FileInputStream;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class countLines {

	public static void main(String[] args) throws IOException {
		int lineCount = 0;
		// reading the file using file path
		BufferedReader reader = new BufferedReader(new FileReader("P:/Users/sanhegde/Desktop/new.txt"));
		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			lineCount++;

		}
		reader.close();
		System.out.println("Line count: " + lineCount);
	}

}
