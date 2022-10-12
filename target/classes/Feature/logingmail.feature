
Feature: login gmail
  @SmokeTest
  Scenario Outline: login

    Given on google site gmail
    When click on icon gmail and give <<login>> and <<pass>>
    And write section

    Examples:
      | login |pass
      |traore |oumarou2375
      |traore |12345

    @regression
    Scenario:login2
      Given on site google
      When search talan
      Then verify talan tunisie

   @important
  Scenario:login3
    Given on site google
    When search talan
    Then verify talan tunisie

