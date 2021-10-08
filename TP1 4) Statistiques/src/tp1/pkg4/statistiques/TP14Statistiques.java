/**
 * TP1 exercice 1
 * Axel FOURCADE , Noa LEGIER
 * 07/10/2021
 */
package tp1.pkg4.statistiques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class TP14Statistiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int tab[] = new int[6] ;
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisir le nombre de lancé :");
    int m = sc.nextInt();
    int i = 0;
    while (i<=m-1) {
        Random r = new Random();
        int n = r.nextInt(6);
        tab[n]+= 1 ;
        i+=1 ;
    }
    
    double t[] = new double[6] ;
    for (int a = 0 ; a<6;a++) {
        t[a]= tab[a]*100/m ;
    }
    
    for (i=1;i<7;i++){
        
        System.out.println("Nous avons obtenu " + t[i-1] + "% de " + i);
    }
    
   
        
    }
    
}
