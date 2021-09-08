package qaclickacademy.Mavenjava;

public class DemoClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Suppose we are trying to find an element which has some
		 * "ExpectedConditions "(Explicit Wait), If the element is not located within
		 * the time frame defined by the Explicit wait(10 Seconds), It will use the time
		 * frame defined by implicit wait(20 seconds) before throwing an
		 * "No Such Element Exception".
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ; 
		 * implicit wait throws----nosuchelementfound 
		 * explicit wait,fluent wait throws----elementnotvisible
		 * WebDriverWait wait=new WebDriverWait(driver, 20);
		 * 
		 * guru99seleniumlink=
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"
		 * ))); guru99seleniumlink.click();
		 * 
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
		 * TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 */
	}

}
