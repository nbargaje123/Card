package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.Base.TestBase;

public class CommonFunctions extends TestBase {
	
	
	public void click(By locator) throws InterruptedException
	{
		
		dr.findElement(locator).click();
		dr.wait(2000);
		
	}

	
	
	public static String getdate()
	
	{
		SimpleDateFormat formater = new SimpleDateFormat("ddMMyy_hh_mm");
		Date date = new Date();
		String formatedate = formater.format(date);
		return formatedate;
		
		
	}
}
