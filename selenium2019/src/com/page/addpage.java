package com.page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class addpage extends util{

	//点击题库管理
	public void tkgl() {
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
	}
	//点击：新增题库菜单
	public void xztk() {
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}
	
	//输入题库名称
	public void tkmc(String a) {
		driver.findElement(By.name("d_name")).sendKeys(a);
	}
	//点击提交按钮
	public void bt() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}
