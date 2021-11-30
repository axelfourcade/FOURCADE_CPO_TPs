/**
 * TP3 console
 * Axel FOURCADE , Noa LEGIER
 * 12/11/2021
 */
package sp4_console_fourcade_legier;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class SP4_console_FOURCADE_LEGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
System.out.println("Joueur 1 quel est ton nom ?");
String joueur1 = sc.next();
System.out.println("Joueur 2 quel est ton nom ?");
String joueur2 = sc.next();

Joueur j1 = new Joueur (joueur1);
Joueur j2 = new Joueur (joueur2);

Partie partie = new Partie(j1,j2);
partie.attribueCouleursAuxJoueurs();
partie.initialiserPartie();
partie.debuterPartie();



    }
    
}
