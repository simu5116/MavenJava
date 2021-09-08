package qaclickacademy.Mavenjava;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Draw a border for the web element Change the background color of the web
		 * element Draw a border for the web element + Change the background color of
		 * the web element
		 */
		/*
		 * WebElement emailTxt = driver.findElement(By.id("email")); JavascriptExecutor
		 * jsExecutor = (JavascriptExecutor) driver;
		 * jsExecutor.executeScript("arguments[0].style.border='2px solid red'",
		 * emailTxt);
		 */

		/*
		 * WebElement emailTxt = driver.findElement(By.id("email")); JavascriptExecutor
		 * jsExecutor = (JavascriptExecutor) driver;
		 * jsExecutor.executeScript("arguments[0].style.background='yellow'", emailTxt);
		 */

		/*
		 * WebElement emailTxt = driver.findElement(By.id("email")); JavascriptExecutor
		 * jsExecutor = (JavascriptExecutor) driver; jsExecutor.
		 * executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')"
		 * , emailTxt);
		 */

		/*
		 * As this is an interface, we can't create an instance for this but we can
		 * create a reference for this interface by assigning the WebDriver instance to
		 * JavascriptExecutor as follows, JavascriptExecutor jse = driver; With the
		 * above line, we get the error saying that
		 * "Type mismatch: cannot convert from WebDriver to JavascriptExecutor".
		 * 
		 * This is because this WebDriver is one type of interface and
		 * JavascriptExecutor is another type of interface, but if we provide the
		 * typecasting here then it works.
		 * 
		 * So here we need to cast WebDriver instance to JavascriptExecutor as shown
		 * below, JavascriptExecutor jse = (JavascriptExecutor) driver;
		 */

	}

}
