Feature:Ordering items on site

  Scenario:The user orders a sweater
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    * User types valid Email and Password and press Sign in
    * User go to MainPage
    * User Choose Hummingbird Printed Sweater
    * User Choose size "M"
    * User Choose 5 units
    * User Adds items to basket
    * User Checkout
    * User Checkout in basket
    * User Confirms Address
    * User Choose pick up in store
    * User pays by check
    * User clicks order with and obligation to pay
    Then User bought item

  Scenario:The user orders a sweater and checks the status of the order
    Given User is on "https://mystore-testlab.coderslab.pl/index.php"
    When User click Sign in
    * User types valid Email and Password and press Sign in
    * User go to MainPage
    * User Choose Hummingbird Printed Sweater
    * User Choose size "L"
    * User Choose 5 units
    * User Adds items to basket
    * User Checkout
    * User Checkout in basket
    * User Confirms Address
    * User Choose pick up in store
    * User pays by check
    * User clicks order with and obligation to pay
    * User bought item and checks it status
    Then User has checked the order status



  