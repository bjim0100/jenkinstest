Feature: User creates individual profile by adding  profile


Background:
Given user navigates to url
When user submits email
And user submits password
And user clicks login button


Scenario Outline:
Given user clicks on header
When user clicks on profile
And user clicks on edit profile
And user submits "<firstname>" and "<lastname>" 
And user submits "<address>"
And user sends phone number "<number>"
And user submits  profile email 
And user submits  gps "<gps>" 
And user selects gender
And user changes privacy level
And user clicks save
Then user information should be saved successfully 

Examples:
|firstname     |lastname|  address  | gps         | number |
| obeng      | agyenim  |    gs123456     |ws1234  | 0245345324|
