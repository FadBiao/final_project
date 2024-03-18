package in.at;

import in.at.anime.Anime;
import in.at.anime.Personnage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Anime DB = new Anime("Dragon Ball", 1997);
        Anime NH = new Anime("Naruto Uzumaki", 2000);

        Personnage san = new Personnage("Sangoku",12,DB, 500);
        Personnage naruto = new Personnage("Naruto",15,NH, 550);
        san.creeCompte("goku");
        naruto.creeCompte("Uzumaki");

    }
}