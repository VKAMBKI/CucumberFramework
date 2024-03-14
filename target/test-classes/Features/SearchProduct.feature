	Feature: Search and place the order for products
	
	@offerspage
	Scenario Outline: Search experience for product search in both in home and offers page
	
	Given user is on Greencart Landing page
	When user serched with Shortname <Name> and extracted actual name of product
	Then user searched for <Name> shortname in offers page
	And validate product name in offers page matches with Landing Page
	
	Examples:
	| Name |
	| Tom |
	| Beet |