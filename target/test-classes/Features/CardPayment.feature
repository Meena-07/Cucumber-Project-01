@Exe2
Feature:
Verifying the Adults per room feature in adactin hotel application
Scenario Outline:
Verifying Adactin Adults per room functionality
Given User is on the login page
When User enters the valid username "<userName>" and password "<password>"

And User selects the location "<location>",hotel "<hotel>", room "<roomType>", no of rooms"<noOfRooms>" and enters checkin "<checkIN>",checkout"<CheckOut>" and selects noofadults"<adult>", noofchildren"<children>"

And User clicks the radio button and proceeded with continue button
And User enters firstname "<firstName>",lastname "<lastName>",address"<address>",creditcardno"<creditCardNo>", and selects creditcardtype"<creditCardType>", month "<month>",year "<year>" and enters cvvnum "<cvvNum>"

Then OrderNo should be generated
Examples:
|userName|password|location|hotel|roomType|noOfRooms|checkIn|checkOut|adult|children|firstName|lastName|address|creditCardNo|creditCardType|month|year|cvvNum|
|Meenaa07|Meenaa07|Melbourne|Hotel Sunshine|Standard|1 - One|20/09/2020|21/09/2020|1 - One|1 - One|Meena|Ezhilvalavan|Chennai|1234567894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Brisbane|Hotel Cornice|Double|2 - Two|24/09/2020|25/09/2020|2 - Two|1 - One|Raguvarma|Ezhilvalavan|Chennai|5869567894561234|VISA|January|2022|123|
|Meenaa07|Meenaa07|Adelaide|Hotel Sunshine|Deluxe|2 - Two|25/09/2020|26/09/2020|3 - Three|1 - One|Kavitha|Ezhilvalavan|Chennai|5869467894561234|Master Card|January|2022|123|
|Meenaa07|Meenaa07|London|Hotel Hervey|Super Deluxe|1 - One|26/09/2020|27/09/2020|4 - Four|1 - One|Priya|Dhandapani|Chennai|4567897894561234|Other|January|2022|123|

