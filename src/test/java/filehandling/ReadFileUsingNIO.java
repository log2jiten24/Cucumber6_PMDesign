package filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingNIO {

	public static void main(String[] args) {

		
		String path = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\FileOpening.txt";
		
		//call the function 
		
		readFilesUsingNIO(path);
		
	}
	
	public static void  readFilesUsingNIO (String path) {
		
		try {
			//read the file and store it inside the list of the strings
		List<String> alllist =	Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8) ;
		
		//store the list of the Strings inside the Iterator 
		Iterator<String> itr = alllist.iterator();
		
		while (itr.hasNext()) {
		
		System.out.println (itr.next());	
			
		}
 		
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
