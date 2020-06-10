Feature: AddEployee 
 
   Background: 
    Given user is logged with valid admin credentials
    And user navigates to AddEmployeePage

   @smoke
  Scenario: Add Employee with first and lastname
    When user enters employees "Jame" and "Smith"
    And user clicks save button
    Then "Jame Smith" is added successfully

  @smoke
  Scenario: Add Employee without employee id
    When user enters employees "Banita" and "Bon"
    And user deletes employee id
    And user clicks save button
    Then "Banita Bon" is added successfully

 @smok
  Scenario: AddEmployee and create Login Credentials
    When user enters employees "taras" and "tar"
    And user clicks on create login checkbox
     And user enters login credentials
    And user clicks save button
    Then "taras tar" is added successfully

  #to perform DDT in cucumber we use Scenario Outline with Examples
  #works for all code and will run 4 times 
  @smoke
  Scenario Outline: Adding multiple employees
    When user enter employees "<FirstName>", "<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully

    Examples: 
      | FirstName | MiddleName | LastName  |
      | James     | J          | Smith     |
      | Faisal    | F          | Sakhi     |
      | Sohil     | S          | Instuctor |
      | Yunus     | Emre       | Yakut     |

  #adding multiple employees using Cucumber DataTable
  #works only for spacific line will open ones and add employee 2 times
  Scenario: Adding multiple employees
    When user enters employee details and click on save then employee is added
      | FirstName | MiddleName | LastName |
      | John      | J          | Doe      |
      | Jane      | J          | Smith    |
@excel
      Scenario: Adding multiple employee from excel
      When user enters employee data from "Loggin" excel sheet then employee is added
      
      