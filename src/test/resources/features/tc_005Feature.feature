Feature: Verificar renombrado de columna a 'Monto Acumulado Folio OPC (2121)'

  Scenario: Revisar renombrado y consistencia de datos en el Reporte Contable
    Given El usuario ha exportado el Reporte Contable
    When El usuario revisa la columna 'Monto Acumulado Folio OPC (2121)' en la Columna Z
    Then El encabezado de la columna debe ser 'Monto Acumulado Folio OPC (2121)'
    And Los datos de la columna deben coincidir con los originales