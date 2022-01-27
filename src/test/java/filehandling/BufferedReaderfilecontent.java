package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderfilecontent {

	public static void main(String[] args) {

		
		String path = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\FileOpening.txt";

		BufferedReader br = null;
		try {
			File file = new File(path);
			// read the file
			br = new BufferedReader(new FileReader(file));
			System.out.println("File content is :");

			int c = 0;
			// read till the end of the file
			while ((c = br.read()) != -1) {

				System.out.print((char) c);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	}


