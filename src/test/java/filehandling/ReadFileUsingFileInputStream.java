package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {

		String path = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\FileOpening.txt";

		FileInputStream fis = null;
		try {
			File file = new File(path);
			// read the file
			fis = new FileInputStream(file);
			System.out.println("File content is :");

			int c = 0;
			// read till the end of the file
			while ((c = fis.read()) != -1) {

				System.out.print((char) c);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}