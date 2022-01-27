package filehandling;

import java.awt.Desktop;
import java.io.File;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
		
		
		String path = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\VOCABULARY.pdf" ;
		
		//call the function to open the text file 
		
		Openfile(path);
		
		
	}
		public static void Openfile(String path) {
			
		try {
		
			File file = new File (path);
			
			if (!Desktop.isDesktopSupported()) {
				
				System.out.println ("desktop not supported");
				
				return;
			}
			
		Desktop desktop = Desktop.getDesktop() ;
		
		if (file.exists()) {
			
			desktop.open(file);
		}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
