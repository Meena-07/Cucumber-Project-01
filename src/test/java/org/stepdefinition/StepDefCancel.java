package org.stepdefinition;

import org.base.BaseClass;
import org.objectrepository.BookingPojo;
import org.objectrepository.ConfirmationPojo;
import org.objectrepository.LoginPojo;
import org.objectrepository.OrderNoPojo;
import org.objectrepository.PaymentPojo;
import org.projectobjectmanager.ObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCancel extends BaseClass {

	ObjectManager manager;
	LoginPojo login;
	BookingPojo booking;
	ConfirmationPojo confirmation;
	PaymentPojo payment;
	OrderNoPojo orderNo;
	
	@Given("you are in login page")
	public void you_are_in_login_page() {
		
		setWebApp();
		launchUrl("http://adactinhotelapp.com/HotelAppBuild2/");
	    
	 
	}

	@When("you enters username {string},Password {string} and click login")
	public void you_enters_username_Password_and_click_login(String string, String string2) {
		manager = ObjectManager.getInstance();
		login = manager.getLoginPojo();
		login.getLogin(string, string2);
	}

	@When("you click bookIternary, enters orderid {string} and proceeded with cancellation of orderid")
	public void you_click_bookIternary_enters_orderid_and_proceeded_with_cancellation_of_orderid(String orderId) {
	  orderNo = manager.getOrderNoPojo();
	 // orderNo.cancel(orderId);
		
	}

	@Then("you should cancelled booking")
	public void you_should_cancelled_booking() {
		System.out.println("Cancelled Booking");
	   
	}

}
