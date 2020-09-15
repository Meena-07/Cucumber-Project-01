package org.projectobjectmanager;

import org.objectrepository.BookingPojo;
import org.objectrepository.ConfirmationPojo;
import org.objectrepository.LoginPojo;
import org.objectrepository.OrderNoPojo;
import org.objectrepository.PaymentPojo;

public class ObjectManager {
	private LoginPojo loginPojo;
	private BookingPojo bookingPojo;
	private ConfirmationPojo confirmationPojo;
	private PaymentPojo paymentPojo;
	private OrderNoPojo orderNoPojo;
	private static ObjectManager objectManager;

	private ObjectManager() {

	}

	public static ObjectManager getInstance() {
		return (objectManager == null) ? objectManager = new ObjectManager() : objectManager;
	}

	public LoginPojo getLoginPojo() {
		return (loginPojo == null) ? loginPojo = new LoginPojo() : loginPojo;
	}

	public BookingPojo getBookingPojo() {
		return (bookingPojo == null) ? bookingPojo = new BookingPojo() : bookingPojo;
	}

	public ConfirmationPojo getConfirmationPojo() {
		return (confirmationPojo == null) ? confirmationPojo = new ConfirmationPojo() : confirmationPojo;
	}

	public PaymentPojo getPaymentPojo() {
		return (paymentPojo == null) ? paymentPojo = new PaymentPojo() : paymentPojo;
	}

	public OrderNoPojo getOrderNoPojo() {
		return (orderNoPojo == null) ? orderNoPojo = new OrderNoPojo() : orderNoPojo;
	}

}
