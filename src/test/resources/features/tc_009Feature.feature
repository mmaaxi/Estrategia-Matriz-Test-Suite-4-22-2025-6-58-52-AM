Feature: Verificar actualización de fórmula en movimientos de 'pago' para 'Monto Acumulado Folio OPC 2121'

  Scenario: Verificar cálculos de fórmula de movimientos de 'pago'
    Given El usuario accede a la aplicación de registros de movimiento
    When El usuario identifica los registros de movimientos de 'pago'
    Then Se debe aplicar la nueva fórmula: =Z4+AD5+AE5+AH5+AC5+AB5+AM5
    And El resultado del cálculo manual debe coincidir con el resultado esperado