package cometestcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.loginyewu;
import com.yewu.xzbjyewu;


public class xzbjtestcase extends util{
	@Test
	public void xinzengbanji() throws InterruptedException {
		
		loginyewu login=new loginyewu();
		xzbjyewu xzbjyw=new xzbjyewu();
		
		login.openurl();
		login.login();
		Thread.sleep(2000);
		xzbjyw.xzbj();

}
}