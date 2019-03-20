package cometestcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.loginyewu;
import com.yewu.xztkyewu;

public class addtestcase extends util{
	@Test
	public void xztk() throws InterruptedException {
		loginyewu login=new loginyewu();
		
		xztkyewu  add=new xztkyewu();
		
		login.openurl();
		login.login();
		Thread.sleep(2000);
		add.xztk();
		
		
	}

}
