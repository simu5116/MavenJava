package qaclickacademy.Mavenjava;

import org.openqa.selenium.OutputType;

public class DemoClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Int size = driver.findElements(By.tagName("iframe")).size(); By Index By Name
		 * or Id By Web Element driver.switchTo().frame(0); driver.switchTo().frame(1);
		 * driver.switchTo().frame("iframe1");
		 * driver.switchTo().frame("id of the element");
		 * 
		 * to move back to the parent frame, you can either use switchTo().parentFrame()
		 * or if you want to get back to the main (or most parent) frame, you can use
		 * switchTo().defaultContent();
		 * 
		 * driver.switchTo().parentFrame(); driver.switchTo().defaultContent();
		 */

		// =========================================================================================

		// how to take screenshot in selenium

		// 1st way

//		TakeScreenShot screenshot=(TakeScreenshot)driver;
//		
//		File SrcFile=screenshot.getScreenshotAs(OutputType.FILE);
//		//Move image file to new destination
//
//        File DestFile=new File(fileWithPath);
//
//        //Copy file at destination
//
//        FileUtils.copyFile(SrcFile, DestFile);

		/*
		 * Ashot is a third party utility by Yandex supported by Selenium WebDriver to
		 * capture the Screenshots. It takes a screenshot of an individual WebElement as
		 * well as a full-page screenshot of a page, which is more significant than
		 * screen size.
		 */

	}

}
