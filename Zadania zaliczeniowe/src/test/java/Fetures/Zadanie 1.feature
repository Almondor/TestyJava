Feature:Changing user address

Scenario Outline: User changing address
 Given User is on "https://mystore-testlab.coderslab.pl/index.php"
  When User click Sign in
   And User types valid Email and Password and press Sign in
   And User click Addresses button
   And User click Add a new address tile
   And User input "<alias>" and "<address>" and "<city>" and "<zip/postal code>" and "<country>" and "<phone>"
  Then User has added new address
  Examples:
    | alias         | address          | city             | zip/postal code   | country        | phone        |
    | Maniek        | Krolewska        | Warsaw           | 155-33            | Poland         | 888888888    |
    | Vlad          | Orcs street      | Moscow           | 545-321           | Russia         | 999999999    |
    | Mike Vasowsky | Fast street      | Toronto          | 824343            | United Kingdom | 111111111    |

  Scenario Outline: User changing address (dodatkowe)
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    And User types valid Email and Password and press Sign in
    And User click Addresses button
    And User click Add a new address tile
    And User input "<alias>" and "<address>" and "<city>" and "<zip/postal code>" and "<country>" and "<phone>"
    And User press save
    And User deletes address
    Then User deleted address

    Examples:
      | alias         | address          | city             | zip/postal code   | country        | phone        |
      | Mike Vasowsky | Fast street      | Toronto          | 824343            | United Kingdom | 111111111    |




