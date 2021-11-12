package sp4_console_fourcade_legier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Joueur {
    
 String Nom ;
 String Couleur ;
 Jeton [] ListeJetons  = new Jeton [21];
 int nombreJetonsRestants ;
 int nombreDesintegrateurs;
 
 public Joueur (String nom){
     Nom = nom ;
 }
    
 public void affecterCouleur (String couleur){
    Couleur =couleur;
}   
    
public boolean ajouterJeton (Jeton jeton){
    
    for (int i=0;i<=21;i++){
        
        if (i==21){
            return false;
        }
        else if (ListeJetons [i] == null){
            ListeJetons [i] = jeton ;
            return true;   
        }
        
    }
    nombreJetonsRestants += 1 ;
}    
    
public 
    
    
    
}
