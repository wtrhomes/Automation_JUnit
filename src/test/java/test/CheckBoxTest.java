package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import page.ListCheckBoxPage;
import util.BrowserFactory;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxTest {

	WebDriver driver;
	ListCheckBoxPage listCheckBoxPage;
	@FindBy(how = How.XPATH, using = "//form[@name='todo']/descendant::input[@type='checkbox']")
	WebElement ListCheckBoxElements;
	
	@Before
	public void checkBoxTest() {
		
		driver = BrowserFactory.startBrowser();
		
		listCheckBoxPage = PageFactory.initElements(driver,ListCheckBoxPage.class);
	}
	@Test
	public void ToggleAllCheckBoxTest() {
		listCheckBoxPage.clickToggleAllCheckBox();
		Assert.assertTrue(IsAllBoxSelected(ListCheckBoxElements));
	}

	private boolean IsAllBoxSelected(WebElement listCheckBoxElements2) {
		List<WebElement> list = driver.findElements(By.xpath("//form[@name='todo']/descendant::input[@type='checkbox']"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).isSelected()) {
				
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
