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
        int nb_tentative = 0;
        int [] tab = new int [2];
                
        grillejeu.afficherGrilleSurConsole();
        
        while (nb_bouleexact!=4 || nb_tentative <= 12){
            
        
            
            
            
            tab = grillejeu.etreGagnant(nb_tentative);
            nb_bouleexact = tab [0];
            nb_boulemalplace = tab [1];
            
            nb_tentative += 1;
        }
    }
}
