package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy {

	// File Handling 1st part
	// Copy a pdf file and create a different file in the same location

	public static void main(String[] args) {

		String filepath1 = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\VOCABULARY.pdf";

		String filepath2 = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\VOCABULARY_copy.pdf";

		// call the method

		copyFile(filepath1, filepath2);
	}

	public static void copyFile(String InputFilepath, String Outputfilepath) {

		File file = new File(InputFilepath);

		File outFile = new File(Outputfilepath);

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {

			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// to see the file length in size - how many bytes are available in the file
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {

			e.printStackTrace();
		}

		int i = 0;

		try {
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write(i);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		finally {
			// close the streams

			if (fileInputStream != null) {

				try {
					fileInputStream.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}

			if (fileOutputStream != null) {

				try {
					fileOutputStream.close();
				} catch (IOException e) {

					e.printStackTrace();
				}

			}

		}
	}
}
