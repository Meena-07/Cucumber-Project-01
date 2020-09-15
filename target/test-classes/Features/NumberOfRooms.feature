@Exe4
Feature:
Verifying the number of rooms feature of adactin hotel application
@Retest
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
|Meenaa07|Meenaa07|Brisbane|Hotel Cornice|Double|2 - Two|24/08/2020|25/08/2020|1 - One|1 - One|Raguvarma|Ezhilvalavan|Chennai|5869567894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Adelaide|Hotel Sunshine|Deluxe|3 - Three|25/08/2020|26/08/2020|1 - One|1 - One|Kavitha|Ezhilvalavan|Chennai|5869467894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|London|Hotel Hervey|Super Deluxe|4 - Four|26/08/2020|27/08/2020|1 - One|1 - One|Priya|Dhandapani|Chennai|4567897894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Los Angeles|Hotel Creek|Super Deluxe|5 - Five|23/08/2020|24/08/2020|1 - One|1 - One|Vijay|Ashok|Chennai|1234567894123456|American Express|January|2022|123|
|Meenaa07|Meenaa07|Sydney|Hotel Cornice|Double|6 - Six|24/08/2020|25/08/2020|1 - One|1 - One|Lav|Rajesh|Chennai|12345678945678945|American Express|January|2022|123|
|Meenaa07|Meenaa07|Melbourne|Hotel Sunshine|Standard|7 - Seven|23/08/2020|24/08/2020|1 - One|1 - One|Meena|Ezhilvalavan|Chennai|1234567894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Brisbane|Hotel Cornice|Double|8 - Eight|24/08/2020|25/08/2020|1 - One|1 - One|Raguvarma|Ezhilvalavan|Chennai|5869567894561234|American Express|January|2022|123|
|Meenaa07|Meenaa07|Los Angeles|Hotel Hervey|Double|9 - Nine|23/08/2020|24/08/2020|2 - Two|2 - Two|Elakiya|Elango|Coimbatore|1235869523145678|Master Card|February|2022|145|
|Meenaa07|Meenaa07|Los Angeles|Hotel Creek|Double|10 - Ten|23/08/2020|24/08/2020|2 - Two|2 - Two|Elakiya|Elango|Coimbatore|1235869523145678|Master Card|February|2022|145|