	Feature: Search and place the order for products
	
	@placeorder
	Scenario Outline: Search experience for product search in both in home and offers page
	
	Given user is on Greencart Landing page
	When user serched with Shortname <Name> and extracted actual name of product
	And added "3" items of the selected product to cart
	Then User proceeds to Checkout and validate the <Name> items in checkout page
	And verify user has ability to enter promo code and place the order
	
	Examples:
	| Name |
	| Tom |