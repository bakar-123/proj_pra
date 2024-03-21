package com.prach_project.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.prach_project.testcases.Baseclass;

public class Findelement {
	
	
	/*
	to use this create object of this class and use with the reference variable
	
	example :   Findelement fe = new Findelement();
				fe.getWebElement(xpath,//input[@id='email_create'])
				
				if needs to get from interface
				
				fe.getWebElement(xpath, Loginpageelements.newemail1 )
				
				
	**********  ===========  BEST TO USE ****=============*******	
		
		*/
	
	
	public WebElement getWebElement(String identifiertype , String identifiervalue ) {

		switch(identifiertype) {

		case "Xpath" : return Baseclass.driver.findElement(By.xpath(identifiervalue));
		case "id": return Baseclass.driver.findElement(By.id(identifiervalue));
		case "NAME" : return Baseclass.driver.findElement(By.name(identifiervalue));
		case "TAGNAME": return Baseclass.driver.findElement(By.tagName(identifiervalue));
		case "CLAssname": return Baseclass.driver.findElement(By.className(identifiervalue));
		case "LinkText": return Baseclass.driver.findElement(By.linkText(identifiervalue));
		case "PratialLinkText": return Baseclass.driver.findElement(By.partialLinkText(identifiervalue));
		case "cssSelector": return Baseclass.driver.findElement(By.cssSelector(identifiervalue));

		default : return null;

		}

	}
	public List<WebElement> getWebElements(String identifiertype , String identifiervalue ) {

		switch(identifiertype) {

		case "Xpath" : return Baseclass.driver.findElements(By.xpath(identifiervalue));
		case "id": return Baseclass.driver.findElements(By.id(identifiervalue));
		case "NAME" : return Baseclass.driver.findElements(By.name(identifiervalue));
		case "TAGNAME": return Baseclass.driver.findElements(By.tagName(identifiervalue));
		case "CLAssname": return Baseclass.driver.findElements(By.className(identifiervalue));
		case "LinkText": return Baseclass.driver.findElements(By.linkText(identifiervalue));
		case "PratialLinkText": return Baseclass.driver.findElements(By.partialLinkText(identifiervalue));
		case "cssSelector": return Baseclass.driver.findElements(By.cssSelector(identifiervalue));

		default : return null;

		}


	}

}
