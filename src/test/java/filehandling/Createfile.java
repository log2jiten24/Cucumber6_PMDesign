package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Createfile {

	/**
	 * Create a new file in Java using :- 1. File IO 2. FileOutput Stream 3. JAVA
	 * NIO Utils
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String path = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\sample.text";
		// 1.call the first method of creating new file using File class

		create_newfile(path);

		// 2.File OutputStream along with Scanner class -read and write the file at run
		// time

		create_writefilecontent();

		// 3. create new file using the java nio package
		String filelocation = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps\\File Handling\\newFile.txt";
		createNewfile(filelocation);

	}

	// 1. First way of creating file using the File Class available in io.File
	// Package
	public static void create_newfile(String path) {

		File file = new File(path);

		try {
			// create one flag value to check if the file is created
			boolean flag = file.createNewFile();

			if (flag) {
				System.out.println("File is created ");
			} else {
				System.out.println("File is already present ");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// 2.File OutputStream along with Scanner class

	public static void create_writefilecontent() {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name with location path");

			String fileName = sc.nextLine();

			FileOutputStream fos = new FileOutputStream(fileName);

			System.out.println("Enter the file content :");
			String content = sc.nextLine();

			byte b[] = content.getBytes();
			// write the file
			fos.write(b);
			// close the fileOutput stream
			fos.close();
			System.out.println("File is saved  at the given location ");

		} catch (Exception e) {

			System.out.println("Exceptions occured ..");
			e.printStackTrace();
		}

	}

	// 3. Using Java nio package API

	public static void createNewfile(String filelocation) {

		try

		{
			Path pathLocation = Paths.get(filelocation);
			// create file and store the path where file is being created
			Path newPath = Files.createFile(pathLocation);

			System.out.println("new file created at :" + newPath);

		} catch (Exception e) {

			System.out.println("Some Exceptions occured ..");
			e.printStackTrace();

		}
	}
}
