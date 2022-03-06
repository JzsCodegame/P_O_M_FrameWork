Feature: Validate the customerinfo API
		ACXUS-1445
		Ability to cache user information for responsive conversation experience with no data loading pauses

Background:
		* url baseURL
		* header accept = 'application/json'
		* header env = 'it04'
		* header Authorization = 'Bearer '+authInfo.response.access_token;
		* print authInfo.response.access_token

Scenario: TC001_Get_Customerinfo_API
  Given path '/customer/customerinfo/v2/summaries'
  And param wirelessaccountlist = 22602208
	When method get
	Then status 200
	And print response
	And match response.wirelessAccountSummaryList[*].currentBalanceAmt == [13.80]
	And match response.wirelessAccountSummaryList[*].statusCd == ["O"]