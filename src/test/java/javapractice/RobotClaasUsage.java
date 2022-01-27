package javapractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClaasUsage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String command = "C:\\Windows\\Notepad.exe" ;
		
		Runtime run = Runtime.getRuntime() ;
		
		run.exec(command);
		
		Robot myRobot = new Robot();
		
		myRobot.keyPress(KeyEvent.VK_J);
		Thread.sleep(1000);
		myRobot.keyRelease(KeyEvent.VK_J);
		
		myRobot.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		myRobot.keyRelease(KeyEvent.VK_I);
		
		myRobot.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		myRobot.keyRelease(KeyEvent.VK_T);
		
		myRobot.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
		myRobot.keyRelease(KeyEvent.VK_E);
		
		myRobot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		myRobot.keyRelease(KeyEvent.VK_N);

	}

}
