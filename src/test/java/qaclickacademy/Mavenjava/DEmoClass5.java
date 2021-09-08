package qaclickacademy.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DEmoClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desired Capabilities is a class in Selenium used to set properties of
		 * browsers to perform cross browser testing of web applications It stores the
		 * capabilities as key-value pairs and these capabilities are used to set
		 * browser properties like browser name, browser version, path of browser driver
		 * in the system, etc. to determine the behaviour of browser at run time.
		 * 
		 */

		/*
		 * SSL (Secure Sockets Layer) is a standard security protocol for establishing a
		 * secure connection between the server and the client which is a browser.
		 * 
		 * SSL (Secure Socket Layer) Certificate ensures secure transformation of data
		 * across the server and client application using strong encryption standard or
		 * digital signatur SSL-secured websites begin with https:// and you can see a
		 * lock icon or green address bar if the connection is securely established.
		 * Suppose we have written some test scripts and while executing the script, we
		 * caught in the situation as "Untrusted Connection" above then how do we handle
		 * the exception purely through automation
		 */
		// Create an object of desired capabilities class with Chrome driver
		DesiredCapabilities capability = DesiredCapabilities.htmlUnit();
		// Set the pre defined capability – ACCEPT_SSL_CERTS value to true
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// Open a new instance of chrome driver with the desired capability
		WebDriver driver2 = new ChromeDriver(capability);

		/*
		 * The Chromeoptions Class is a concept in Selenium WebDriver for manipulating
		 * various properties of the Chrome driver. The Chrome options class is
		 * generally used in conjunction with Desired Capabilities for customizing
		 * Chrome driver sessions. It helps you perform various operations like opening
		 * Chrome in maximized mode, disable existing extensions, disable pop-ups, etc.
		 */

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);

		/*
		 * start-maximized: Opens Chrome in maximize mode incognito: Opens Chrome in
		 * incognito mode headless: Opens Chrome in headless mode disable-extensions:
		 * Disables existing extensions on Chrome browser disable-popup-blocking:
		 * Disables pop-e browser mups displayed on Chromake-default-browser: Makes
		 * Chrome default browser version: Prints chrome browser version
		 * disable-infobars: Prevents Chrome from displaying the notification 'Chrome is
		 * being controlled by automated software
		 */

		/*
		 * MaxInstances This says....how many instances of same version of browser can
		 * run over the Remote System.
		 * 
		 * For example, i have a FF12,IE and i declared the command as follows -browser
		 * browserName=firefox,version=12,maxInstances=5,platform=LINUX -browser
		 * browserName=InternetExplorer,version=9.0,maxInstances=5,platform=LINUX So i
		 * can run 5 instances of Firefox 12 and as well as 5 instances of IE9 at the
		 * same time in remote machine. So total user can run 10 instances of different
		 * browsers (FF12 & IE9) in parallel.
		 * 
		 * MaxSession This says....how many browsers (Any Browser and any version) can
		 * run in parallel at a time in the remote system. So this overrides the Max
		 * Instances settings and can restrict the number of browser instances that can
		 * run in parallel.
		 * 
		 * For above example, when maxSession=1 forces that you never have more than 1
		 * browser running.
		 * 
		 * With maxSession=2 you can have 2 Firefox tests at the same time, or 1
		 * Internet Explorer and
		 */
	}

}
