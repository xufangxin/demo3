package com.yewu;

import com.page.loginpage;
import com.util.util;

public class loginyewu extends util{
    //����ֹ
	public void openurl() {
		driver.get(url);
	}
	
	public void login() throws InterruptedException {
	//����ҳ��Ԫ����ı���
	loginpage page=new loginpage();
	
	//��½�Ĳ���
	page.username();
	page.pwd();
	page.lx();
	Thread.sleep(5000);
	page.dlan();
	}
}
