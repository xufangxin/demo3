package com.page;

import com.util.util;

public class basepage extends util{
//��ת����߿��
	public void tzzb() {
		driver.switchTo().frame("menu");
	}
	
	//��ת���������
	public void tzc() {
		driver.switchTo().defaultContent();
	}
//��ת���ұ߿��
	public void tzyb() {
		driver.switchTo().frame("main");
	}
}
