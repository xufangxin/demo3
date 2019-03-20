package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class xzbjpage extends util{
	//学生管理
	public void xsgl(){
		driver.findElement(By.className("tmc_menu_user")).click();//点击学生管理
	}
	//班级管理
	public void bjgl() {
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();//点击班级管理
	}
	//新增班级
	public void xzbj() {
		driver.findElement(By.className("on")).click();//点击新增班级
	}
	//机构名称
	public void jgmc() {
		driver.findElement(By.name("b_name")).sendKeys("高一三班");//输入机构名称
	}
	//状态
	public void zt() {
		 WebElement zhuangtai=driver.findElement(By.name("b_status"));//状态
			Select zt2=new Select(zhuangtai);
			zt2.selectByIndex(0);
	}
	//机构备注
	public void jgbz() throws InterruptedException {
		 driver.findElement(By.name("b_remark")).sendKeys("衡水中学");//机构备注
		 Thread.sleep(2000);
	}
	
	//提交按钮
	public void tj() {
		driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();//点击提交按钮
	}
}