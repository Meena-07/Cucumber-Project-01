package org.objectrepository;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.datatable.DataTable;

public class BookingPojo extends BaseClass {
	public BookingPojo() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driv, this);
	}

	@FindBy(id = "location")
	private WebElement selectLocation;
	@FindBy(id = "hotels")
	private WebElement selectHotels;
	@FindBy(id = "room_type")
	private WebElement selectRoomType;
	@FindBy(id = "room_nos")
	private WebElement selectnoOfRooms;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id = "adult_room")
	private WebElement selectAdultsPerRoom;
	@FindBy(id = "child_room")
	private WebElement selectChildrenPerRoom;
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	@FindBy(id = "Reset")
	private WebElement btnReset;

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotels() {
		return selectHotels;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getselectNoOfRooms() {
		return selectnoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getSelectAdultsPerRoom() {
		return selectAdultsPerRoom;
	}

	public WebElement getSelectChildrenPerRoom() {
		return selectChildrenPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}
	
	public void getBooking(String location, String hotel, String roomType,String numberOfRooms,String checkIn, String checkOut,String adult,String chdrn)
	{
		selByVisTxt(getSelectLocation(), location);
		selByVisTxt(getSelectHotels(), hotel);
		selByVisTxt(getSelectRoomType(), roomType);
//		List<Map<String, String>> li = data.asMaps(String.class, String.class);
//		Map<String, String> mp = li.get(0);
//		String numberOfRooms = mp.get("noOfRooms");
		

		selByVisTxt(getselectNoOfRooms(), numberOfRooms);

		fill(getTxtCheckInDate(), checkIn);
		fill(getTxtCheckOutDate(), checkOut);
//		Map<String, String> m = li.get(1);
//		String adt = m.get("adultsPerRoom");
		selByVisTxt(getSelectAdultsPerRoom(), adult);
//		String chdrn = li.get(2).get("childrenPerRoom");
		selByVisTxt(getSelectChildrenPerRoom(), chdrn);
		buttonClick(getBtnSearch());

	}

}
