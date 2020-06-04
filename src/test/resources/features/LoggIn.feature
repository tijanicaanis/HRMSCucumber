Feature: LoggIn

  Scenario: Loggin with Admin cred
    Given user is navigated to HRMS
    When user is logged with valid admin credentials
    Then user see employee Bashboard page
    
    
    Scenario: Loggin Employy cred
    Given user is navigated to HRMS
    When user is logged with valid Employee credentials
    Then user see employee Bashboard page
