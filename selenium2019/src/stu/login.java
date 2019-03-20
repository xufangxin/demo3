package stu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	public static WebDriver driver;
	public static String url="http://localhost:8080/examsys/login.thtml";
	@BeforeClass
	public void openfirefox() throws MalformedURLException{
		//System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		// driver=new ChromeDriver();
		DesiredCapabilities c=DesiredCapabilities.chrome();
		 driver=new RemoteWebDriver(new URL("http://192.168.45.1:5555/wd/hub"),c);
		//DesiredCapabilities c=DesiredCapabilities.chrome();
		//WebDriver driver=new RemoteWebDriver(new URL("http://192.168.45.1:5555/wb/hub"),c);
	}
	@Test  //登录
	public void Alogin() throws InterruptedException   {
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("hujianming");//用户名
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//密码
		WebElement leixing=driver.findElement(By.name("usertype"));//类型
		Select a=new Select(leixing);
		a.selectByIndex(2);
		Thread.sleep(7000);

		
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();	//登录
		
		//进入页面
		
		driver.switchTo().frame("menu");//定位左页面
		 driver.findElement(By.className("tmc_menu_qdb")).click();//点击题库管理按钮
		 driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();//点击新增题库
		 driver.switchTo().parentFrame();//退出一层页面
		 driver.switchTo().frame("main");//定位右页面
		 driver.findElement(By.className("on")).click();//点击新增题库
		 driver.findElement(By.name("d_name")).sendKeys("英语试题");//输入题库名称
		 WebElement zhuangtai1=driver.findElement(By.name("d_status"));//类型
			Select zt1=new Select(zhuangtai1);
			zt1.selectByIndex(0);
		 driver.findElement(By.name("d_remark")).sendKeys("英语试题大全");//输入题库说明
		 driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();//点击提交按钮
		 driver.switchTo().parentFrame();//退出一层页面
		 Thread.sleep(3000);
		 //新增班级
		 driver.switchTo().frame("menu");//定位左页面
		 driver.findElement(By.className("tmc_menu_user")).click();//点击学生管理
		 driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();//点击班级管理
		 driver.switchTo().parentFrame();//退出一层页面
		 driver.switchTo().frame("main");//定位右页面
		 driver.findElement(By.className("on")).click();//点击新增班级
		 driver.findElement(By.name("b_name")).sendKeys("高一三班");//输入机构名称
		 WebElement zhuangtai2=driver.findElement(By.name("b_status"));//状态
			Select zt2=new Select(zhuangtai2);
			zt2.selectByIndex(0);
		 driver.findElement(By.name("b_remark")).sendKeys("衡水中学");//机构备注
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();//点击提交按钮
		 
	}
	//退出
	@AfterClass
	public void teardown() {
		//driver.quit();
	}
}