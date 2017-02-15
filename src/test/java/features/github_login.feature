
Feature: Test github login functionality
We need to have user credentials for positive test
 
 Background: Open the browser and github url
 Given The url and browser is selected
 Then The github is opened in required browser
 Then user clicks on sign in button
 
  @sanity
  Scenario: Test user login without username and password
  When user clicks on signin button
  Then user gets an error message "Incorrect username or password."
  
  @regression
  Scenario: Test user login with invalid username and password
  When user enter username and password
  |username|passwords|
  |kreetan|12324|
  |kreetanshu@gmail.com|Rails@1234|
  Then user can login with credentials
  Then user cannot login with credentials
  
  
  