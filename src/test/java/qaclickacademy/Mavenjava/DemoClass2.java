package qaclickacademy.Mavenjava;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoClass2 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		/*
		 * . Actions Class and action interface in Selenium
		 * 
		 * Actions Class:--The class description clearly states
		 * that we can perform complex user interaction using the Actions class.
		 * 
		 * Actions class is a collection of individual Action that you want to perform
		 * 
		 * Actions is a class that is based on a builder design pattern.  This is a user-facing API for emulating complex user gestures.

			Whereas Action is an Interface which represents a single user-interaction action. 
			It contains one of the most widely used methods perform().
			
			build() method returns action interface
		 */
		//in select ,we give webelement in parameter
		//in action class ,we give driver as parameter

		String baseUrl = "http://www.facebook.com/"; 
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder=new Actions(driver);
		Action action=builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys("hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick(txtUsername)
				.build();
		action.perform();
		
		/*
		 * Robot Class can simulate Keyboard and Mouse Event
			Robot Class can help in upload/download of files when using selenium web driver---AutoIT(that only works on windows)
			Robot Class can easily be integrated with current automation framework (keyword, data-driven or hybrid)
			
			Abstract Window Toolkit(awt)
		 */
		
		Robot rb = new Robot();
		 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Chait\\Desktop\\File upload.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   //click on ‘Choose file’ to upload the desired file
		//in file upload no need to click on browse button,as it is active only it will directly enter path in that input
		//also use proper escape sequence in file that is // not / in path
		   browse.sendKeys("C:\\Users\\Chait\\Desktop\\Files\\Job Specification.txt"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		
	}

}
