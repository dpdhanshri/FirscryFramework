
package common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

//declaration of all webdriver common methods
public class WebDriverUtils
{
	static WebDriver driver;
	public static void loadBrowser()
	{
		//download IE driver exe file kept at one locatiopn like below
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
	}

	public static void openApplication(String URL)
	{
		driver.get(URL);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void click(By locator) {
		getElement(locator).click();
	}
	
	public static String getText(By locator) {
		return getElement(locator).getText();
	}
	public void mouseMove() {
		Actions act = new Actions(driver);
		act.moveByOffset(500, 700);
	}

	protected void pause(int i) {
		// TODO Auto-generated method stub
		
	}  
	protected String getInvalidLoginMessage() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void typeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}


}
