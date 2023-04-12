@CarTrading
  Feature: Car Trading
    I want to buy and sell cars

    @BuyCar
    Scenario: buying second hand car
      Given I go to buy car
      And car must be of the Ford Motors
      And car must be white in color
      When I search for car
      And I select city as Tokyo
      Then I should get white cars in result
      And cars must be atleast 2 years old

