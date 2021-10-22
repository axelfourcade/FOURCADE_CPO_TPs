/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_fourcade_legier;

/**
 *
 * @author Axel
 */
public class BouteilleBiere {
    
    String nom = "";
    double degreAlcool ;
    String brasserie = "";
    boolean ouverte;

    BouteilleBiere(String leffe, double d, String abbaye_de_Leffe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


public void lireEtiquette() {
    
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
 
}

public BouteilleBiere(String unNom, float unDegre, String 
uneBrasserie) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

}

