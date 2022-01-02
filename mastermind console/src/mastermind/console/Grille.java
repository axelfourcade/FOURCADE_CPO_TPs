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
            System.out.println("| ");
            for(int j =0;j<= 3;j++){
                if(tabJeu[i][j].bouleCourante == null){
                    System.out.print("  |");
                }
                else if ("rouge".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("R |");
                }
                else if ("jaune".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("J |");
                }
                else if ("bleu".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("B |");
                }
                else if ("vert".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("V |");
                }
                else if ("cyan".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("C |");
                }
                else if ("rose".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("P |");
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
