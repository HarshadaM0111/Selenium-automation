package OtherWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class other2 {


	
	void brokenlinks() {
		List<WebElement> bl = driver.findElement(By.partialLinkText("Errorcode"));
		
		
	}
	
}
