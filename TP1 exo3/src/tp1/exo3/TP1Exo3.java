/**
 * TP1 exercice 1
 * Axel FOURCADE
 * 07/10/2021
 */
package tp1.exo3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class TP1Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Random generateurAleat = new Random();
    
    int n1 = generateurAleat.nextInt(100);
    int n2 = generateurAleat.nextInt(100);
    int n3 = generateurAleat.nextInt(100);
    int n4 = generateurAleat.nextInt(100);
    int n5 = generateurAleat.nextInt(100);

    System.out.println("Voici 5 nombres aléatoires : " + n1 + " ; " + n2 + " ; " + n3 + " ; " + n4 + " ; " + n5);

    int dif = 0;
    System.out.println("Veuillez choisir la difficulté : \n1) Facile \n2) Normale \n3) Difficile");
    Scanner sc = new Scanner(System.in);
    dif = sc.nextInt();
    
    if (dif == 2){
    
    int n = generateurAleat.nextInt(100);
    int rep = 101;
    int cpt = 0;
    
    while (rep != n) {
        
        
        System.out.println("\nSaisissez un nombre entre 0 et 100 : ");
        rep = sc.nextInt();
        
        cpt += 1;
        
        if (rep < n){
            System.out.println("\ntrop petit");
        }
        else if (rep > n){
            System.out.println("\ntrop grand");
        }
        else{
            System.out.println("\ngagné");
        }
    }
    
    System.out.println("\nVous avez réussi en " + cpt + " tentatives");
    }
    
    else if (dif == 1){
    
    int n = generateurAleat.nextInt(20);
    int rep = 101;
    int cpt = 0;
    
    while (rep != n) {
        
        
        System.out.println("\nSaisissez un nombre entre 0 et 20 : ");
        rep = sc.nextInt();
        
        cpt += 1;
        
        if (rep < n){
            System.out.println("\ntrop petit");
        }
        else if (rep > n){
            System.out.println("\ntrop grand");
        }
        else{
            System.out.println("\ngagné");
        }
    }
    
    System.out.println("\nVous avez réussi en " + cpt + " tentatives");
    }
    
    else{
    
    int n = generateurAleat.nextInt(100);
    int rep = 101;
    int cpt = 0;
    
    System.out.println("\nVous avez 10 tentatives pour trouver le nombre, bonne chance ! ");
    
    while (rep != n) {
        
        if (cpt < 10){
            
        System.out.println("\nIl vous reste " + (10-cpt) + " tentatives");    
        System.out.println("\nSaisissez un nombre entre 0 et 100 : ");
        rep = sc.nextInt();
        
        cpt += 1;
        
        if (rep < n){
            System.out.println("\ntrop petit");
        }
        else if (rep > n){
            System.out.println("\ntrop grand");
        }
        else{
            System.out.println("\ngagné");
            System.out.println("\nVous avez réussi en " + cpt + " tentatives");
        }      
    }
        else {
            System.out.println("\nvous n'avez plus de tentatives, c'est perdu");
            rep = n;
        }
    }
    
    }
    }
}
