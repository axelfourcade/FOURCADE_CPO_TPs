/**
 * TP1 exercice 1
 * Axel FOURCADE , Noa LEGIER
 * 06/11/2021
 */
package tp2_convertisseurobjet_fourcade_legier;

/**
 *
 * @author Axel
 */
public class Convertisseur {
     
    int nbConversions;
    
    public Convertisseur () {
    nbConversions = 0 ;
    }
    
    
    public double CelciusVersKelvin ( double tempCelcius) {

    double tempKelvin = tempCelcius + 273.15;
    nbConversions += 1;
    return tempKelvin;
            }
  
    public double KelvinVersCelcius ( double tempKelvin) {

    double tempCelcius = tempKelvin - 273.15;
    nbConversions += 1;
    return tempCelcius;
            }
    
    public double FarenheitVersCelcius ( double tempFar) {

    double tempCelcius = 5.0 / 9 * ( tempFar - 32 );
    nbConversions += 1;
    return tempCelcius;
            }
    
    public double CelciusVersFarenheit ( double tempCelcius) {

    double tempFar = 9.0 / 5 * tempCelcius + 32 ;
    nbConversions += 1;
    return tempFar;
            }
    
    public double  KelvinVersFarenheit ( double tempKelvin) {

    double tempFar = 9.0 / 5 * tempKelvin - 459.67 ;
    nbConversions += 1;
    return tempFar;
            }
    
    public double  FarenheitVersKelvin ( double tempFar) {

    double tempKelvin = 5.0 / 9 * ( tempFar + 459.67 );
    nbConversions += 1;
    return tempKelvin;
            }
    
    @Override
    public String toString () {
    
    return "nb de conversions : "+ nbConversions;
    }
}
