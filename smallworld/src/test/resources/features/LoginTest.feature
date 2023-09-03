Feature: As a user, I want to create credentials

  @ValidCase
  Scenario: User should be able to login with valid credentials
    Given The user is on SauceDemopage
    When User Enters valid "username"
    And User Enter Valid "password"
    Then User should be able to login successfully

  @InvalidCase
  Scenario Outline: User should be able to login with valid credentials
    Given The user is on SauceDemopage
    When User Enters valid "<username>"
    And User Enter Valid "<password>"
    Then User should be able to login successfully
    Examples:
      | username             | password |
      | standard_user        | 123456   |
      | invaliduser          | secret_sauce  |