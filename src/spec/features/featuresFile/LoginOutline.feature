@outline
Feature: connection avec plusieur comptes
  ETQ utilistaeur Je souhaite me connecter avec plusieur comptes

  @outline_multiUsers
  Scenario Outline: Je souhaite me connecter avec plusieur comptes
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "email"
    And Je saisis le login "login"
    And Je clique sur le bouton Login

    Examples: 
      | email              | login |
      | admin@yourstore.com    |admin|
      | ahmedbnh@gmail.com |ahmed|
      | mouna@gmail.com    |mouna|
      
