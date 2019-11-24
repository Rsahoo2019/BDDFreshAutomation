Feature: LogIn to Application SalesForce by Free Trial
  I want to use this template for my feature file
  
  //@tag1

  Scenario: To Validate Login into the Application with Free trial
    Given Login into the Salesforce Application
    When User passes value with excel row "2" dataset
    And User click on the check box
    And user click on the Start my free trial
    Then User login into the application

    