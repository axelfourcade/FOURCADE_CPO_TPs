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
    
    Cellule [][] tabJeu = new Cellule[12][4];

    public Grille() {
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 3; j++) {
                tabJeu[i][j] = new Cellule ();
            }
        }
    }
    
    public void viderGrille(){
        for(int i =0;i<=11;i++){
            for(int j =0;j<=3;j++){
                tabJeu[i][j].bouleCourante = null;
            }
    }
    }
    
    public void afficherGrilleSurConsole() {
        
        for (int i=0;i<=11;i++){
            System.out.println("-------------");
            System.out.println("|");
            for(int j =0;j<= 3;j++){
                if(tabJeu[i][j].bouleCourante == null){
                    System.out.println("  |");
                }
                
            }
        }
    }
    
    
    
    
    
    
    
    public String lireCouleurBoule (int ligne , int colonne){
        if (tabJeu[ligne][colonne].bouleCourante == null){
            return "vide";
        }
        return tabJeu[ligne][colonne].bouleCourante.lireCouleur();
    }
    
    public boolean etreGagnant(){
        return false;
    }
}
