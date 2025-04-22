Feature: Verificación de la columna 'IVA retenido' en Reporte Contable

  Scenario: Comprobar visualización y cálculo de 'IVA retenido' en el reporte
    Given El usuario ha exportado el Reporte Contable
    When El usuario verifica la columna 'IVA retenido' en la hoja Excel
    Then La columna 'IVA retenido' aparece correctamente
    When El usuario comprueba el cálculo en la columna para movimientos que lo requieren
    Then El valor mostrado es el monto retenido correcto