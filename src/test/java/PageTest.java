import in.at.anime.Anime;
import in.at.anime.Personnage;
import in.at.instagram.Instagram;
import in.at.instagram.Page;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assert.assertEquals;

public class PageTest {


    private Instagram compte;
    private String nomPage;
    @Before
    public void setUp() {
        System.out.println("setUpWell");

        compte = new Instagram("Naruto" );
        nomPage = "Konoha";

    }

    @AfterEach
    public void tearDown()
    {

    }
    @Test
    public void testAjouterPage() {

        String expectedPageName = "Konoha";

        compte.ajouterPage("Konoha");


        assertEquals("Konoha",expectedPageName , compte.pages.getFirst().getNomPage());
    }

}
