package org.objectrepository;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;

public class PaymentPojo extends BaseClass 

{
	
	public PaymentPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driv, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(name = "cc_num")
	private WebElement txtCreditDummyNum;
	@FindBy(id = "cc_type")
	private WebElement selectCreditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement selectExpMnth;
	@FindBy(id = "cc_exp_year")
	private WebElement selectExpYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNum;
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	@FindBy(id = "cancel")
	private WebElement btnCancel;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditDummyNum() {
		return txtCreditDummyNum;
	}

	public WebElement getSelectCreditCardType() {
		return selectCreditCardType;
	}

	public WebElement getSelectExpMnth() {
		return selectExpMnth;
	}

	public WebElement getSelectExpYear() {
		return selectExpYear;
	}

	public WebElement getTxtCvvNum() {
		return txtCvvNum;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void getPayment(String firstnm, String lastnm, String address, String ccn,String ctype, String mth, String year,String cvv)
	
	{
		fill(getTxtFirstName(), firstnm);

		fill(getTxtLastName(), lastnm);
		fill(getTxtAddress(), address);
		fill(getTxtCreditDummyNum(), ccn);
	
//		 List<Map<String, String>> m = datas.asMaps(String.class,String.class);
//		String ctype  = m.get(1).get("creditCardType");
		selByVisTxt(getSelectCreditCardType(), ctype);
		selByVisTxt(getSelectExpMnth(), mth);
		selByVisTxt(getSelectExpYear(), year);
		fill(getTxtCvvNum(), cvv);
		buttonClick(getBtnBookNow());
	}

}