package cometestcase;


import org.testng.annotations.Test;

import com.util.util;
import com.yewu.loginyewu;

public class logintestcase extends util{

	@Test
	public void login() throws InterruptedException {
		loginyewu yewu=new loginyewu();
		yewu.openurl();
		yewu.login();
	}
}
