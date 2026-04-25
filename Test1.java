package test.selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {

		// Launch browser initialize the ChromeDriver object
		ChromeDriver driver = new ChromeDriver();
		
		//use to maximize the window 
		driver.manage().window().maximize(); 
		
		//used open to current webpage
		driver.get("https://www.facebook.com/");

		//used for navigation website
		driver.navigate().to("https://www.fortunecloudindia.com/");

		//used to navigate back
		driver.navigate().back();

		//used to close browser
		driver.close();
	}

}
