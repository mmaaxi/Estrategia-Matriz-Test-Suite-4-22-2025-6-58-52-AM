Feature: Validar existencia y nombre de columna 'Status Pago Código' y renombrado de 'Status de Pago'

  Scenario: Exportar y validar columnas en el Reporte Contable
    When exporto el Reporte Contable
    Then la columna 'Status Pago Código' debe aparecer inmediatamente a la derecha de 'Fecha de Pago'
    And confirmo que la columna 'Status de Pago' se renombra a 'Descripción Status Pago'