package in.at.anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Write a description of class Anime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anime
{
    // instance variables - replace the example below with your own
    private int anneeCreation;
    private String titre;
    private ArrayList<Personnage> personnages;
    private Personnage persoPr;

    public Anime(String titre, int dateCreation) {
        this.titre = titre;
        this.anneeCreation = dateCreation;
        this.personnages = new ArrayList<>();
        this.persoPr = null;
    }

    /**
     * Constructor for objects of class Anime
     */
    public Anime()
    {
        personnages = new ArrayList<Personnage>();
    }

    public Anime(int date, String titre, Personnage persP)
    {
        personnages = new ArrayList<Personnage>();
        personnages.add(persP);
        anneeCreation = date;
        this.titre = titre;
        persoPr= persP;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(ArrayList<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Personnage getPersoPr() {
        return persoPr;
    }

    public void setPersoPr(Personnage persoPr) {
        this.persoPr = persoPr;
    }

    public void majPersonnagePrincipal() {
        persoPr = Collections.max(personnages, Comparator.comparingInt(Personnage::getForce));
    }

    public int ageAnime(int currentYear)
    {
        return currentYear - anneeCreation;
    }

    public void ajouterPersonnage(Personnage perso)
    {
        personnages.add(perso);
        majPersonnagePrincipal();
    }


}
