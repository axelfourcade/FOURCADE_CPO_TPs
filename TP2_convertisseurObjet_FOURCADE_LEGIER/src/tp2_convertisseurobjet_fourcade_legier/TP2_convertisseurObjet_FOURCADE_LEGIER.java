/**
 * TP1 exercice 1
 * Axel FOURCADE , Noa LEGIER
 * 06/11/2021
 */
package tp2_convertisseurobjet_fourcade_legier;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class TP2_convertisseurObjet_FOURCADE_LEGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double valeur;
                
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une température : ");
        valeur = sc.nextDouble();
        
        Convertisseur convertisseur = new Convertisseur();
        
        //convertisseur.CelciusVersKelvin(valeur);
        //convertisseur.FarenheitVersKelvin(valeur);
        //convertisseur.KelvinVersFarenheit(valeur);
        
        //Convertisseur convertisseur2 = new Convertisseur();

        //convertisseur2.FarenheitVersCelcius(valeur);
        //convertisseur2.CelciusVersFarenheit(valeur);
        
        //System.out.println(convertisseur.toString());
        //System.out.println(convertisseur2.toString());

        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius \n4) De Celcius vers Farenheit \n5) De kelvin vers Farenheit \n6) De Farenheit vers Kelvin");
        int choix = sc.nextInt();
    
        if (choix == 1) {
        System.out.println(valeur + " degré Celcius est égale à " + convertisseur.CelciusVersKelvin ( valeur) + " degré Kelvin");
        }
        else if (choix == 2){
        System.out.println(valeur + " degré Kelvin est égale à " + convertisseur.KelvinVersCelcius ( valeur) + " degré Celcius");
        }
        else if (choix == 3){
        System.out.println(valeur + " degré Farenheit est égale à " + convertisseur.FarenheitVersCelcius ( valeur) + " degré Celcius");
        }
        else if (choix == 4){
        System.out.println(valeur + " degré Celcius est égale à " + convertisseur.CelciusVersFarenheit ( valeur) + " degré Farenheit");
        }
        else if (choix == 5){
        System.out.println(valeur + " degré Kelvin est égale à " + convertisseur.KelvinVersFarenheit ( valeur) + " degré Farenheit");
        }
        else if (choix == 6){
        System.out.println(valeur + " degré Farenheit est égale à " + convertisseur.FarenheitVersKelvin ( valeur) + " degré Kelvin");
        }
        else{
        System.out.println("error");
        }
        }
        
        
        
        
        
        
    }
