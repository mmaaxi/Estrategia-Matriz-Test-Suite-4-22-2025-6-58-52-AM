Feature: Validar la actualización de la fórmula en la columna 'IVA Acumulado'

  Scenario: Verificar la fórmula de 'IVA Acumulado' al exportar el Reporte Contable
    Given el usuario abre la aplicación de Reportes Contables
    When el usuario ejecuta la acción de exportar el reporte contable
    Then la fórmula de la columna 'IVA Acumulado' incluye únicamente IVA 16%, IVA FRONTERIZO, IVA 0% y IVA EXENTO
    And excluye IVA retenido

  Scenario: Probar suma acumulada de 'IVA Acumulado' con datos de ejemplo
    Given el usuario ingresa datos de prueba en la tabla de reportes
    When revisa la columna 'IVA Acumulado'
    Then verifica que la suma acumulada es correcta
    And el IVA retenido no está incluido