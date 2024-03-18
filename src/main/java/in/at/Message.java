package in.at;

import in.at.anime.Personnage;

public class Message {
    private Personnage emetteur;
    private Personnage destinataire;
    private String contenu;

    public Message(Personnage emetteur, Personnage destinataire, String contenu) {
        this.emetteur = emetteur;
        this.destinataire = destinataire;
        this.contenu = contenu;
    }

    // Getters
    public Personnage getEmetteur() {
        return emetteur;
    }

    public Personnage getDestinataire() {
        return destinataire;
    }

    public String getContenu() {
        return contenu;
    }
}
