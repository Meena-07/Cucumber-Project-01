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

public class StepDefinition extends BaseClass {

	ObjectManager manager;
	LoginPojo login;
	BookingPojo booking;
	ConfirmationPojo confirmation;
	PaymentPojo payment;
	OrderNoPojo orderNo;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

//		setWebApp();
		launchUrl("http://adactinhotelapp.com/HotelAppBuild2/");

	}

	@When("User enters the valid username {string} and password {string}")
	public void user_enters_the_valid_username_and_password(String username, String pass) {
		manager = ObjectManager.getInstance();
		login = manager.getLoginPojo();
		login.getLogin(username, pass);

	}

	@When("User selects the location {string},hotel {string}, room {string}, no of rooms{string} and enters checkin {string},checkout{string} and selects noofadults{string}, noofchildren{string}")
	public void user_selects_the_location_hotel_room_no_of_rooms_and_enters_checkin_checkout_and_selects_noofadults_noofchildren(
			String location, String hotel, String roomType, String numberOfRooms, String checkIn, String checkOut,
			String adult, String chdrn) {

		booking = manager.getBookingPojo();
		booking.getBooking(location, hotel, roomType, numberOfRooms, checkIn, checkOut, adult, chdrn);
	}

	@When("User clicks the radio button and proceeded with continue button")
	public void user_clicks_the_radio_button_and_proceeded_with_continue_button() {
		confirmation = manager.getConfirmationPojo();
		confirmation.getConfirmation();

	}

	@When("User enters firstname {string},lastname {string},address{string},creditcardno{string}, and selects creditcardtype{string}, month {string},year {string} and enters cvvnum {string}")
	public void user_enters_firstname_lastname_address_creditcardno_and_selects_creditcardtype_month_year_and_enters_cvvnum(
			String firstnm, String lastnm, String address, String ccn, String ctype, String mth, String year,
			String cvv) {

		payment = manager.getPaymentPojo();
		payment.getPayment(firstnm, lastnm, address, ccn, ctype, mth, year, cvv);

	}

	@Then("OrderNo should be generated")
	public void orderno_should_be_generated() throws InterruptedException {
		orderNo = manager.getOrderNoPojo();

		orderNo.getOrderId();

	}

}
