import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //liste un a un
        ArrayList<Livres> liste = new ArrayList<Livres>();
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "aaa", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "baa", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "aba", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "abb", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "bab", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "aaab", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "aaa", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "bab", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "aaa", 2001));
        Ajouter(liste,new Livres("154315","abcd","abcd","tremblay", "caa", 2001));
        for(int i=0;i<liste.size();i++) {
            System.out.print(liste.get(i).getMaisonEdition()+"\n");
        }
        // trier
        }
        public static void Ajouter(ArrayList liste, Livres ajout){
        boolean ajouter = false;
            if(liste.size()==0){
                liste.add(ajout);
                ajouter = true;
            }else {
                for (int i = 0; i < liste.size()&& !ajouter; i++){
                    if (ajout.Comparer((Livres) liste.get(i)) == 1) {
                        liste.add(i, ajout);
                        ajouter = true;
                    }
                }
            }
            if(!ajouter){
                liste.add(ajout);
            }
    }
}

