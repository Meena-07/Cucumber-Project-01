@Func3
Feature: 
  Verifying the roomtype feature in  adactin hotel application

  Scenario Outline: 
    Verifying Adactin roomtype functionality

    Given User is on the login page
    When User enters the valid username "<userName>" and password "<password>"
    And User selects the location "<location>",hotel "<hotel>", room "<roomType>", and enters checkin "<checkIN>",checkout"<CheckOut>" and selects noofadults, noofchildren
      | noOfRooms | adultsPerRoom | childrenPerRoom              |
      | 1 - One   | 1 - One       | - Select Children per Room - |
      | 2 - Two   | 2 - Two       | 1 - One                      |
      | 3 - Three | 3 - Three     | 2 - Two                      |
      | 4 - Four  | 4 - Four      | 3 - Three                    |
      | 5 - Five  |             0 | 4 - Four                     |
      | 6 - Six   |             0 |                            0 |
      | 7 - Seven |             0 |                            0 |
      | 8 - Eight |             0 |                            0 |
      | 9 - Nine  |             0 |                            0 |
      | 10 - Ten  |             0 |                            0 |
    And User clicks the radio button and proceeded with continue button
    And User enters firstname "<firstName>",lastname "<lastName>",address"<address>",creditcardno"<creditCardNo>", and selects creditcardtype month "<month>",year "<year>" and enters cvvnum "<cvvNum>"
      | creditCardType   |
      | American Express |
      | VISA             |
      | Master Card      |
      | Other            |
    And Cancel the Booking
    Then Booking must be cancelled

    Examples: 
      | userName | password | location  | hotel          | roomType     | checkIn    | checkOut   | firstName | lastName     | address | creditCardNo     | month   | year | cvvNum |
      | Meenaa07 | Meenaa07 | Melbourne | Hotel Sunshine | Standard     | 23/08/2020 | 24/08/2020 | Meena     | Ezhilvalavan | Chennai | 1234567894561234 | January | 2022 |    123 |
      | Meenaa07 | Meenaa07 | Brisbane  | Hotel Cornice  | Double       | 24/08/2020 | 25/08/2020 | Raguvarma | Ezhilvalavan | Chennai | 5869567894561234 | January | 2022 |    123 |
      | Meenaa07 | Meenaa07 | Adelaide  | Hotel Sunshine | Deluxe       | 25/08/2020 | 26/08/2020 | Kavitha   | Ezhilvalavan | Chennai | 5869467894561234 | January | 2022 |    123 |
      | Meenaa07 | Meenaa07 | London    | Hotel Hervey   | Super Deluxe | 26/08/2020 | 27/08/2020 | Priya     | Dhandapani   | Chennai | 4567897894561234 | January | 2022 |    123 |
