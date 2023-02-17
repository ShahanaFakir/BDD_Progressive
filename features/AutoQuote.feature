@auto @quote

Feature: Auto Quote Validation

Scenario: Get a Auto Quote
Given user is in the homepage
When user select auto from product
And user will be in auto page
And user input 11377 in zipcode
And click get a quote
Then user will be in birthdate page

@datadriven
Scenario Outline: Get Auto Quote with different sets of data
Given user is in the homepage
When user select auto from product
And user will be in auto page
And user input <zipcode> in zipcode
And click get a quote
Then user will be in <birthdate> page
Examples:
|zipcode|birthdate|
|11377|"birthdate"|
|11372|"birthdate"|
|11375|"birthdate"|