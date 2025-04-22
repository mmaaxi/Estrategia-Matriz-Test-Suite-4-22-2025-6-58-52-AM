Feature: Verificar existencia y contenido de la columna 'IVA exento'

  Scenario: Validar que la columna 'IVA exento' aparezca en el reporte contable y su contenido sea correcto
    Given el usuario tiene acceso al sistema de reportes contables
    When el usuario exporta el Reporte Contable
    Then la columna 'IVA exento' debe aparecer en el documento en la posición designada
    And los montos en la columna 'IVA exento' deben ser correctos según los criterios de IVA exento