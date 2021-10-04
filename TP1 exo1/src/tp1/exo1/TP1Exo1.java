/*
 * TP1 exercice 1
 * Axel FOURCADE
 * 04/10/2021
 */
package tp1.exo1;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class TP1Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int valeur1;
        int valeur2;
                
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer la première valeur : ");
        valeur1 = sc.nextInt();
        System.out.println("\n Entrer la seconde valeur : ");
        valeur2 = sc.nextInt();
        
        System.out.println("\nLa première valeur est : " + valeur1 + "\nLa seconde valeur est : " + valeur2);
   
        int somme = valeur1 + valeur2;
        System.out.println("La somme de ces deux nombres est : " + somme);
        
        int difference = valeur1 - valeur2;
        System.out.println("La différence entre ces deux nombres est : " + difference);

        int produit = valeur1 * valeur2;
        System.out.println("Le produit de ces deux nombres est : " + produit);

        double quotient = valeur1 / (valeur2 * 1.0);
        System.out.println("Le quotient de ces deux nombres est : " + quotient);
 
        int reste = valeur1 % valeur2;
        System.out.println("Le reste de la division euclidienne du premier par le second est : " + reste);

        
        
        
        
        
        
    
    }
    
}
