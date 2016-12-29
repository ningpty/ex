package com.wd.web.action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.wd.libarary.PageFactory;
//import org.openqa.selenium.support.PageFactory;

import com.wd.web.page.SubAccountManagePage;
import com.wd.libarary.ChangeWindow;

	public class SubAccountManage {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver){
		SubAccountManage.driver = driver;
	}
	
	static SubAccountManagePage subAccountManagePage;
	/**
	 * 进入子账号管理页面 SubAccountManagePage
	 * @return
	 * @throws Exception
	 */
	public static SubAccountManagePage intoSubAccountManagePage() throws Exception {
		subAccountManagePage = new SubAccountManagePage(getDriver());
		subAccountManagePage.clickSubaccountManagement();
		//Assert.assertTrue(subAccountManagePage.isCommodityManagement(), "into SubAccountManagePage failed");
		return (SubAccountManagePage) PageFactory.getPage(SubAccountManagePage.class, getDriver());
	}
	
	
	
}
