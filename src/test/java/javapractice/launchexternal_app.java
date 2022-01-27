package javapractice;

import java.io.IOException;

public class launchexternal_app {

	public static void main(String[] args) {

		// launch the application during run time

		Runtime runtime = Runtime.getRuntime();

		try {
			// Launch the Notepad file during runtime and giving the path name is optional
			Process pr = runtime.exec("notepad.exe F:\\Cucumber6Series\\CucumberPOMDesign\\testdata\\DemoFile.txt");

			Thread.sleep(4000);
			// destroy the process
			pr.destroy();

			// to open the Browser and url inside it
			String s[] = new String[] { "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe",
					"https://www.google.co.in" };
			runtime.exec(s);

			// to open the windows media player during run time
			String window[] = new String[] { "C:\\Program Files\\Windows Media Player\\wmplayer.exe",
					"F:\\Melodies\\Jumme Ki Raat.mp3" };

			Process pr1 = runtime.exec(window);
			Thread.sleep(10000);
			// destroy the process
			pr1.destroy();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
