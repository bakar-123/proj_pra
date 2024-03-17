package com.prach_project.testcases;

import org.testng.annotations.Test;

import com.prach_project.pageobject.Addtocart;
import com.prach_project.pageobject.Eveningdressespage;
import com.prach_project.pageobject.Indexpage;
import com.prach_project.pageobject.Loginpage;
import com.prach_project.pageobject.Printeddresspage;
import com.prach_project.pageobject.Signinpage;
import com.prach_project.pageobject.Womenpage;
import com.prach_project.utilities.Datadriven;

public class TC_women_001 extends Baseclass {
	@Test(dataProviderClass=Datadriven.class, dataProvider="data from ramchi2")
	public void verifyWomenProductIsSelecting(String usernameisthis , String Passwordisthis) {
		
		
		Indexpage ip = new Indexpage(driver);
		ip.clickSignIn();
		Loginpage lp = new Loginpage(driver);
		lp.loginPageVerifyLaunch();
//		lp.signInEmail("qwer@gmail.com");
//		lp.signInPassword("rambo");
		lp.signInEmail(usernameisthis);
		lp.signInPassword(Passwordisthis);
		lp.signInSubmit();
		Signinpage sp = new Signinpage(driver);
		sp.signInPageVerifyLaunch();
		
		
		
		
		
		
//		
//		Womenpage wp = new Womenpage(driver);
////		wp.womenPageVerifyLaunch();  // we should not verify this, because we are not clicking it ..... we just hovering in this test case
//		wp.selectTheEveningDresses();
//		Eveningdressespage ed = new Eveningdressespage(driver);
//		ed.eveningDressesPageVerifyLaunch();
//		ed.selectEveningDressProduct();
//		Printeddresspage pd = new Printeddresspage(driver);
//		pd.printedDressesPageVerifyLaunch();
//		pd.printedDressAvalibilityAndSelect();
//		pd.addToCart();
//		Addtocart atc = new Addtocart(driver);
////		atc.addToCartPopUp();
//		atc.proccedToCheckOut();    // this is working fine
//		
		
	}
	

}
