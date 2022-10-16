@regression
Feature: DuckDuckGo calculator tool
  As a web surfer,
  I want to do some mathematical operation,
  So I can get some equations done.

  @calculator-feature
  Scenario: Check calculator feature
    Given The duckduckgo page is displayed
    When I do a simple math operation
    Then the calculator feature is shown

  @math-operations
  Scenario Outline: Math operations
    Given The duckduckgo page is displayed
    When I search for <operation>
    Then results equals <result>

    Examples: Operations
      | operation   | result |
      | "1+1"       | "2"    |
      | "2*10"      | "20"   |
      | "30/5"      | "6"    |
      | "sqrt(81)"  | "9"    |
