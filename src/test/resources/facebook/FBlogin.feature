Feature: Facebook User Login Feature

  Scenario: FB user Login Scenario
  Given user is at the login page fo the application
  When User login with the following username and password
  | Admininistrator  | ABCabc@123  	|
  | JohnDoe		   | Johnab!c123	|
  | JaneDoe          | Janeabc123@ 	|
  | RebecaR          | Rebebc123!		|

  Then User should be able to login with correct username and password