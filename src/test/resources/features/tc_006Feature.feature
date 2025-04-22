Feature: Verificar existencia y contenido de la columna 'IVA 0%' en el Reporte Contable.

  Scenario: Verificar que la columna 'IVA 0%' existe y su contenido es correcto
    Given el usuario exporta el Reporte Contable a un archivo de Excel
    When el usuario revisa las celdas de la columna 'IVA 0%'
    Then la columna 'IVA 0%' aparece en la hoja de Excel
    And los valores corresponden a montos que aplican al 0% de IVA conforme a la lógica de negocio.