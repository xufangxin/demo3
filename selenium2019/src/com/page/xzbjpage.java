package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class xzbjpage extends util{
	//ѧ������
	public void xsgl(){
		driver.findElement(By.className("tmc_menu_user")).click();//���ѧ������
	}
	//�༶����
	public void bjgl() {
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();//����༶����
	}
	//�����༶
	public void xzbj() {
		driver.findElement(By.className("on")).click();//��������༶
	}
	//��������
	public void jgmc() {
		driver.findElement(By.name("b_name")).sendKeys("��һ����");//�����������
	}
	//״̬
	public void zt() {
		 WebElement zhuangtai=driver.findElement(By.name("b_status"));//״̬
			Select zt2=new Select(zhuangtai);
			zt2.selectByIndex(0);
	}
	//������ע
	public void jgbz() throws InterruptedException {
		 driver.findElement(By.name("b_remark")).sendKeys("��ˮ��ѧ");//������ע
		 Thread.sleep(2000);
	}
	
	//�ύ��ť
	public void tj() {
		driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();//����ύ��ť
	}
}