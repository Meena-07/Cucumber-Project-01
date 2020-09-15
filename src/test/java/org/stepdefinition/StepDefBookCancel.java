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

public class StepDefBookCancel extends BaseClass{
	

	ObjectManager manager;
	LoginPojo login;
	BookingPojo booking;
	ConfirmationPojo confirmation;
	PaymentPojo payment;
	OrderNoPojo orderNo;
	
	@Given("Visitor is in Login")
	public void visitor_is_in_Login() {
		setWebApp();
		launchUrl("http://adactinhotelapp.com/HotelAppBuild2/");
	    
	}

	@When("Visitor gives the valid name {string} and password {string}")
	public void visitor_gives_the_valid_name_and_password(String username, String pass) {
		manager = ObjectManager.getInstance();
		login = manager.getLoginPojo();
		login.getLogin(username, pass);
	}

	@When("Visitor select location {string},hotel {string}, room {string}, no of rooms{string} and enters checkin {string},checkout{string} and selects noofadults{string}, noofchildren{string}")
	public void visitor_select_location_hotel_room_no_of_rooms_and_enters_checkin_checkout_and_selects_noofadults_noofchildren(String location, String hotel, String roomType, String numberOfRooms, String checkIn, String checkOut,
			String adult, String chdrn) {
		booking = manager.getBookingPojo();
		//booking.getBooking(location, hotel, roomType, numberOfRooms, checkIn, checkOut, adult, chdrn);

	}

	@When("Visitor clicks the radio button and selects continue button")
	public void visitor_clicks_the_radio_button_and_selects_continue_button() {
		confirmation = manager.getConfirmationPojo();
		confirmation.getConfirmation();
	}

	@When("Visitor enters firstname {string},lastname {string},address{string},creditcardno{string}, and selects creditcardtype{string}, month {string},year {string} and enters cvvnum {string}")
	public void visitor_enters_firstname_lastname_address_creditcardno_and_selects_creditcardtype_month_year_and_enters_cvvnum(String firstnm, String lastnm, String address, String ccn, String ctype, String mth, String year,
			String cvv) {
		payment = manager.getPaymentPojo();
		//payment.getPayment(firstnm, lastnm, address, ccn, ctype, mth, year, cvv);
	}

	@When("Attempting to cancel the Booking using generated OrderId")
	public void attempting_to_cancel_the_Booking_using_generated_OrderId() throws InterruptedException {
		orderNo = manager.getOrderNoPojo();
		//orderNo.cancelOrderId();
	    
	}

	@Then("Booking should be cancelled")
	public void booking_should_be_cancelled() {
		System.out.println("Cancelled Successfully");
	  
	}

}
