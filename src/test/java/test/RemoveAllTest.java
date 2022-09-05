package test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.DashBoardPage;
import page.ListCheckBoxPage;
import util.BrowserFactory;

public class RemoveAllTest {

	WebDriver driver;
	ListCheckBoxPage listCheckBoxPage;
	DashBoardPage dashBoardPage;
	
	@Before
	public void removeAllTest() {

		driver = BrowserFactory.startBrowser();

		listCheckBoxPage = PageFactory.initElements(driver, ListCheckBoxPage.class);
	}
	
	@Test
	public void clickAllItemAndRemove() {
		listCheckBoxPage.clickToggleAllCheckBox();
		listCheckBoxPage.clickRemoveButton();
		
		Assert.assertTrue("No Items Located", isListItemEmpty());
	}

	private boolean isListItemEmpty() {
		List<String> CheckBoxList = listCheckBoxPage.getListOfCheckBox();
		for(int i=0;i<CheckBoxList.size();i++) {
			if(CheckBoxList.get(i).isEmpty()) {
				
			}
		}
		return true;
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
