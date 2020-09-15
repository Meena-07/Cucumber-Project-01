Feature:
Verifying the number of rooms feature of adactin hotel application
@Smoke
Scenario Outline:
Verifying Adactin Number of Rooms functionality
Given User is on the login page
When User enters the valid username "<userName>" and password "<password>"

And User selects the location "<location>",hotel "<hotel>", room "<roomType>", no of rooms"<noOfRooms>" and enters checkin "<checkIN>",checkout"<CheckOut>" and selects noofadults"<adult>", noofchildren"<children>"

And User clicks the radio button and proceeded with continue button
And User enters firstname "<firstName>",lastname "<lastName>",address"<address>",creditcardno"<creditCardNo>", and selects creditcardtype"<creditCardType>", month "<month>",year "<year>" and enters cvvnum "<cvvNum>"

Then OrderNo should be generated
Examples:
|userName|password|location|hotel|roomType|noOfRooms|checkIn|checkOut|adult|children|firstName|lastName|address|creditCardNo|creditCardType|month|year|cvvNum|
|Meenaa07|Meenaa07|Melbourne|Hotel Sunshine|Standard|1 - One|23/08/2020|24/08/2020|1 - One|1 - One|Meena|Ezhilvalavan|Chennai|1234567894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Brisbane|Hotel Cornice|Double|2 - Two|24/08/2020|25/08/2020|1 - One|2 - Two|Raguvarma|Ezhilvalavan|Chennai|5869567894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Adelaide|Hotel Sunshine|Deluxe|2 - Two|25/08/2020|26/08/2020|1 - One|3 - Three|Kavitha|Ezhilvalavan|Chennai|5869467894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|London|Hotel Hervey|Super Deluxe|1 - One|26/08/2020|27/08/2020|1 - One|4 - Four|Priya|Dhandapani|Chennai|4567897894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|London|Hotel Hervey|Super Deluxe|1 - One|26/08/2020|27/08/2020|1 - One|- Select Children per Room -|Priya|Dhandapani|Chennai|4567897894561234|American Express|January|2022|123|
