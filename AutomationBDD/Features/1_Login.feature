Feature: Login to Application Sales Force

  Scenario Outline: to validate Login of the Application
    Given Login into the Sales force Application
    When NewUser passes value for Username as "<username>" and password as "<password>"
    
    Then User should be able to login
    And  User should click on  Remind Me Later

    Examples: 
      | username                        | password    |
      | sahoo.rashmitaqa-7b52@force.com | Welcome@123 |
     
      
