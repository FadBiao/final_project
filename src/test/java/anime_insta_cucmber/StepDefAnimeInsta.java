package anime_insta_cucmber;
import in.at.anime.Anime;
import in.at.anime.Personnage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class StepDefAnimeInsta {

    private Anime anime;
    private Personnage perso;
    private String username;

    @Given("un personnage {string} de l'anime {string} créé en {int} âgé de {int} ans et ayant une force de {int}")
    public void un_personnage_de_l_anime_créé_en_âgé_de_ans_et_ayant_une_force_de(String perso_name, String anime_titre, Integer anneeCreation, Integer age, Integer force) {
        anime = new Anime(anime_titre, anneeCreation);
        perso = new Personnage(perso_name, age, anime, force);
    }



    @When("le personnage crée un compte Instagram avec le username {string}")
    public void le_personnage_crée_un_compte_instagram_avec_le_username(String usernane) {
         perso.creeCompte(username);
         this.username = perso.getCompte().getUsername();
    }

    @Then("le compte Instagram est créé avec le username {string} et associé au personnage {string}")
    public void le_compte_instagram_est_créé_avec_le_username_et_associé_au_personnage(String expected_user_name, String perso_name) {
        assertEquals(expected_user_name, username);
    }

}
