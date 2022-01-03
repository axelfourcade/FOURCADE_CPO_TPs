package mastermind_console_fourcade_legier;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TP4 
 * Axel FOURCADE , Noa LEGIER
 * 12/11/2021
 */

/**
 *
 * @author Axel
 */
public class Partie {
    
    Grille grillejeu = new Grille();
    
    public Partie(){
    
        
    }
    
    public void initialiserPartie(){
        
        grillejeu.viderGrille();
  
    }
    
    public void debuterPartie(){
        
        Scanner sc = new Scanner(System.in);
        
        int nb_boulemalplace = 0;
        int nb_bouleexact = 0;
        int nb_tentative = 0;
        int [] tab = new int [2];
        int difficulte = 0;

        System.out.println("Choisissez le niveau de difficulté :");          //la grille utilisé sera la meme selon la difficulte, on affiche plus ou moins de ligne
        System.out.println("1) Mode normale en 12 essais\n2) Mode hardcore en 6 essais");
        difficulte = sc.nextInt();

        
        if (difficulte==1){
        grillejeu.afficherGrilleSurConsole();
        
        while (nb_bouleexact!=4 && nb_tentative < 12){
            
            grillejeu.choisirCombinaison(nb_tentative);
            
            grillejeu.afficherGrilleSurConsole();
            
            tab = grillejeu.etreGagnant(nb_tentative);
            nb_bouleexact = tab [0];
            nb_boulemalplace = tab [1];
            
            System.out.println("Vous avez " + nb_bouleexact + " boules placées correctement");
            System.out.println("Vous avez " + nb_boulemalplace + " boules de la bonne couleur qui sont mal placées");
            
            nb_tentative += 1;
        }
        if (nb_bouleexact == 4 ){
            System.out.println("Bravo !!!! Vous êtes parvenu à trouver la bonne combinason");
        }
        else {
            System.out.println("C'est perdu ... Retentez votre chance une prochaine fois");
        }
        }
        
        
        if (difficulte==2){
        grillejeu.afficherGrilleSurConsoleVdifficile();
        
        while (nb_bouleexact!=4 && nb_tentative < 6){
            
            grillejeu.choisirCombinaison(nb_tentative);
            
            grillejeu.afficherGrilleSurConsoleVdifficile();
            
            tab = grillejeu.etreGagnant(nb_tentative);
            nb_bouleexact = tab [0];
            nb_boulemalplace = tab [1];
            
            System.out.println("Vous avez " + nb_bouleexact + " boules placées correctement");
            System.out.println("Vous avez " + nb_boulemalplace + " boules de la bonne couleur qui sont mal placées");
            
            nb_tentative += 1;
        }
        if (nb_bouleexact == 4 ){
            System.out.println("Bravo !!!! Vous êtes parvenu à trouver la bonne combinason");
        }
        else {
            System.out.println("C'est perdu ... Retentez votre chance une prochaine fois");
        }
        }
    }
}
