import java.util.Comparator;

public class Livres implements Comparable<Livres> {
    private String isbn, titre, sousTitre, auteur, maisonEdition;
    private int anneePublication;

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public int Comparer(Livres comparaison) {
        // ordre alphabetique .... a=97 et z=122
        //maison d' édition
        for (int i = 0; i < maisonEdition.length() && i < comparaison.maisonEdition.length();i++) {
            if (((int) maisonEdition.toLowerCase().charAt(i)) < ((int) comparaison.maisonEdition.toLowerCase().charAt(i))) {
                return 1;
            }
        }
        if (maisonEdition.length()<comparaison.maisonEdition.length()){
            return 1;
        }else if (maisonEdition.length()>comparaison.maisonEdition.length()){
            return 0;
        }else{
            //auteurs
            for (int i = 0; i < auteur.length() && i < comparaison.auteur.length();i++) {
                if (((int) auteur.toLowerCase().charAt(i)) < ((int) comparaison.auteur.toLowerCase().charAt(i))) {
                    return 1;
                }
            }
            if (auteur.length()<comparaison.auteur.length()){
                return 1;
            }else if (auteur.length()>comparaison.auteur.length()){
                return 0;
            }else{
                // Titre
                for (int i = 0; i < titre.length() && i < comparaison.titre.length();i++) {
                    if (((int) titre.toLowerCase().charAt(i)) < ((int) comparaison.titre.toLowerCase().charAt(i))) {
                        return 1;
                    }
                }
                if (titre.length()<comparaison.titre.length()){
                    return 1;
                }else if (titre.length()>comparaison.titre.length()){
                    return 0;
                }else{
                    // année de publication
                    if (anneePublication >comparaison.anneePublication){
                        return 1;
                    }
                    else{
                        return 0;
                }

            }
            }

        }
        }

    public Livres(String _isbn,String _titre,String _sousTitre,String _auteur,String _maisonEdition,int _anneePublication){
        isbn=_isbn;
        titre = _titre;
        sousTitre = _sousTitre;
        auteur = _auteur;
        maisonEdition = _maisonEdition;
        anneePublication = _anneePublication;
    }
}