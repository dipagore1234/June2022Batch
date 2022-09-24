Feature: Login functionality

Background: User cancelled initial Login window
Given User provide browser name as a "Chrome" and exe location as "E:\\automation support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com"
Given user cancle initial Login window

Scenario: Login functionality with valid credentials
When user navigate on Login tab
When user click on myprofile
When user enter "9168313434"
When user enter "abcd@1234"
When user click on Login button
Then Application shows user profile to user