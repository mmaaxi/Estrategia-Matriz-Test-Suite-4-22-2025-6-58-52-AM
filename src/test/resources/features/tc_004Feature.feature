Feature: Validar columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Exportar el Reporte Contable y validar la columna
    Given el usuario ha ingresado al sistema contable
    When el usuario exporta el Reporte Contable
    Then la columna 'Monto acumulado Folio Reserva 5401' aparece inmediatamente a la derecha de la columna X

  Scenario: Calcular el monto acumulado
    Given el reporte contable está abierto
    When el usuario calcula el valor usando la suma de 'monto de reserva acumulado inmediata anterior' y 'monto de reserva actual' en filas de ejemplo
    Then el resultado es correcto y coincide con el cálculo manual