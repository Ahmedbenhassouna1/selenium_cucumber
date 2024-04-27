@productadd
Feature: Ajout de produit
  ETQ utilisateur je souhaite chercher le nom du produit

  @productAdd
  Scenario: Je souhaite Ajouter un produit
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
    When Je clique sur Catalog
    And Je clique sur Products
    And je clicque sur le bouton Add New
    And je saisis le Product Name "Parfun"
    And je saisis le Short description " Une seul utilisation"
    And je click sur le bouton Save
