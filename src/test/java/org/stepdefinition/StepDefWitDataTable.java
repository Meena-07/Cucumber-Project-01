//package org.stepdefinition;
//
//import org.base.BaseClass;
//import org.objectrepository.BookingPojo;
//import org.objectrepository.ConfirmationPojo;
//import org.objectrepository.LoginPojo;
//import org.objectrepository.OrderNoPojo;
//import org.objectrepository.PaymentPojo;
//import org.projectobjectmanager.ObjectManager;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.cucumber.datatable.DataTable;
//
//public class StepDefWitDataTable extends BaseClass {
//	ObjectManager manager;
//	LoginPojo login;
//	BookingPojo booking;
//	ConfirmationPojo confirmation;
//	PaymentPojo payment;
//	OrderNoPojo orderNo;
//
//	@Given("User is on the login page")
//	public void user_is_on_the_login_page() {
//		setWebApp();
//		launchUrl("http://adactinhotelapp.com/HotelAppBuild2/");
//
//	}
//
//	@When("User enters the valid username {string} and password {string}")
//	public void user_enters_the_valid_username_and_password(String user, String pass) {
//		manager = ObjectManager.getInstance();
//		login = manager.getLoginPojo();
//		login.getLogin(user, pass);
//
//	}
//
//	@When("User selects the location {string},hotel {string}, room {string}, and enters checkin {string},checkout{string} and selects noofadults, noofchildren")
//	public void user_selects_the_location_hotel_room_and_enters_checkin_checkout_and_selects_noofadults_noofchildren(
//			String location, String hotel, String roomType, String checkIn, String checkOut, DataTable data) {
//
//		booking = manager.getBookingPojo();
//		//booking.getBooking(location, hotel, roomType, checkIn, checkOut, data);
//
//	}
//
//	@When("User clicks the radio button and proceeded with continue button")
//	public void user_clicks_the_radio_button_and_proceeded_with_continue_button() {
//		confirmation = manager.getConfirmationPojo();
//		confirmation.getConfirmation();
//
//	}
//
//	@When("User enters firstname {string},lastname {string},address{string},creditcardno{string}, and selects creditcardtype month {string},year {string} and enters cvvnum {string}")
//	public void user_enters_firstname_lastname_address_creditcardno_and_selects_creditcardtype_month_year_and_enters_cvvnum(
//			String firstnm, String lastnm, String address, String ccn, String mth, String year, String cvv,
//			DataTable datas) {
//		payment = manager.getPaymentPojo();
//		//payment.getPayment(firstnm, lastnm, address, ccn, mth, year, cvv, datas);
//
//	}
//
//	@When("Cancel the Booking")
//	public void cancel_the_Booking() throws InterruptedException {
//		orderNo = manager.getOrderNoPojo();
//		orderNo.cancelOrderId();
//
//	}
//
//	@Then("Booking must be cancelled")
//	public void booking_must_be_cancelled() {
//		System.out.println("Booking Cancelled Successfully");
//
//	}
//
//}
