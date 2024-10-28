Feature: Demowebshop application

Background:
Given user should navigate to demowebshop appplication 
And user should click on login link

Scenario: Login should be successfull
And user should enter te username  as "javaseleniumA4@gmail.com"
And user should enter the password as "123456"
When user click on login button
Then login should be successfull

Scenario: Login should not be successfull 
And user should enter te username  as "indhu123@gmail.com"
And user should enter the password as "12345"
When user click on login button
Then login should not be successfull