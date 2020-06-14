Feature: PersonalDetails

  Background: 
    Given user is logged with valid admin credentials
    And user navigates to AddEmployeePage

  @smoke  
  Scenario: modifine personal details
    When user enters employees "Jame" and "Smith"
    And user clicks save button
    Then "Jame Smith" is added successfully
    And user click on edit button
    Then User modifiy information
      | Driver License | SSN Number  | Smoke | SIN Number | ExpMonth | ExpDay | ExpYear | Gender | DobMonth | DobDay | DobYear | Marital Status | Nationality | Nick Name | Military Service |
      |           1234 | 456-93-8769 | yes   |      45678 | Jun      |     13 |    2022 |      1 | May      |     18 |    1989 | Single         | Ukrainian   | Bin       | yes              |
      |           1324 | 123-45-5673 | no    |      44678 | Aug      |     23 |    2024 |      2 | Aug      |     23 |    1988 | Married        | Iraqi       | Bob       | no               |
    And user click save button
    Then personal details is added successfully
