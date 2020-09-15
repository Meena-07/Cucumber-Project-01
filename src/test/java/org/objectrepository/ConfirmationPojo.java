package org.objectrepository;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPojo extends BaseClass {
	public ConfirmationPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driv, this);
	}

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioBtn;
	@FindBy(id = "continue")
	private WebElement btnContinue;
	@FindBy(id = "cancel")
	private WebElement btnCancel;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public void getConfirmation()
	{
		buttonClick(getRadioBtn());
		buttonClick(getBtnContinue());
	}

}
