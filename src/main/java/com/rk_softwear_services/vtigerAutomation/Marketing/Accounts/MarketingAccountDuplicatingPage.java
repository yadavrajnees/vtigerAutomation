package com.rk_softwear_services.vtigerAutomation.Marketing.Accounts;

import com.rk_softwear_services.vtigerAutomation.Marketing.objectRepository.MarketingOR;
import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;

public class MarketingAccountDuplicatingPage extends MarketingOR{

	private WebUtil utl;
	public MarketingAccountDuplicatingPage(WebUtil wu) {
		super(wu);
		this.utl=wu;
	}
	public String filapCreatingNewAccountBasicInformationForm(String ranName) {

		String name=ranName;
		utl.myClear(accountNameTB);
		utl.sendKeys(accountNameTB, name);
		return name;
	}

	public void saveButton() {
		utl.click(saveBT);
	}
}
