package qaclickacademy.Mavenjava;

public class Log4J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Where excatly log4j helps
		 * 
		 * 1.logging everything into a seperate file,if we want to send the logs to
		 * client 2. Client only want failure logs eg:- only failure on package A 3.
		 * Client want logs with timestamp 4.Client want log file of last week
		 */

		// ==============================
		/*
		 * Where to log------Appenders tag in log4j xml(for eg in console)
		 * 
		 * How to log ----is in patternLayout(this tag means like how i want to log it
		 * for example with timestamp)
		 * 
		 * What to log----Loggers tag ,in loggers tag we have root tag in that level =
		 * error
		 * 
		 * then it will log only error,if level = trace then it will log all the logs
		 */

		/*
		 * 
		 * 
		 * Use log. Error() to log when elements are not displayed in the page or if any
		 * validations fail---but the script willl continue
		 * 
		 * Use Log. Debug()-----and log.trace re same only log.trace provides more finer info then debug
		 * 
		 * When each Selenium action is performed like click, SendKeys, getText()
		 * 
		 * Use log.info()
		 * 
		 * When operation is successfully completed ex: After loading page, or after any
		 * successful validations
		 * 
		 * log.fatal---
		 * Designates very severe error events that will presumably lead the application to abort
		 */
	}

}
