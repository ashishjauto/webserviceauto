Feature: Buying a computer
  I want to use this template for my feature file
  Background: Buying Dell PC
    Given I want to buy a PC
    And PC should be of Dell

  @BuyingDesktop
  Scenario: Buying a desktop
    And it should be a desktop
    When I select monitor as 15 inch
    And a 'carbon' finish

  @BuyingTab
  Scenario: Buying a laptop
    And it should be a laptop
    When I select screen as 12 inch
    And a 'sleak silver' finish
    And I select hard drive 1 TB

