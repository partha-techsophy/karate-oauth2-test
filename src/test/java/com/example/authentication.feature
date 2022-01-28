@ignore
Feature: API Authentication

  Background:
    * url baseAuthUrl

  Scenario: Authentication Test
    * def params =
    """
    {
      'grant_type' : '#(grantType)',
      'client_id' : '#(clientId)',
      'client_secret' : '#(clientSecret)',
      'username' : '#(userName)',
      'password' : '#(password)'
    }
    """

    Given path '/auth/realms/dev-realm/protocol/openid-connect/token'
    And form fields params
    When method POST
    Then status 200

    * def access_token = response.access_token
