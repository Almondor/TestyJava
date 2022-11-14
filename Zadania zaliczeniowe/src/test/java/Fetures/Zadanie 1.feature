Feature:The user addresses operations

  Scenario Outline: The user adds a new address
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    * User types valid Email and Password and press Sign in
    * User click Addresses button
    * User click Add a new address tile
    * User input "<alias>" and "<address>" and "<city>" and "<zip/postal code>" and "<country>" and "<phone>"
    Then User has added new address
    Examples:
      | alias         | address     | city    | zip/postal code | country        | phone     |
      | Maniek        | Krolewska   | Warsaw  | 155-33          | Poland         | 888888888 |
      | Vlad          | Orcs street | Moscow  | 545-321         | Russia         | 999999999 |
      | Mike Vasowsky | Fast street | Toronto | 824343          | United Kingdom | 111111111 |

  Scenario Outline: The user adds a new address and removes it
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    * User types valid Email and Password and press Sign in
    * User click Addresses button
    * User click Add a new address tile
    * User input "<alias>" and "<address>" and "<city>" and "<zip/postal code>" and "<country>" and "<phone>"
    * User press save
    * User deletes address
    Then User deleted address

    Examples:
      | alias         | address     | city    | zip/postal code | country        | phone     |
      | Mike Vasowsky | Fast street | Toronto | 824343          | United Kingdom | 111111111 |


