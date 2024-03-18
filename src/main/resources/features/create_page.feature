
Feature: Créer une page en tant que compte Instagram

  Scenario Outline: Créer une nouvelle page

    Given un compte Instagram avec le username "<usernameInstagram>"

    When le compte Instagram crée une page nommée "<nomPage>"

    Then la page "<nomPage>" est créée avec succès par le compte Instagram "<usernameInstagram>"

    Examples:
      |usernameInstagram | nomPage     |
      | Naruto           | Konoha      |
      | Luffy            | Sunny       |
      | Eren             | Shiganshina |