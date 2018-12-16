package LoginModule;

import org.openqa.selenium.By;

import common.PopUpCommonHandle;

public class LoginLocators extends PopUpCommonHandle
{
	
	static By Login = By.xpath("//span[@class='poplogin_main poplogin']");
	static By Email = By.xpath("//input[@id='txtLUNm']");
	static By pass = By.xpath("//input[@id='txtLPass']");
	static By LoginButton = By.xpath("//input[@id='btnlogon']");
			

}

