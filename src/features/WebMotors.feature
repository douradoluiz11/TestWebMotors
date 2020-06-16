@ValidaPesquisa
Feature: Pesquisa Carro Web Motors



  Scenario: Realizar pesquisa por Marca, Modelo e Versão
    Given Abro o Navegador
    When Acesso o Site "https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque"
    And Clico na Marca
    And Seleciono o Modelo
    Then Seleciono a Versão


