package org.ama;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase {
@DataProvider(name="value")
	public Object[][] getdata(){
		return new Object[][] {{"apple iphone"},{"Mi phone"},{"Dell Laptop"},{"drone"},{"nike shoes"},{"Samsung LedTv"},{"Echo smart speaker"},{"earpods"}};
	}

@Test(dataProvider="value")

	private void method1(String s)
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHEESWARI\\Desktop\\Frameworks\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
WebElement searchbox=driver.findElement(By.name("q"));
searchbox.sendKeys(s,Keys.ENTER);
	}		
}


