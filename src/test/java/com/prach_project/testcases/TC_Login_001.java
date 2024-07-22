package com.prach_project.testcases;

import org.testng.annotations.Test;

import com.prach_project.pageobject.Indexpage;
import com.prach_project.pageobject.Loginpage;
import com.prach_project.pageobject.Signinpage;
import com.prach_project.utilities.Datadriven;

public class TC_Login_001 extends Baseclass{
	
	/*
	 * valid username and valid password login
	 * invalid username and valid password login
	 * valid username and invalid password login
	 * invalid username and invalid password login
	 * 
	 */
	
	// i am adding this line to send this project to git hub practice, you can delete this line after your work
	
	// ====it is working fine with (dataProviderClass = Datadriven.class, dataProvider="data_from")
	@Test(dataProviderClass = Datadriven.class, dataProvider="ramchi2")
	public void loginForFirst4(String username , String password)  {
		
		Indexpage ip = new Indexpage(driver);
		ip.clickSignIn();
		Loginpage lp = new Loginpage(driver);
		lp.signInEmail(username);
		lp.signInPassword(password);
		lp.signInSubmit();
		Signinpage sp = new Signinpage(driver);
		sp.signInPageVerifyLaunch();
		ip.signOutBtn();
		
	}

}
