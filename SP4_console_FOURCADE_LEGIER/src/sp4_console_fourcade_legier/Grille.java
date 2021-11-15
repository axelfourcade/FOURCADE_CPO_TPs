/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_fourcade_legier;

/**
 *
 * @author Axel
 */
public class Grille {

    Cellule[][] CellulesJeu= new Cellule[6][7];
    
    public Grille(){
       for(int i =0;i<=5;i++){
            for(int j =0;j<= 6;j++){
                CellulesJeu[i][j]= new Cellule () ;
            } 
       }
    }
    
    public boolean ajouterJetonDansColonne(Jeton jeton,int colonne) {
        
        for (int i = 5; i >=0 ; i--){
            if (CellulesJeu[i][colonne].jetonCourant == null){
                CellulesJeu[i][colonne].jetonCourant = jeton;
                return true;
            }
        }
        return false;
    }
    
    public boolean etreRemplie(){
        
         for(int i =0;i<=5;i++){
            for(int j =0;j<= 6;j++){
                if (CellulesJeu[i][j].jetonCourant == null){
                return false;
                }
            }
        }
        return true;
    }
    
    
    public void viderGrille(){
        for(int i =0;i<=5;i++){
            for(int j =0;j<= 6;j++){
                CellulesJeu[i][j].jetonCourant = null;
                CellulesJeu[i][j].trouNoir = false ;
                CellulesJeu[i][j].desintegrateur = false ;
            }
    }
}
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    //System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);

    
    public void afficherGrilleSurConsole() {
        for(int i =0;i<=5;i++){
            for(int j =0;j<= 6;j++){
                
                if (CellulesJeu[i][j].jetonCourant == null){
                    System.out.println(" ");
                }
                if ("rouge".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.println("R");
                }
                if ("jaune".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.println("J");
            }
        }
    }    
       
    
    public boolean celluleOccupee (int ligne, int colonne){
        if (CellulesJeu[ligne][colonne]!=null){
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
}
