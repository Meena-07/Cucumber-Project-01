package org.objectrepository;

import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNoPojo extends BaseClass {
	public OrderNoPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driv, this);
	}

	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement generatedOrderNum;
	@FindBy(name = "search_hotel")
	private WebElement btnSearchHotel;
	@FindBy(id = "search_hotel_id")
	private WebElement btngo;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;
	

	@FindBy(id = "my_itinerary")
	private WebElement btnMyItinerary;
	@FindBy(id = "order_id_text")
	private WebElement orderidText;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement btnCancel;
	@FindBy(id = "logout")
	private WebElement btnLogout;
	@FindBy(xpath = "//label[@id='search_result_error']")
	private WebElement acknowledgemsg;
	
	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getBtnGo() {
		return btngo;
	}

	public WebElement getAcknowledgemsg() {
		return acknowledgemsg;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getGeneratedOrderNum() {
		return generatedOrderNum;
	}

	public WebElement getBtnSearchHotel() {
		return btnSearchHotel;
	}

	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}

	public WebElement getOrderidText() {
		return orderidText;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
	
	public void getOrderId() throws InterruptedException
	{	 
		Thread.sleep(6000);
		String orderNum = getGeneratedOrderNum().getAttribute("value");
		System.out.println("Order No" + orderNum);
	}
	
	
	
//	public void cancel(String orderId)
//	{
//		buttonClick(getBookedItinerary());
//		fill(getOrderidText(),orderId);
//		buttonClick(btngo);
//		buttonClick(getBtnCancel());
//		Alert al = driv.switchTo().alert();
//		al.accept();
//		System.out.println(acknowledgemsg.getText());
//		System.out.println(getAcknowledgemsg().getText());
//		
//	}

//	public void cancelOrderId() throws InterruptedException {
//		Thread.sleep(6000);
//		String orderNum = getGeneratedOrderNum().getAttribute("value");
//		System.out.println("Order No" + orderNum);
//		buttonClick(getBtnMyItinerary());
//		fill(getOrderidText(), orderNum);
//		buttonClick(btngo);
//		buttonClick(getBtnCancel());
//		Alert al = driv.switchTo().alert();
//		al.accept();
//		System.out.println(acknowledgemsg.getText());
//
//	}
	
	

}
