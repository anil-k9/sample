package webPages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderManager {
	
	public static void readFile(String filePath)
	{
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			System.out.println("***File Content is: ");
			while ((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
