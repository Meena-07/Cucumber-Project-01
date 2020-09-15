@Func2
Feature: 
  Verifying the booking and cancellation of booking in adactin web application

  Scenario Outline: 
    verifying the booking and cancellation functionalities in adactin

    Given Visitor is in Login
    When Visitor gives the valid name "<userName>" and password "<pass>"
    And Visitor select location "<location>",hotel "<hotel>", room "<roomType>", no of rooms"<noOfRooms>" and enters checkin "<checkIN>",checkout"<CheckOut>" and selects noofadults"<adult>", noofchildren"<children>"
    And Visitor clicks the radio button and selects continue button
    And Visitor enters firstname "<firstName>",lastname "<lastName>",address"<address>",creditcardno"<creditCardNo>", and selects creditcardtype"<creditCardType>", month "<month>",year "<year>" and enters cvvnum "<cvvNum>"
    And Attempting to cancel the Booking using generated OrderId
    Then Booking should be cancelled

    Examples: 
      | userName | pass     | location  | hotel          | roomType | noOfRooms | checkIn    | checkOut   | adult   | children | firstName | lastName     | address | creditCardNo     | creditCardType   | month   | year | cvvNum |
      | Meenaa07 | Meenaa07 | Melbourne | Hotel Sunshine | Standard | 1 - One   | 31/08/2020 | 01/09/2020 | 1 - One | 1 - One  | Meena     | Ezhilvalavan | Chennai | 1234567894561234 | American Express | January | 2022 |    123 |
