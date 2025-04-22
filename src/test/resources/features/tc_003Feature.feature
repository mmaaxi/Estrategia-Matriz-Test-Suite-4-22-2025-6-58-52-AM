Feature: Verificar actualización en el campo 'estado'

  Scenario: Validar la actualización de la columna 'estado'
    Given Me encuentro en la página específica con el campo 'estado'
    When Comparo los valores en la columna 'estado' antes y después de la actualización
    Then Los cambios en el formato y contenido de la columna 'estado' coinciden con lo especificado