package qaclickacademy.Mavenjava;

public class DemoClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For example, when automating Online Shopping Application, you many need to
		 * automate test scenarios like place order, View Cart, Payment Information,
		 * order confirmation, etc.
		 * 
		 * If cookies are not stored, you will need to perform login action every time
		 * before you execute above listed test scenarios. This will increase your
		 * coding effort and execution time.
		 * 
		 * The solution is to store cookies in a File. Later, retrieve the values of
		 * cookie from this file and add to it your current browser session. As a
		 * result, you can skip the login steps in every Test Case because your driver
		 * session has this information in it.
		 * 
		 * The application server now treats your browser session as authenticated and
		 * directly takes you to your requested URL.
		 */

		// =========================================================================

		/*
		 * JavaScriptExecutor is an Interface that helps to execute JavaScript through
		 * Selenium Webdriver. JavaScriptExecutor provides two methods "executescript" &
		 * "executeAsyncScript" to run javascript on the selected window or current
		 * page. In case, these locators do not work you can use JavaScriptExecutor. You
		 * can use JavaScriptExecutor to perform an desired operation on a web element.
		 * 
		 * Selenium supports javaScriptExecutor. There is no need for an extra plugin or
		 * add-on. You just need to import (org.openqa.selenium.JavascriptExecutor) in
		 * the script as to use JavaScriptExecutor.
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript(Script,Arguments); arguments are optional
		 * 
		 * js.executeScript("arguments[0].click();", button);
		 * 
		 * String TitleName = js.executeScript("return document.title;").toString();
		 * String TitleName = js.executeScript("return document.URL;").toString();
		 * js.executeScript("window.scrollBy(0,600)");
		 * 
		 * driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		 * 
		 * First, it is important the script timeout affects only JavaScript code
		 * executed with executeAsyncScript and nothing else. In particular,
		 * executeScript is not affected by it.
		 * 
		 */
		
		//==========================================================
		/*
		 * To scroll down the web page by the visibility of the element.
		 * js.executeScript("arguments[0].scrollIntoView();", Element);
		 * To scroll down the web page at the bottom of the page.
		 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 */
	}

}
