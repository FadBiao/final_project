package in.at.anime;

import in.at.Message;
import in.at.instagram.Instagram;

import java.util.ArrayList;
import java.util.List;

public class Personnage
{

    private String nom;
    private int age;
    private Anime anime;
    private boolean estPrincipal;
    private int force;

    private Instagram compte;

    private List<Message> boiteDeReception;

   /* public Personnage(String nom, int age, Anime anime, int force, Instagram compte) {
        this.nom = nom;
        this.age = age;
        this.anime = anime;
        this.estPrincipal = false; // Initialisé à false, sera déterminé par l'anime
        this.force = force;
        this.compte = compte;
        compte.setPersonnage(this);
        anime.ajouterPersonnage(this);
        this.boiteDeReception = new ArrayList<>();
    }*/

    public Personnage(String nom, int age, Anime anime, int force)
    {
        this.nom = nom;
        this.age = age;
        this.anime = anime;
        this.estPrincipal = false; // Initialisé à false, sera déterminé par l'anime
        this.force = force;
        compte = null;
        anime.ajouterPersonnage(this);
        this.boiteDeReception = new ArrayList<>();
    }

    public void envoyerMessage(Personnage destinataire, String contenu) {
        Message message = new Message(this, destinataire, contenu);
        destinataire.recevoirMessage(message);
    }

    public void recevoirMessage(Message message) {
        boiteDeReception.add(message);
    }
    public void majStatutPrincipal() {
        estPrincipal = this.equals(anime.getPersoPr());
        if (estPrincipal) {
            force = compte.getNombreFollowers();
        }
    }


    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEstPrincipal() {
        return estPrincipal;
    }

    public void setEstPrincipal(boolean estPrincipal) {
        this.estPrincipal = estPrincipal;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }



    public Instagram getCompte() {
        return compte;
    }

    public void setCompte(Instagram compte) {
        this.compte = compte;
    }

    /**
     * Constructor for objects of class Personnage
     */
    public Personnage()
    {
        force = 0;
        estPrincipal = false;
    }


    public Instagram getCompteInstagram() {
        return compte;
    }


    public void creeCompte(String username){
        if( compte !=null){
            System.out.println("impossible d'avoir plusieurs comptes");
        }else {
            Instagram c = new Instagram(username);
            c.setPersonnage(this);
            this.setCompte(c);
        }

    }



}

