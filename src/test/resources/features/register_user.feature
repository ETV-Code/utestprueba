Feature: Register User
  As user
  Want to create a new register profile
  To access profile

  Scenario: Successful user creation
    Given user in the home page
    When user create an account completing all fields
    Then user shows its username