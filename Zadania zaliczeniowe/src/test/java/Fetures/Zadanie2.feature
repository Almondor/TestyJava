Feature:Ordering items on site

  Scenario:The user orders a sweater
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    And User types valid Email and Password and press Sign in
    And User go to MainPage
    And User Choose Hummingbird Printed Sweater
    And User Choose size "L"
    And User Choose 5 units
    And User Adds items to basket
    And User Checkout
    And User Checkout in basket
    And User Confirms Address
    And User Choose pick up in store
    And User pays by check
    And User clicks order with and obligation to pay
    Then User bought item

  Scenario:The user orders a sweater and checks the status of the order
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    And User types valid Email and Password and press Sign in
    And User go to MainPage
    And User Choose Hummingbird Printed Sweater
    And User Choose size "L"
    And User Choose 5 units
    And User Adds items to basket
    And User Checkout
    And User Checkout in basket
    And User Confirms Address
    And User Choose pick up in store
    And User pays by check
    And User clicks order with and obligation to pay
    And User bought item and checks it status
   Then User has checked the order status



  