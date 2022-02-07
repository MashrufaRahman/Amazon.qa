package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazone.qa.common.CommonMethods;

public class MainPage {

	public MainPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav-link-accountList']")
	public WebElement helloSignIn;
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
	public WebElement startHere;
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	public WebElement firstName;
	@FindBy(xpath = "//input[@id='ap_email']")
	public WebElement email;
	@FindBy(xpath = "//input[@id='ap_password']")
	public WebElement password;
	@FindBy(xpath = "//input[@id='ap_password_check']")
	public WebElement reEnterPassword;

	public void helloSignInMethod(CommonMethods cm, WebDriver driver) {
		cm.mouseHoverOver(driver, helloSignIn);

	}

	public void startHereMethod(CommonMethods cm) {
		cm.clicking(startHere);
	}

	public void firstNameMethod(CommonMethods cm) {
		cm.enterkeys(firstName, "Mashrufa");
	}

	public void emailMethod(CommonMethods cm) {
		cm.enterkeys(email, "Tahmina1234@gmail.com");
	}

	public void passwordMethod(CommonMethods cm) {
		cm.enterkeys(password, "pass11");
	}

	public void reEnterPasswordMethod(CommonMethods cm) {
		cm.enterkeys(reEnterPassword, "pass11");
	}

}