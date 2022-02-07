package amazone.qa.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {
	
	public void mouseHoverOver(WebDriver driver,WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public void clicking(WebElement element) {
		element.click();
	}
	public void enterkeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	
	
	
}
