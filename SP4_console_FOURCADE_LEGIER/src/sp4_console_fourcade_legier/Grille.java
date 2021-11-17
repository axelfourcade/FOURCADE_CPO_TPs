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
    }
       
    
    public boolean celluleOccupee(int ligne , int colonne){

        if(CellulesJeu[ligne][colonne].jetonCourant !=null){
            return true;
        }
        return false;   
    }
    
    public String lireCouleurDuJeton (int ligne , int colonne){
        return CellulesJeu[ligne][colonne].jetonCourant.lireCouleur();
    }

            
    public boolean etreGagnantPourJoueur( Joueur joueur) {
        for(int i =0;i<=5;i++){
            for(int j =0;j<= 6;j++){
             
               if (  (j<=3) && (joueur.Couleur.equals(lireCouleurDuJeton(i,j))) && (joueur.Couleur.equals(lireCouleurDuJeton(i,j+1))) && joueur.Couleur.equals(lireCouleurDuJeton(i,j+2)) && joueur.Couleur.equals(lireCouleurDuJeton(i,j+3))     ){
                   System.out.println("Colonne x4");
                   return true ;
               }
               if (  (j<=3)&&(i<=2) && (joueur.Couleur.equals(lireCouleurDuJeton(i,j))) && (joueur.Couleur.equals(lireCouleurDuJeton(i+1,j+1))) && joueur.Couleur.equals(lireCouleurDuJeton(i+2,j+2)) && joueur.Couleur.equals(lireCouleurDuJeton(i+3,j+3))     ){
                   System.out.println("Colonne x4");
                   return true ;
               }
               if (  (i<=2) && (joueur.Couleur.equals(lireCouleurDuJeton(i,j))) && (joueur.Couleur.equals(lireCouleurDuJeton(i+1,j))) && joueur.Couleur.equals(lireCouleurDuJeton(i+2,j)) && joueur.Couleur.equals(lireCouleurDuJeton(i+3,j))     ){
                   System.out.println("Colonne x4");
                   return true ;}
               if (  (j>=3)&&(i<+2) && (joueur.Couleur.equals(lireCouleurDuJeton(i,j))) && (joueur.Couleur.equals(lireCouleurDuJeton(i-1,j+1))) && joueur.Couleur.equals(lireCouleurDuJeton(i-2,j+2)) && joueur.Couleur.equals(lireCouleurDuJeton(i-3,j+3))     ){
                   System.out.println("Colonne x4");
                   return true ;
               }
             }
        }
        return false ;

}
   
 public void tasserGrille(int colonne,int ligne)  {
     for(int i =0;i>=ligne ;i++) {
         CellulesJeu[i][colonne].jetonCourant = CellulesJeu[i+1][colonne].jetonCourant;
     }
     
 }
    

    
    
    
    
}

