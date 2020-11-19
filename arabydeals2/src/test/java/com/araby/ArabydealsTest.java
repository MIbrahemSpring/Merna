package com.araby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.araby.utils.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArabydealsTest {

	WebDriver driver;

	@BeforeTest
	public void Test() {

		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		driver.get(Constant.DEFAULT_LANDING);
		driver.manage().window().maximize();
	}

	private boolean checkURL(String keyword) {
		return driver.getCurrentUrl().contains(keyword);
	}

//	@Test(priority = 1)
//	public void checkAboutArabyDealsURL() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".left-menu > .nav-item:nth-child(2) > .nav-link")).click();
//		Assert.assertEquals(checkURL("/About"), true, "About Araby Deals URL is not correct");
//	}

}
