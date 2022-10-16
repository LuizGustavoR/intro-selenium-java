@regression
Feature: DuckDuckGo web browsing
  As a web surfer,
  I want to find information online,
  So I can learn new things and get tasks done.

  @Search
  Scenario: Search Successful
    Given The duckduckgo page is displayed
    When I search for "apple"
    Then results title contain "apple"