package qaclickacademy.Mavenjava;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoClass1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "//Users//siharjan//Desktop//chromederiver//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*here we cannot write webdriver driver=new Webdriver
		 * . as Webdriver is a interface ,it cannot be instantiated
		 */
		//-----------------------------------------------------
		/*
		 * Selenium WebDriver is an interface that defines a set of methods.
		 *  However, implementation is provided by the browser specific classes. 
		 * Some of the implementation classes are AndroidDriver, ChromeDriver, FirefoxDriver,
		 *  InternetExplorerDriver, IPhoneDriver, SafariDriver etc
		 */
		//----------------------------------------------------
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='Browser']"));
		//in select ,we give webelement in parameter
		//in action class ,we give driver as parameter
		Select select=new Select(dropdown);
		
		/*
		 * org.openqa.selenium.support.ui.Select
		 * selectByVisibleText() and deselectByVisibleText()
		 * selectByValue() and deselectByValue()
		 * selectByIndex() and deselectByIndex()
		 * isMultiple()
		 * deselectAll()
		 * getAllSelectOptions:List<WebElement>
		 * getFirstSelectedOption
		 * getOptions:List<WebElements>
		 * We can also use the selectByVisibleText() method in selecting multiple options in a multi SELECT element
		 */
		
		List<WebElement> list=driver.findElements(By.name("radiobutton"));
		int count=list.size();
		Boolean iselected= list.get(0).isSelected();
		if(iselected)
		{
			((WebElement) list.get(1)).click();
		}
		else
		{
			((WebElement) list.get(0)).click();
		}
		//  https://www.softwaretestinghelp.com/webdriver-commands-selenium-tutorial-14/
		
		for (int i = 0; i < count; i++) {

	         // Store the checkbox name to the string variable, using 'Value'
	         // attribute
	         String sValue = list.get(i).getAttribute("value");

	         // Select the checkbox if its value is the same that you want.
	         if (sValue.equalsIgnoreCase("checkbox")) {

	            list.get(i).click();

	            // This statement will get you out of the for loop.
	            break;
	         }

	      }
		
		List<WebElement> rows=driver.findElements(By.xpath("//*//following::table/tr"));
		System.out.println(rows.size());
		Iterator<WebElement> itr=rows.iterator();
		
		if(itr.hasNext())
		{
			WebElement item=itr.next();
			String label=item.getText();
			
		}
		
		/*<input class="email" id="email" type="text" placeholder="your@email.com">
		<input class="btn btn-small" type="submit" value="Subscribe to our blog">
		*/
		// Java code example for using cssSelector.

		WebElement emailText = driver.findElement(By.cssSelector("input#email"));

		//Or

		WebElement emailText2 = driver.findElement(By.cssSelector("input.email"));

		WebElement subscribe = driver.findElement(By.cssSelector("input[type='submit'][value='Subscribe to our blog']"));
		
		/*1) ^= as in input[id^='Tech'] means Starting with the given string.
				 

				2) $= as in input[id$='_Beamers'] means Ending with the given text.
				 

				3) *= as in Input[id*='techbeamers'] means Containing the given value.
				*/
		// XPath starts-with() example.
// => input[starts-with(@id,'User')]

// XPath ends-with() example.
// => input[ends-with(@id,'_name')]

// XPath contains() example.
// => input[contains(@id,'email')]
		
		
		/*Command – element.isDisplayed();

		This method will return true if the element is present and visible on the page. It’ll throw a NoSuchElementFound exception if the element is not available. If it is available but kept as hidden, then the method will return false
		
		*/
		

	}

}
