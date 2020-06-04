Feature:Invalid Logg in

 Scenario: Loggin with invalid credentials
    Given user is navigated to HRMS
    When  user logged with valid username and invalid password
    Then user see Error message Invalid credentials
    
    
    Scenario: Loggin with empty username
    Given user is navigated to HRMS
    When user is logged with empty username and valid password
    Then user see Error message Username cannot be empty
    
     Scenario: Loggin with empty password
    Given user is navigated to HRMS
    When user is logged with valid username and empty password
    Then user see Error message Password cannot be empty