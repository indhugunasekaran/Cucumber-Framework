Feature: Meesho Application

Scenario: Product Added to cart should successfull
Given User should navigate to Meesho Application
And user should move cursor to Men
And User should click on Casual Shoes
And User should click on Aadab Shoes
And User should select a size
When User click on Add cart
Then Login link should be shown