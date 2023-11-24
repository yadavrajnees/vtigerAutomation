package com.rk_softwear_services.vtigerAutomation.common.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;

import lombok.Getter;
@Getter
public class CommonOR {
	
	public CommonOR(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
	}
	//*-----------Login Locators-----------*//
	@FindBy(xpath="//input[@name='user_name']")
	protected WebElement userNameTB;
	
	@FindBy(xpath="//input[@name='user_password']")
	protected WebElement userPasswordTB;
	
	@FindBy(xpath="//select[@name='login_theme']")
	protected WebElement colorThemeDD;
	
	@FindBy(xpath="//select[@name='login_language']")
	protected WebElement languageDD;
	
	@FindBy(xpath="//input[@name='Login']")
	protected WebElement signInBT;
	
	//*----------Logout Locator----------*//
	@FindBy(xpath="//a[text()='Sign Out']")
	protected WebElement logoutBT;
	
	//*----------Marketing Locators----------*//
	@FindBy(xpath="//a[text()='Marketing']")
	protected WebElement marketingLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Campaigns']")
	protected WebElement marketingCampaignsLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Accounts']")
	protected WebElement marketingAccountsLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Contacts']")
	protected WebElement marketingContactsLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Webmail']")
	protected WebElement marketingWebmailLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Leads']")
	protected WebElement marketingLeadsLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Calendar']")
	protected WebElement marketingCalendarLK;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Documents']")
	protected WebElement marketingDocumentsLK;
	
	
}
