Feature: Probar la busqueda en Google

  Scenario: Busco algo en Google
    Given navego a google
    When busco algo
    And click en el boton buscar
    Then obtengo resultados

