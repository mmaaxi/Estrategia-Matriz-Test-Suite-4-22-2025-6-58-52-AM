Feature: Validate Key Format in Column C

  Scenario: Export Accounting Report and Validate Column C
    Given the user exports the accounting report
    When the user verifies the formula in Column C
    Then the values in Column C should follow the specified format