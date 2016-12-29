package com.wd.web.page;


import org.openqa.selenium.WebDriver;

import com.wd.libarary.BasePage;
import com.wd.libarary.Locator;
import com.wd.libarary.Locator.ByType;

public class LimitedSalePage  extends BasePage{

	public LimitedSalePage(WebDriver driver) throws Exception {
		super(driver);
		
	}
	
	//左侧的限时折扣按钮
	Locator Limtdsale = new Locator("a[data-for-gaq='限时折扣']",ByType.cssSelector);
	//
	
	
	//点击左侧的限时折扣按钮
	public void clickLimtdsale() throws Exception{
		click(Limtdsale);
	}

}
