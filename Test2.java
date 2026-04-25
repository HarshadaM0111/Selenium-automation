package test.selenium_automation;

/*
Go to university website than open the myntra after that navigate to SBI Bank than again open university  
website refresh the page also printURL of university and title of myntra and close
*/

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://student.dbatu.ac.in/erp/index.aspx");
		
		driver.navigate().to("https://www.myntra.com/");
		
		System.out.println("Title of myntra "+driver.getTitle());
		
		driver.navigate().to("https://onlinesbi.sbi.bank.in/");
		
		driver.navigate().to("https://student.dbatu.ac.in/erp/index.aspx");
		
		driver.navigate().refresh();
		
		System.out.println("Url OF university : "+driver.getCurrentUrl());
		
		driver.close();
		
	}

}
