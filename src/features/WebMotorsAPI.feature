@ValidaPesquisaAPI
Feature: Pesquisa Carro Web Motors API


  Scenario Outline: Realizar pesquisa por Marca, Modelo e Versão - Por API

    Given Busco Modelo Por API "/api/OnlineChallenge/Model", <ID>
    And   Busco Versão Por API "/api/OnlineChallenge/Version", <ID>
    Then  Busco Veiculo Por API "/api/OnlineChallenge/Vehicles", <ID>


    Examples:
      | ID |
      | 1  |
      | 2  |
      | 3  |
