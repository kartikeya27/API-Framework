Feature: Validating PurgoMalum API's 
@Regression
Scenario: Verifing test input 
	Given user get some test outout 
	When user call "getServiceAPI" with "GET" http request 
	Then the API call is success with status code 200 
	And "result" in response body is "this is some test input"
	