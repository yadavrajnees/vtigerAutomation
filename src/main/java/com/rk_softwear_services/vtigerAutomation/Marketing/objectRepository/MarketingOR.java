package com.rk_softwear_services.vtigerAutomation.Marketing.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;

import lombok.Getter;
@Getter
public class MarketingOR {
	
	public MarketingOR(WebUtil wt) {
		PageFactory.initElements(wt.getDriver(), this);
	}

	//*-----------Accounts Locators-----------*//
	@FindBy(xpath="//img[@title='Create Account...']")
	protected WebElement createAccountBT;
	
	@FindBy(xpath="//input[@name='accountname']")
	protected WebElement accountNameTB;
	
	@FindBy(xpath="//input[@name='account_no']")
	protected WebElement accountNoTB;
	
	@FindBy(xpath="//input[@name='website']")
	protected WebElement webSiteTB;
	
	@FindBy(xpath="//input[@name='phone']")
	protected WebElement phoneTB;
	
	@FindBy(xpath="//input[@name='tickersymbol']")
	protected WebElement tickerSymbolTB;
	
	@FindBy(xpath="//input[@name='fax']")
	protected WebElement faxTB;
	
	@FindBy(xpath="//input[@name='email1']")
	protected WebElement emailTB;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	protected WebElement billingAddressTB;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	protected WebElement shippingAddressTB;
	
	@FindBy(xpath="//input[@name='bill_pobox']")
	protected WebElement billingPoBoxTB;
	
	@FindBy(xpath="//input[@name='ship_pobox']")
	protected WebElement shippingPoBoxTB;
	
	@FindBy(xpath="//input[@name='bill_city']")
	protected WebElement billingCityTB;
	
	@FindBy(xpath="//input[@name='ship_city']")
	protected WebElement shippingCityTB;
	
	@FindBy(xpath="//input[@name='bill_state']")
	protected WebElement billingStateTB;
	
	@FindBy(xpath="//input[@name='ship_state']")
	protected WebElement shippingStateTB;
	
	@FindBy(xpath="//input[@name='bill_code']")
	protected WebElement billingPostalCodeTB;
	
	@FindBy(xpath="//input[@name='ship_code']")
	protected WebElement shippingPostalCodeTB;
	
	@FindBy(xpath="//input[@name='bill_country']")
	protected WebElement billingCountryTB;
	
	@FindBy(xpath="//input[@name='ship_country']")
	protected WebElement shippingCountryTB;
	
	@FindBy(xpath="//textarea[@name='description']")
	protected WebElement descriptionTB;
	
	@FindBy(xpath="//input[@name='search_text']")
	protected WebElement searchForNameTB;
	
	@FindBy(xpath="//select[@id='bas_searchfield']")
	protected WebElement accountNoDD;
	
	
	
	//button
	@FindBy(xpath="//input[@class='crmbutton small save']")
	protected WebElement saveBT;
	
	@FindBy(xpath="//input[@name='Edit']")
	protected WebElement editBT;
	
	@FindBy(xpath="//input[@name='Duplicate']")
	protected WebElement duplicateBT;
	
	@FindBy(xpath="//input[@name='Delete']")
	protected WebElement deleteBT;
}
