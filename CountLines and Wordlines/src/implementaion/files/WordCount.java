//program to count the number of words in a file
package implementaion.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		BufferedReader reader = null;
		int wordCount = 0;
		try {
			reader = new BufferedReader(new FileReader("P:/Users/sanhegde/Desktop/new.txt"));
			// reading the first line into a currentline
			String currentLine = reader.readLine();
			while (currentLine != null) {
				String[] words = currentLine.split(" ");

				// updating wordcount
				wordCount = wordCount + words.length;

				// reading next line into currentline
				currentLine = reader.readLine();

			}
			System.out.println("number of words:" + wordCount);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
