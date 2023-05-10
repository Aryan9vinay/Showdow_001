package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;


//WRITE SCRIPT TO DEMONSTRATE ROBAT CLASS.HOW TO WRITE QSP IN NOTEPAD

public class WrtQSPInNotepad {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	//Runtime is class and getRuntime is static method and exec is execution through command
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);//For synchronization other handler not in used bcz it is java not selenium other work in selenium only
		Robot r= new Robot();//why Robot class bcz we are not able to inspect
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		
		

	}

}
