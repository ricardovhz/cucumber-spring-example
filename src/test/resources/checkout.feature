# Created by ricardovhz at 17/01/19
Feature: Checkout

  Scenario Outline: Checkout de produtos
    Given o preco de "<produto>" é <preco>
    When eu faço o checkou de <qtd> "<produto>"
    Then o preco total de "<produto>" deve ser <total>

    Examples:

      | produto | preco | qtd | total |
      | banana  | 40    | 1   | 40    |
      | banana  | 40    | 2   | 80    |
      | maca    | 20    | 1   | 20    |
      | maca    | 20    | 3   | 60    |
      | pera    | 10    | 5   | 50    |
