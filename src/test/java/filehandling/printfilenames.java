package filehandling;

import java.io.File;
import java.util.Arrays;

public class printfilenames {

	/*
	 * Print all files and folders inside the directory in a sorted order
	 */

	public static void main(String[] args) {
		String path = "C:\\Users\\ACER\\OneDrive\\Desktop\\Selenium steps";

		// call the method

		printfileName(path);

	}

	public static void printfileName(String filepath) {

		File file = new File(filepath);
		// store all the list of files inside the array
		File downloaddir[] = file.listFiles();

		// sort the file system
		Arrays.sort(downloaddir);

		for (File e : downloaddir) {

			if (e.isFile()) {
				System.out.println("File : " + e.getName() + "-" + "location of file" + "-" + e.getAbsolutePath());
			} else if (e.isDirectory()) {
				System.out.println(
						"Directory names : " + e.getName() + "-" + "location of file" + "-" + e.getAbsolutePath());

			} else {
				System.out.println("Not known : " + e.getName() + "-" + "location of file" + "-" + e.getAbsolutePath());
			}
		}

	}

}
