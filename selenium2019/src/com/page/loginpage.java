package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class loginpage extends util{

	/**
	 *��¼ҳ�� 
	 */
	 //�û���������
	 public void username() {
		  driver.findElement(By.name("username")).sendKeys("hujianming");;
	 }
	 //����
	 public void pwd() {
		 driver.findElement(By.name("userpass")).sendKeys("hujianming123");;
	 }
	 public void lx() {
		 WebElement leixing=driver.findElement(By.name("usertype"));
		  Select a=new Select(leixing);
		  a.selectByIndex(2);
	 }
	 //��¼��ť
	 public void dlan() {
		 driver.findElement(By.className("tm_btn")).click();
	 }
}
