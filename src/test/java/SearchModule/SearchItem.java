package SearchModule;

import org.testng.annotations.Test;

import common.ReadData;
import common.SearchLocators;

public class SearchItem extends SearchLocators

{
	@Test(priority =1)
	public void SearchMyItem()
	{
		click(SearchLocators.Search);
		typeText(SearchLocators.Search, ReadData.Item1);
		pause(1000);
		click(SearchLocators.SearchIcon);
		click(SearchLocators.sortOption);
		click(SearchLocators.Mychoice);
	}
}
