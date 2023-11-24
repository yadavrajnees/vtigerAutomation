package com.rk_softwear_services.vtigerAutomation.Marketing.Accounts;

import com.rk_softwear_services.vtigerAutomation.Marketing.objectRepository.MarketingOR;
import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;

public class MarketingAccountInformationPage extends MarketingOR{

	private WebUtil utl;
	public MarketingAccountInformationPage(WebUtil wu) {
		super(wu);
		this.utl=wu;
	}
	public void clickEditButton() {
		utl.click(getEditBT());
	}

	public void clickDuplicateButton() {
		utl.click(getDuplicateBT());
	}
	
	public void clickDeleteButton() {
		utl.click(getDeleteBT());
	}
}
