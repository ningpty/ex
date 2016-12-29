package com.wd.web.action;
import org.openqa.selenium.WebDriver;

import com.wd.libarary.PageFactory;
import com.wd.web.page.LimitedSalePage;

public class LimitedSale {
	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		return driver;
	}
	public static void setDriver(WebDriver driver){
		LimitedSale.driver = driver;
	}

	static LimitedSalePage limitedSalePage;
	
	
	
	public static LimitedSalePage intoLimitedSalePage() throws Exception {
		limitedSalePage = new LimitedSalePage(getDriver());
		limitedSalePage.clickLimtdsale();
		//Assert.assertTrue(LimitedSalePage.isCommodityManagement(), "into LimitedSalePage failed");
		return (LimitedSalePage) PageFactory.getPage(LimitedSalePage.class, getDriver());
	}
}
