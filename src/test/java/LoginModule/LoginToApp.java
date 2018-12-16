package LoginModule;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.ReadData;
import common.WebDriverUtils;

public class LoginToApp extends LoginLocators
{
	String URL = "https://www.firstcry.com/";
	String invalidUsername = "1234567890";
	String invalidPassword = "password12345";

	public void login(String userName, String password)
	{
		//popupHandle();

		click(By.xpath("//div[@class='_pop_close _pop_reg_bg']"));
		click(LoginLocators.Login);
		pause(2000);
		typeText(LoginLocators.Email,userName);
		typeText(LoginLocators.pass,password);
		pause(2000);
		mouseMove();
		click(LoginLocators.LoginButton);

	}

	@BeforeClass
	public void setup()

	{
		WebDriverUtils.loadBrowser();
		WebDriverUtils.openApplication(URL);

	}

	//*@Test
	public void invalidLogin(String invalidUsername, String invalidPassword)
	{
		login(invalidUsername,invalidPassword);
		Assert.assertEquals(getInvalidLoginMessage(), "Please enter valid Email ID/Mobile number");

	}

	@Test
	public void validlogin()
	{
		ReadData.readFromTextFile();
		login(ReadData.MyUser,ReadData.pass);
	}

	@AfterClass
	public void tearDown() 
	{
		closeBrowser();
	}
}
