Feature: Création de compte Instagram pour un personnage d'anime

  Scenario Outline: Un personnage d'anime crée un compte Instagram
    Given un personnage "<nomPersonnage>" de l'anime "<titreAnime>" créé en <anneeCreation> âgé de <agePersonnage> ans et ayant une force de <forcePersonnage>
    When le personnage crée un compte Instagram avec le username "<usernameInstagram>"
    Then le compte Instagram est créé avec le username "<usernameInstagram>" et associé au personnage "<nomPersonnage>"

    Examples:
      | nomPersonnage | titreAnime        | anneeCreation | agePersonnage | forcePersonnage | usernameInstagram |
      | Naruto        | Naruto            | 1999          | 17            | 200             | naruto_konoha     |
      | Luffy         | One Piece         | 1997          | 19            | 250             | luffy_pirateking  |
      | Eren          | Attack on Titan   | 2009          | 15            | 150             | eren_titanhunter  |

