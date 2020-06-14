Feature: Login

  @smoke
  Scenario Outline: 
    When user enter valid ess "<Username>" and "<Password>"
    And user click on login button
    Then "<FirstName>" is successfully logged in

    Examples: 
      | Username  | Password     | FirstName |
      | Admin     | Hum@nhrm123  | Admin     |
      | Sasha_123 | Sasha_123=$. | Sasha     |

  #cucumber Scenario Outline with Examples
  @smoke
  Scenario Outline: 
    When User enter empty "<UserName>"  and invalid "<Password>"
    And user click on login button
    Then User see "<ErrorMessage>" text on login page

    Examples: 
      | UserName | Password   | ErrorMessage             |
      | Admin    |            | Password cannot be empty |
      |          | Syntax123! | Username cannot be empty |

  #cucumber Datatable
  @smoke
  Scenario: : Login with empty username and valid password
    When i enter empty credentials and see error massage
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |
