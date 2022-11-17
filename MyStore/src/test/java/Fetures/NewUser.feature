Feature: New User

  Scenario: New user creating account
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    * User click create new account
    * User choose "Mrs"
    * User input first name
    * User input last name
    * User input email
    * User input password
    * User click save
    Then User created new account

  Scenario: New user creating account and adding new address
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When "Mr" create new account
    * User click account button
    * User click add first address
    * User fills in the address details and press save
    Then User has added a new address

    Scenario: New user creating account adding new addres and buys item
      Given User is on "https://mystore-testlab.coderslab.pl/index.php"
      When "Mr" create new account
      * User click account button
      * User click add first address
      * User fills in the address details and press save