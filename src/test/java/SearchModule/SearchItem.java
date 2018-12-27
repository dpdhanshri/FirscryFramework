package SearchModule;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.LoginLocators;
import common.ReadData;
import common.SearchLocators;
import common.WebDriverUtils;

public class SearchItem extends SearchLocators

{
	@Test()
	public void SearchMyItem() throws InterruptedException
	{
		click(SearchLocators.Search);
		System.out.println("hi");
		typeText(SearchLocators.Search,ReadData.Item1);
		pause(1000);
		click(SearchLocators.SearchIcon);
		Thread.sleep(10000);
		click(SearchLocators.sortOption);
		Thread.sleep(20000);
		click(SearchLocators.Mychoice);
	}
}
