Feature: Verify the existence and position of the 'Estado Código' column

  Scenario: Check the position of 'Estado Código' in the financial report
    Given I have exported the Financial Report
    When I open the Excel sheet
    Then the column 'Estado Código' should be immediately to the right of column I
    And the column header should be in the correct position