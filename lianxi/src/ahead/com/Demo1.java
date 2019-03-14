package ahead.com;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
   @Test
	public void openchrome(){
	   System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.baidu.com");
		driver.getTitle();//获取当前页面Title
		System.out.println(driver.getTitle());//打印标题
		driver.getCurrentUrl();//获取当前页面URL
		System.out.println(driver.getCurrentUrl());//打印网址
		driver.manage().window().maximize();//最大化
		 driver.get("https://www.sina.com");
		 driver.manage().window().maximize();//最大化
		 Dimension dimension = new Dimension(0, 0);
		 driver.manage().window().setSize(dimension);

   }
}
