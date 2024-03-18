package anime_insta_cucmber;

import in.at.instagram.Instagram;
import in.at.instagram.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import in.at.anime.Anime;
import in.at.anime.Personnage;
import static org.junit.Assert.assertEquals;
public class CreatePageSteps {

    private Instagram compte;
    private String username;
    private Page page;
    @Given("un compte Instagram avec le username {string}")
    public void givenCharacter( String username) {
         compte  = new Instagram("naruto");
         this.username = username;
         //Exemple de création d'un personnage lié à l'anime
        }
        @When("le personnage crée une page nommée {string}")
        public void whenCharacterCreatesPage(String pageName) {
        // Ici, vous pouvez simuler la création d'une page par le personnage
            // avec le nom fourni

            compte.ajouterPage(pageName);
        }
        @Then("la page {string} est créée avec succès par le personnage {string} ")
        public void thenPageIsSuccessfullyCreated(String pageName, String characterName) {

             assertEquals(true, compte.pages.contains(new Page(pageName)));
            // Supposons que votre classe Anime a une méthode contientPage pour vérifier si une page existe
        }
    }
