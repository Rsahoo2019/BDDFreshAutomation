Feature: LogIn to Application SalesForce by Free Trial
  I want to use this template for my feature file
  
  //@tag1

  Scenario Outline: To Validate Login into the Application with Free trial
    Given Login into the Salesforce Application
    When User passes value for Firstname as "<Firstname>" Lastname as "<Lastname>" Email as "<Emaill>"Jobtitle as "<Jobtitle>"Phone as"<Phone>" and company as "<company>"
    And User click on the check box
    And user click on the Start my free trial
    Then User login into the application

    Examples: 
      | Firstname | Lastname | Email                      | Jobtitle | Phone      | company |
      | Rashmi    | Sahoo    | sahoo.rashmitaqa@gmail.com | test eng | 7757028800 | CTS     |
