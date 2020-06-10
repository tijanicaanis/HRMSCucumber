Feature: Login

  @smoke
  Scenario Outline: 
    When user enter valid ess "<Username>" and "<Password>"
    And user click on login button
    Then "<FirstName>" is successfully logged in

    Examples: 
      | Username | Password    | FirstName |
      | Admin    | Hum@nhrm123 | Admin     |
      | taras123 | Taras_123.$ | taras     |

  @smoke
  Scenario Outline: 
    When User enter valid "<UserName>"  and invalid "<Password>"
    And user click on login button
    Then User see "<ErrorMessage>" text on login page

    Examples: 
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |

  @try
  Scenario: Login with empty username and valid password
    When I enter empty username and valid passwordand see error massage
      | UserName | Password   | ErrorMessage             |
      |          | Admin123   | Username cannot be empty |
      |          | Syntax123! | Username cannot be empty |
      | Admin    |            | Password cannot be empty |
      | Admin    |            | Password cannot be empty |
