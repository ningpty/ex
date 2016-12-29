package com.wd.web.tests;

import com.wd.web.action.ViewHomePage;
import com.wd.web.action.CommodityManagementAction;
import com.wd.web.action.SubAccountManage;
import com.wd.libarary.DriverFactory;
import com.wd.libarary.PageFactory;
import com.wd.libarary.TestNGListener;
import com.wd.libarary.UITest;
import com.wd.web.page.CommodityManagementPage;
import com.wd.web.page.SubAccountManagePage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ TestNGListener.class })

public class SubAccountManagementTest extends UITest{
	
	/**
	 * 验证修改子账号密码成功
	 */
	@Test()
	public void editSubaccountpasswardsucess() throws Exception{
		Thread.sleep(2000);
		SubAccountManagePage subAccountManagePage = SubAccountManage.intoSubAccountManagePage();
		Thread.sleep(3000);
		subAccountManagePage.clickSubAccoutEdit();
		subAccountManagePage.clickSubaccounthangePwd();
		Thread.sleep(3000);
		subAccountManagePage.InputNewPwd("123456");
		subAccountManagePage.InputOldPwd("123456");
		subAccountManagePage.OverChange();
		Thread.sleep(3000);
		Assert.assertEquals(subAccountManagePage.GetUrl(),"https://d.weidian.com/subaccount_mgt.php#/list");
	}
	/**
	 *验证修改子账号密码失败
	 */
	@Test()
	public void editSubaccountpasswardfail() throws Exception{
		Thread.sleep(2000);
		SubAccountManagePage subAccountManagePage = SubAccountManage.intoSubAccountManagePage();
		Thread.sleep(3000);
		subAccountManagePage.clickSubAccoutEdit();
		subAccountManagePage.clickSubaccounthangePwd();
		Thread.sleep(3000);
		subAccountManagePage.InputNewPwd("123456");
		subAccountManagePage.InputOldPwd("123457");
		subAccountManagePage.OverChange();
		Thread.sleep(3000);
		Assert.assertNotEquals(subAccountManagePage.GetUrl(),"https://d.weidian.com/subaccount_mgt.php#/list");
	}
	/**
	 *  验证子账号停用
	 */
	@Test()
	public void subAccountDisable() throws Exception{
		Thread.sleep(2000);
		SubAccountManagePage subAccountManagePage = SubAccountManage.intoSubAccountManagePage();
		Thread.sleep(2000);
		subAccountManagePage.ClickDisable();
		Thread.sleep(2000);
		subAccountManagePage.ClickSure();
	}
	/**
	 * 验证子账号启用
	 */
	@Test()
	public void subAccountEnable() throws Exception{
		Thread.sleep(3000);
	}
	/**
	 * 验证子行号停用取消
	 */
	@Test()
	public void subAccountDisableCancel() throws Exception{
		Thread.sleep(3000);
	}
	
	/**
	 * 验证子账号启用取消
	 */
	@Test()
	public void subAccounEnaableCancel() throws Exception{
		Thread.sleep(3000);
	}
	
	
	
	
	
}
