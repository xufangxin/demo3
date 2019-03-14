package no1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {

	@Test 
	public void openchrome() {
		System.setProperty("webdriver.chrome.driver",".//tools//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get("urll");
		String a=driver.getCurrentUrl();
		System.out.println(a);
		String b=driver.getCurrentUrl();
		System.out.println(b);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
