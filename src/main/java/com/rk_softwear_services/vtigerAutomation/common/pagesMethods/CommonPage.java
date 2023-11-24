package com.rk_softwear_services.vtigerAutomation.common.pagesMethods;

import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;
import com.rk_softwear_services.vtigerAutomation.common.objectRepository.CommonOR;

public class CommonPage extends CommonOR{
	private WebUtil utl;
	public CommonPage(WebUtil wu) {
		super(wu);
		this.utl=wu;
	}

	

	public void login(String userName,String userPassword) {
		utl.printMessage("===Login is Started===");
		utl.sendKeys(getUserNameTB(), userName);
		utl.sendKeys(getUserPasswordTB(), userPassword);
		utl.sendKeys(getColorThemeDD(), "bluelagoon");
		utl.sendKeys(getLanguageDD(), "US English");
		utl.click(getSignInBT());
	}
	
	public void logout() {
		utl.click(getLogoutBT());
	}
	
	public void goToMarketingAccountLink() {
		utl.mouseMoveToElement(getMarketingLK());
		utl.click(getMarketingAccountsLK());
	}
	
	
	
	
	
}
