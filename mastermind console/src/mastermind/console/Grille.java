package mastermind.console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Grille {
    
    Boule [][] tabJeu = new Boule[12][4];

    public Grille() {
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 3; j++) {
                tabJeu[i][j] = null;
            }
        }
    }
    
    public void viderGrille(){
        for(int i =0;i<=11;i++){
            for(int j =0;j<=3;j++){
                tabJeu[i][j] = null;
            }
    }
    }
    
    
    
    
}
