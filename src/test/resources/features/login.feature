Feature: Test de login

  @loginvalido
  Scenario: Login exitoso
    Given url 'https://reqres.in/api/login'
    And headers { x-api-key: 'reqres-free-v1', Accept: 'application/json' }
    And request { email: 'eve.holt@reqres.in', password: 'cityslicka' }
    When method post
    Then status 200
    And match response.token != null

  @loginfallido
  Scenario: Login fallido
    Given url 'https://reqres.in/api/login'
    And headers { x-api-key: 'reqres-free-v1', Accept: 'application/json' }
    And request { email: 'peter@klaven' }
    When method post
    Then status 400
    And match response == { error: 'Missing password' }