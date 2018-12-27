package SearchModule;

import org.testng.annotations.Test;

import common.ReadData;
import common.SearchLocators;

public class SearchItem extends SearchLocators

{
	@Test(priority =1)
	public void SearchMyItem() throws InterruptedException
	{
		pause(1000);
		click(SearchLocators.Search);
		typeText(SearchLocators.Search, ReadData.Item1);
		pause(1000);
		click(SearchLocators.SearchIcon);
		Thread.sleep(10000);
		click(SearchLocators.sortOption);
		Thread.sleep(20000);
		click(SearchLocators.Mychoice);
	}
}
