package tp2_relation_1_fourcade_legier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Personne {
    
String nom;
String prenom;
int nbVoitures ;
Voiture [] liste_voitures ;


public Personne (String Nom , String Prenom){
    nom = Nom;
    prenom = Prenom;
    liste_voitures = new Voiture [3] ;
    nbVoitures = 0;
}    
   


@Override
public String toString() {
    
    String chaine_a_retourner;
    chaine_a_retourner = nom + prenom; 
    
    return chaine_a_retourner ;
}   
    
    
}
