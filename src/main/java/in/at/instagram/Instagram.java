package in.at.instagram;

import in.at.anime.Personnage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a description of class Instagram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instagram
{
    // instance variables - replace the example below with your own

    ArrayList <Page> pages = new ArrayList<Page>();


    ArrayList  <Personnage>   suivi_e_s = new ArrayList<Personnage>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private Personnage personnage;
    private Set<Instagram> followers;

    /**
     * Constructor for objects of class Instagram
     */
    public Instagram()
    {

    }

    public Instagram(String username) {
        this.username = username;
        this.followers = new HashSet<>();
    }

    public void suivre(Instagram autreCompte) {
        autreCompte.getFollowers().add(this);
        personnage.getAnime().majPersonnagePrincipal(); // Assure que l'anime met à jour son personnage principal si nécessaire
    }

    public Set<Instagram> getFollowers() {
        return followers;
    }

    public int getNombreFollowers() {
        return followers.size();
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public void ajouterPage(String nomPage) {
        Page p = new Page(nomPage);
        p.ajouterGestionnaire(this);
        pages.add(p);
    }
}