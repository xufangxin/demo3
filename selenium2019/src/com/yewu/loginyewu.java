package com.yewu;

import com.page.loginpage;
import com.util.util;

public class loginyewu extends util{
    //打开网止
	public void openurl() {
		driver.get(url);
	}
	
	public void login() throws InterruptedException {
	//声明页面元素类的变量
	loginpage page=new loginpage();
	
	//登陆的操作
	page.username();
	page.pwd();
	page.lx();
	Thread.sleep(5000);
	page.dlan();
	}
}
