Feature: Validar ubicación y contenido de columnas 'Folio Pre solicitud' y 'Folio de Pago' en el Reporte Contable

  Scenario: Exportar el Reporte Contable y verificar columnas
    Given El usuario está en la página del Reporte Contable
    When El usuario exporta el Reporte Contable
    Then La columna 'Folio Pre solicitud' está a la derecha del campo 'Ramo'
    And La columna 'Folio de Pago' está a la derecha de la columna 'Folio Pre solicitud'
    And Ambas columnas están vacías o contienen valores por defecto