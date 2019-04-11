package com.jean.app;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SeleniumTestsApplicationTests {
	public static WebDriver driver = null;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void close() {
		driver.close();
	}
	
	
	@Test
	public void wikipediaVerifyText() {
		driver.navigate().to("https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).click();
		driver.findElement(By.id("searchInput")).sendKeys("selenium");
		driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("sélénium")).click();
		assertEquals("4,79 g·cm-3 (gris)", driver.findElement(By.cssSelector("tr:nth-child(36) b")).getText());
	}

}
