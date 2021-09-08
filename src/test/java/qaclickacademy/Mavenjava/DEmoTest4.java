package qaclickacademy.Mavenjava;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmoTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//*[text()='Tables from 2 to 5']/following::table//tbody//tr[2]//following::td
		//*[text()='Tables from 2 to 5']/following::table//tbody//tr[2]/following::td
		//https://www.cuemath.com/multiplication-tables/tables-2-to-20/
		
		//to print all cell values in table
		
		WebDriver wd;
    	System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
    	wd = new ChromeDriver();
    	//wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 //WebDriver.Timeouts.implicitlyWait(Duration.ofSeconds(10));
    	//WebDriver.Timeouts.implicitlywait()
    	//wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	wd.get("http://demo.guru99.com/test/table.html");
    	//To locate table.
    	WebElement mytable = wd.findElement(By.xpath("/html/body/table/tbody"));
    	//To locate rows of table. 
    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
    	//To calculate no of rows In table.
    	int rows_count = rows_table.size();
    	//Loop will execute till the last row of table.
    	for (int row = 0; row < rows_count; row++) {
    	    //To locate columns(cells) of that specific row.
    	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
    	}
   	
	}
	
	
	
	//----------------------------------------------
	
	
	
	/*
	 * default WebDriver.Timeouts implicitlyWait​(java.time.Duration duration)
	 * Specifies the amount of time the driver should wait when searching for an
	 * element if it is not immediately present. When searching for a single
	 * element, the driver should poll the page until the element has been found, or
	 * this timeout expires before throwing a NoSuchElementException. When searching
	 * for multiple elements, the driver should poll the page until at least one
	 * element has been found or this timeout has expired.
	 * 
	 * Increasing the implicit wait timeout should be used judiciously as it will
	 * have an adverse effect on test run time, especially when used with slower
	 * location strategies like XPath.
	 * 
	 * If the timeout is negative, not null, or greater than 2e16 - 1, an error code
	 * with invalid argument will be returned.
	 */
	
	/// -------------------------------------
	/*
	 * default WebDriver.Timeouts setScriptTimeout​(java.time.Duration duration)
	 * Sets the amount of time to wait for an asynchronous script to finish
	 * execution before throwing an error. If the timeout is negative, not null, or
	 * greater than 2e16 - 1, an error code with invalid argument will be returned.
	 * Parameters: duration - The timeout value.
	 */

	// -----------------------------
	/*
	 * default WebDriver.Timeouts pageLoadTimeout​(java.time.Duration duration) Sets
	 * the amount of time to wait for a page load to complete before throwing an
	 * error. If the timeout is negative, not null, or greater than 2e16 - 1, an
	 * error code with invalid argument will be returned. Parameters: duration - The
	 * timeout value. Returns: A Timeouts interface.
	 */

}
