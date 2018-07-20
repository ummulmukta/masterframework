@login
Feature: User want to visit DisneyWorld 

                                 Description: 
        "User Want to booking Hotel, Park Ticket, Transportation and Dining Planing"

  Scenario: User want to booking DisneyWorld ticket and hotel 


Given User visit on homepage
When  User able to picks a dates
And   User picks two adults 
And  User picks one child and select age Twelve 
And  User picks another child and select age Five 

And  User select All Resort Hotels button
And  User clicks Find Resort
Then User should see various resort options selects any available room in the resort and clicks select buttun 
And  User able to see all unavailable Room
And  user able to click available room

When User selects any ticket option
And  User clicks Park Hopper Option
And  User clicks continue
Then User should see dining plan options and selects no dining plan and clicks continue

When User clicks Add Ground for Ground transportation
And  User clicks Next
And  User clicks Done
And  User sees Complimentary on Ground transportation option
Then Screenshot of the cart page

When User remove all items from the cart
And  Another Screenshot 
Then Usre success fully verify
	