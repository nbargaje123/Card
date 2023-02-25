package com.funtions.Repository;

import com.Objects.Repository.LoginPageObjets;

import Utility.CommonFunctions;


public class LoginPgaeFunctions extends LoginPageObjets {

	CommonFunctions objcommonfunction = new CommonFunctions();
	
	public void logintogoogle() throws InterruptedException
	
	{
		
		dr.findElement(input_Search).sendKeys("abc");
		objcommonfunction.click(input_Search);
		
	}
	
}
