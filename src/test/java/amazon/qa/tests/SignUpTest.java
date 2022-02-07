package amazon.qa.tests;

import org.testng.annotations.Test;

import amazon.qa.base.BaseClass;

public class SignUpTest extends BaseClass {

	@Test
	public void verifyTest() throws Exception {
		
		mainPage.helloSignInMethod(cm, driver);
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {

		}
		mainPage.startHereMethod(cm);
		Thread.sleep(2000);
		mainPage.firstNameMethod(cm);
		mainPage.emailMethod(cm);
		mainPage.passwordMethod(cm);
		mainPage.reEnterPasswordMethod(cm);

	}

	// open an facebook with username and password>>>>>>>> Your task

}
