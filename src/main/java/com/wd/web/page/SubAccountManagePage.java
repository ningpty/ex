package com.wd.web.page;
import com.wd.libarary.BasePage;

import com.wd.libarary.Locator;
import com.wd.libarary.Locator.ByType;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SubAccountManagePage extends BasePage {
	
	public SubAccountManagePage(WebDriver driver) throws Exception{
		super(driver);	
	}
	
	//页面左侧子账号管理按钮
	Locator subaccountManagement = new Locator("a[data-for-gaq='子账号管理']",ByType.cssSelector);
	//新建子账号按钮
	Locator addsubaccount = new Locator("a[data-for-gaq='新建子账号']",ByType.cssSelector);
	//主账号分流设置按钮
	Locator setmainaccount = new Locator("a[data-for-gaq='主账号分流设置']",ByType.cssSelector);
	//聊天记录按钮（不是唯一确定，是一群）
	Locator chatnote = new Locator("a[data-for-gaq='子账号-聊天记录']",ByType.cssSelector);
			
	//编辑按钮（第一个子账号后面的编辑）
	Locator edit = new Locator("a[data-for-gaq='子账号-编辑']",ByType.cssSelector);
	
	//编辑子账号页面修改密码按钮
	Locator editpassward = new Locator("a[class='btn btn-default']",ByType.cssSelector);
	//或者根据css id 定位
	//Locator editpassward = new Locator("#btnEditPwd",ByType.cssSelector);
	
	//修改子账号密码原密码输入框
	Locator oldpassward = new Locator("input[name='accountnewpwd']",ByType.cssSelector);
	
	//修改子账号密码新密码输入框
	Locator newpassward = new Locator("input[name='accountnewrepwd']",ByType.cssSelector);
	
	//修改子账号完成按钮
	Locator over = new Locator("button[type='submit']",ByType.cssSelector);
	
	// 第一个子账号停用按钮  span class="switch-style switch-2 for_gaq_live" 
	Locator disable = new Locator("span[onfirm='off']",ByType.cssSelector);
	
	//第一个子账号启用按钮 
	Locator enable = new Locator("span[confirm='on']",ByType.cssSelector);
	
	
	
	//停启用子账号取消按钮
	Locator cancel =new Locator("btnCancel");
	//停启用子账号确定按钮
	Locator sure =new Locator("btnConfirm");
	
	
	
	
	
					
	//添加子账号页面		
	//头像按钮
	Locator addPicture = new Locator("//*[@id='accountField']/figure/div/div[2]]",ByType.cssSelector);
	//完成并继续添加按钮
	Locator finishandgoon = new Locator("button[data-for-gaq='子账号新建-完成-添加']",ByType.cssSelector);
	//完成按钮
	//Locator finish = new Locator("button[data-for-gaq='子账号新建-完成']",ByType.cssSelector);
	//取消按钮
	//Locator cancel = new Locator("//*[@id='btnGroup']/button[1]",ByType.cssSelector);		
	//子账户ID输入框
	Locator subid = new Locator("//*[@id='formField']/div[1]/div/div/input",ByType.cssSelector);
			
	//子账户昵称输入框
	Locator subname = new Locator("//*[@id='formField']/div[2]/div/input",ByType.cssSelector);		
					
	//密码输入框
	Locator password = new Locator("//*[@id='formField']/div[3]/div/input",ByType.cssSelector);	
	//确认密码输入框
	Locator pwconfirm = new Locator("//*[@id='formField']/div[4]/div/input",ByType.cssSelector);
	
	//进入子账号管理页面
	public void enterSubAccountManagePage() throws Exception{
		click(subaccountManagement);
	}
	
	//点击左侧子账号管理
	public void clickSubaccountManagement() throws Exception {
		click(subaccountManagement);
	}
	//点击子账号后编辑按钮
	public void clickSubAccoutEdit() throws Exception{
		click(edit);
	}
	//点击子账号编辑页面修改密码按钮
	public void clickSubaccounthangePwd() throws Exception{
		click(editpassward);	
	}
	//子账号新密码输入框输入密码
	public void InputNewPwd (String pwd) throws Exception{
		type(oldpassward,pwd);
	}
	//子账号新密码吗确认输入框输入密码
	public void InputOldPwd (String npwd) throws Exception{
		type(newpassward,npwd);
	}
	//修改子账号密码页面点击完成按钮
	public void OverChange() throws Exception{
		click(over);
	}
	//点击“停用”按钮
	public void ClickDisable() throws Exception{
		click(disable);
	}
	//停用子账号点击“确定”
	public void ClickSure() throws Exception{
		click(sure);
	}
	//停用子账号点击“取消”
	public void ClickCancel() throws Exception{
		click(cancel);
	}
	//获取当前访问地址
		public String GetUrl() throws Exception{
			return getUrl();
		}
}

					

