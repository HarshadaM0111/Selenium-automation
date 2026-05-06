package test.selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		
		driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_")).sendKeys("Ruta");
		
		driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_")).sendKeys("rane");
		
		driver.findElement(By.id("_R_6ad8p4jikacppb6amH1_")).sendKeys("6754328912");
		
		driver.findElement(By.id("_R_clap4jikacppb6amH1_")).sendKeys("rane123");
		driver.findElement(By.className("x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1")).click();
		
	}

}
