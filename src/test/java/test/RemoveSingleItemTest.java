package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.DashBoardPage;
import page.ListCheckBoxPage;
import util.BrowserFactory;

public class RemoveSingleItemTest {

	WebDriver driver;
	ListCheckBoxPage listCheckBoxPage;
	DashBoardPage dashBoardPage;

	@Before
	public void removeSingleItemTest() {

		driver = BrowserFactory.startBrowser();

		listCheckBoxPage = PageFactory.initElements(driver, ListCheckBoxPage.class);
	}
	@Test
	public void clickOneBoxToRemove() throws InterruptedException {
		
		listCheckBoxPage.ClickOneBox();
		Thread.sleep(2000);
		listCheckBoxPage.clickRemoveButton();
		
		Assert.assertNull("Cannot Remove Item", listCheckBoxPage);
		
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}