package ahead.com;




import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class hanjiasan01 {
	WebDriver driver;
	
	@Before
	public void login(){
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://flight.qunar.com");
	}
	@Test
     public void buy() {
		WebElement dan=driver.findElement(By.id("js_lab_sng"));//定位单选框
		 System.out.println("是否被选择"+dan.isSelected());//单选按钮是否被选择，返回false、true
		 dan.click();
		 WebElement chu=driver.findElement(By.name("fromCity"));//定位出发城市输入框
	     chu.clear();//清空输入框
	     chu.sendKeys("赣州(KOW)");//输入数据
	    // driver.findElement(By.className("btn_search")).click();//定位按钮点击
		 WebElement mu=driver.findElement(By.name("toCity"));//定位到达城市输入框
         mu.sendKeys("南昌(KOW)");
         /*
         driver.findElement(By.className("btn_search")).click();//定位按钮点击
       
		 JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
         //remove readonly attribute
         removeAttribute.executeScript("var setDate=document.getElementById(\"fromDate\");setDate.removeAttribute('readonly');") ;
         WebElement  from_date=driver.findElement(By.name("fromDate"));//定位到达城市输入框
         from_date.click();
	 from_date.clear();*/
	 WebElement  ss=driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button"));//定位到达城市输入框
	 ss.click();
	}
	

	}
	
  
