package com.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class util {
	public static WebDriver driver;
	public static String url="http://localhost:8080/examsys/login.thtml";
	@BeforeClass
	public static void gg() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}


