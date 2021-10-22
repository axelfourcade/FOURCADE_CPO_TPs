/**
 * TP1 exercice 1
 * Axel FOURCADE , Noa LEGIER
 * 22/10/2021
 */
package tp2_bieres_fourcade_legier;

/**
 *
 * @author Axel
 */
public class TP2_bieres_FOURCADE_LEGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//BouteilleBiere uneBiere = new BouteilleBiere() ;

//uneBiere.nom = "Cuvée des trolls";
//uneBiere.degreAlcool = 7.0 ;
//uneBiere.brasserie = "Dubuisson";
//uneBiere.ouverte = false;

BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson") ;

uneBiere.lireEtiquette();

BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 
,"Abbaye de Leffe") ;

autreBiere.lireEtiquette();




    }
    
}
