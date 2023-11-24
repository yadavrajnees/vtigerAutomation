package com.rk_softwear_services.vtigerAutomation.Marketing.Accounts;


import com.rk_softwear_services.vtigerAutomation.Marketing.objectRepository.MarketingOR;
import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;

public class MarketingAccountLeandingPage extends MarketingOR{
	private WebUtil utl;
	public MarketingAccountLeandingPage(WebUtil wu) {
		super(wu);
		this.utl=wu;
	}

	public void createNewAccountPlusButton() {
		utl.click(createAccountBT);
	}
	
	public void innerTextOfSearchedElement(String searchName,String SearchTypeAttributValue) {
		utl.sendKeys(getSearchForNameTB(), searchName);
		utl.sendKeys(getAccountNoDD(), SearchTypeAttributValue);
		
	}
	
}
