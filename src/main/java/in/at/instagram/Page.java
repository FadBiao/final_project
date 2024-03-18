package in.at.instagram;
import in.at.anime.Personnage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a description of class Page here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Page
{
    // instance variables - replace the example below with your own

    private String nomPage;
    private Set<Instagram> gestionnaires;


    public Page(String nomPage) {
        this.nomPage = nomPage;
        this.gestionnaires = new HashSet<>();
    }

    public void ajouterGestionnaire(Instagram compteInstagram) {
        gestionnaires.add(compteInstagram);
        //compteInstagram.ajouterPage(this);
    }

    public Set<Instagram> getGestionnaires() {
        return gestionnaires;
    }

    public String getNomPage() {
        return nomPage;
    }

}