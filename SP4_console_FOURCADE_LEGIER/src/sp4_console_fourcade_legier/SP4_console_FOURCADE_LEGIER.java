/**
 * TP3 console
 * Axel FOURCADE , Noa LEGIER
 * 12/11/2021
 */
package sp4_console_fourcade_legier;

/**
 *
 * @author Axel
 */
public class SP4_console_FOURCADE_LEGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Jeton j = new Jeton ("rouge");
System.out.println(j.lireCouleur());
Cellule c = new Cellule();
System.out.println(c.lireCouleurDuJeton());
c.affecterJeton(j);
System.out.println(c.lireCouleurDuJeton());
Grille g = new Grille();
g.afficherGrilleSurConsole();
g.ajouterJetonDansColonne(j,6);
g.afficherGrilleSurConsole();

    }
    
}
