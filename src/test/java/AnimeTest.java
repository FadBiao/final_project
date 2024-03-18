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

    }

    @AfterEach
    public void tearDown()
    {

    }
    @Test
    public void testcreeCompte() {
        // Test pour vérifier l'âge de l'anime en 2020
        String expectedUserName = "naruto_konoha"; // 2020 - 2002
        String actualUserName = narutoPersonnage.getCompte().getUsername();

        assertEquals("L'âge calculé de l'anime Naruto devrait être 18 en 2020.", expectedUserName, actualUserName);
    }


}
