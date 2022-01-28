Feature: Get user info

  Background:
    * def authentication = call read('../authentication.feature')
    * def accessToken = authentication.access_token
    * url baseAPIUrl


    Scenario: Get Call
      Given path '/api/accounts/1.0.0/login-user-info'
      And header Authorization = 'Bearer ' + accessToken
      When method GET
      Then status 200

      And print response
      And match response.data.email == '[EMAIL TO TEST]'
