package mastermind_console_fourcade_legier;

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
    
    String [] tableauJeu = new String [4];
    String [] tableauFinal = new String [4];
    int [] tableauRes = new int [2];
    Scanner sc = new Scanner(System.in);
    Boule bouleCourante ;
    
    
    public void initialiserPartie(){
        
        int var ;
        
        for (int i=0;i<=3;i++){
            var = (int)(Math.random() * 6);
            bouleCourante.AffecterCouleur(var);
            tableauFinal[i] = bouleCourante.Couleur;
            System.out.print(tableauFinal[i]);
        }
        
    
    //System.out.println("Choisis la couleur de ta boule :\n1) Jaune\n2) Bleu\n3) Rouge\n4) Vert\n5) Blanc\n6) Noir");
    //tableauFinal[i] = sc.nextInt();    
    }
    
    
}