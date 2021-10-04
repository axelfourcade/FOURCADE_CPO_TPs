/**
 * TP1 exercice 1
 * Axel FOURCADE
 * 04/10/2021
 */
package tp1.exo2;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class TP1Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    double valeur;
                
    Scanner sc = new Scanner(System.in);
    System.out.println("Bonjour, saisissez une valeur : ");
    valeur = sc.nextDouble();    
    //System.out.println("\nLa température est : " + valeur);
       
    //valeur += 273.15;
    //System.out.println("\nLa température en degré Kelvin est : " + valeur);
        
    //System.out.println(valeur + " degré Celcius est égale à " + CelciusVersKelvin ( valeur) + " degré Kelvin");
    //System.out.println(valeur + " degré Kelvin est égale à " + KelvinVersCelcius ( valeur) + " degré Celcius");
    //System.out.println(valeur + " degré Farenheit est égale à " + FarenheitVersCelcius ( valeur) + " degré Celcius");
    //System.out.println(valeur + " degré Celcius est égale à " + CelciusVersFarenheit ( valeur) + " degré Farenheit");
    //System.out.println(valeur + " degré Kelvin est égale à " + KelvinVersFarenheit ( valeur) + " degré Farenheit");
    //System.out.println(valeur + " degré Farenheit est égale à " + FarenheitVersKelvin ( valeur) + " degré Kelvin");
    
    System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Farenheit vers Celcius \n4) De Celcius vers Farenheit \n5) De kelvin vers Farenheit \n6) De Farenheit vers Kelvin");
    int choix = sc.nextInt();
    
    if (choix == 1) {
        System.out.println(valeur + " degré Celcius est égale à " + CelciusVersKelvin ( valeur) + " degré Kelvin");
    }
    else if (choix == 2){
        System.out.println(valeur + " degré Kelvin est égale à " + KelvinVersCelcius ( valeur) + " degré Celcius");
    }
    else if (choix == 3){
        System.out.println(valeur + " degré Farenheit est égale à " + FarenheitVersCelcius ( valeur) + " degré Celcius");
    }
    else if (choix == 4){
        System.out.println(valeur + " degré Celcius est égale à " + CelciusVersFarenheit ( valeur) + " degré Farenheit");
    }
    else if (choix == 5){
        System.out.println(valeur + " degré Kelvin est égale à " + KelvinVersFarenheit ( valeur) + " degré Farenheit");
    }
    else if (choix == 6){
        System.out.println(valeur + " degré Farenheit est égale à " + FarenheitVersKelvin ( valeur) + " degré Kelvin");
    }
    else{
        System.out.println("error");
    }
    }
    


    public static double CelciusVersKelvin ( double tempCelcius) {

    double tempKelvin = tempCelcius + 273.15;
    return tempKelvin;
            }
  
    public static double KelvinVersCelcius ( double tempKelvin) {

    double tempCelcius = tempKelvin - 273.15;
    return tempCelcius;
            }
    
    public static double FarenheitVersCelcius ( double tempFar) {

    double tempCelcius = 5.0 / 9 * ( tempFar - 32 );
    return tempCelcius;
            }
    
    public static double CelciusVersFarenheit ( double tempCelcius) {

    double tempFar = 9.0 / 5 * tempCelcius + 32 ;
    return tempFar;
            }
    
    public static double  KelvinVersFarenheit ( double tempKelvin) {

    double tempFar = 9.0 / 5 * tempKelvin - 459.67 ;
    return tempFar;
            }
    
    public static double  FarenheitVersKelvin ( double tempFar) {

    double tempKelvin = 5.0 / 9 * ( tempFar + 459.67 );
    return tempKelvin;
            }
    
    
    
    
    
    
    
    
}