#Author: asel@syntaxtechs.com
Feature: Dashboard
 
  @smoke
  Scenario: Dashboard menu view for admin
    When user is logged with valid admin credentials
    Then user see dashboard menu is displayed
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |

  @smoke
  Scenario: 
    When user enter valid ess "Sasha_123" and "Sasha_123=$."
    And user click on login button
    Then user see ess dashboard menu is displayed
      | Leave | Time | My Info | Performance | Dashboard | Directory |

