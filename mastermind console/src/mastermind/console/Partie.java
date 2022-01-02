package mastermind.console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Partie {
    
    Grille grillejeu = new Grille();
    
    public Partie(){
    
        
    }
    
    public void initialiserPartie(){
        
        grillejeu.viderGrille();
  
    }
    
    public void debuterPartie(){
        
        int nb_boulemalplace = 0;
        int nb_bouleexact = 0;
        
        grillejeu.afficherGrilleSurConsole();
        
        
    }
    
    
}
