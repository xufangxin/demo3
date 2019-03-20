package com.page;

import com.util.util;

public class basepage extends util{
//跳转到左边框架
	public void tzzb() {
		driver.switchTo().frame("menu");
	}
	
	//跳转至最外层框架
	public void tzc() {
		driver.switchTo().defaultContent();
	}
//跳转至右边框架
	public void tzyb() {
		driver.switchTo().frame("main");
	}
}
