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
	@Test  //��¼
	public void Alogin() throws InterruptedException   {
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("hujianming");//�û���
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");//����
		WebElement leixing=driver.findElement(By.name("usertype"));//����
		Select a=new Select(leixing);
		a.selectByIndex(2);
		Thread.sleep(7000);

		
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();	//��¼
		
		//����ҳ��
		
		driver.switchTo().frame("menu");//��λ��ҳ��
		 driver.findElement(By.className("tmc_menu_qdb")).click();//���������ť
		 driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();//����������
		 driver.switchTo().parentFrame();//�˳�һ��ҳ��
		 driver.switchTo().frame("main");//��λ��ҳ��
		 driver.findElement(By.className("on")).click();//����������
		 driver.findElement(By.name("d_name")).sendKeys("Ӣ������");//�����������
		 WebElement zhuangtai1=driver.findElement(By.name("d_status"));//����
			Select zt1=new Select(zhuangtai1);
			zt1.selectByIndex(0);
		 driver.findElement(By.name("d_remark")).sendKeys("Ӣ�������ȫ");//�������˵��
		 driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();//����ύ��ť
		 driver.switchTo().parentFrame();//�˳�һ��ҳ��
		 Thread.sleep(3000);
		 //�����༶
		 driver.switchTo().frame("menu");//��λ��ҳ��
		 driver.findElement(By.className("tmc_menu_user")).click();//���ѧ������
		 driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();//����༶����
		 driver.switchTo().parentFrame();//�˳�һ��ҳ��
		 driver.switchTo().frame("main");//��λ��ҳ��
		 driver.findElement(By.className("on")).click();//��������༶
		 driver.findElement(By.name("b_name")).sendKeys("��һ����");//�����������
		 WebElement zhuangtai2=driver.findElement(By.name("b_status"));//״̬
			Select zt2=new Select(zhuangtai2);
			zt2.selectByIndex(0);
		 driver.findElement(By.name("b_remark")).sendKeys("��ˮ��ѧ");//������ע
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();//����ύ��ť
		 
	}
	//�˳�
	@AfterClass
	public void teardown() {
		//driver.quit();
	}
}