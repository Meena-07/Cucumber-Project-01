package org.objectrepository;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driv, this);
	}

	@FindBys({

			@FindBy(xpath = "//input[@id='username']"), @FindBy(xpath = "//input[@name='username']") })
	private WebElement txtName;

	@FindAll({ @FindBy(id = "password"), @FindBy(className = "login_input")

	})
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void getLogin(String username, String pass) {
		fill(getTxtName(), username);
		fill(getTxtPassword(), pass);
		buttonClick(getBtnLogin());
	}

}