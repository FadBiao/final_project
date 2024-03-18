import in.at.anime.Anime;
import in.at.anime.Personnage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assert.assertEquals;

public class AnimeTest {

    private Anime narutoAnime;
    private Personnage narutoPersonnage;
    @Before
    public void setUp() {
        System.out.println("setUpWell");

        narutoAnime = new Anime("Naruto",1999 );
        narutoPersonnage = new Personnage("Naruto-->Uzumaki (:)", 12,  narutoAnime, 500);

    }

    @AfterEach
    public void tearDown()
    {

    }
    @Test
    public void testCreeCompte() {
        // Test pour vérifier l'âge de l'anime en 2020
        String expectedUserName = "naruto_konoha"; // 2020 - 2002
        narutoPersonnage.creeCompte("naruto_konoha");
        String actualUserName = narutoPersonnage.getCompte().getUsername();
        assertEquals("naruto_konoha", expectedUserName, actualUserName);
    }


}
