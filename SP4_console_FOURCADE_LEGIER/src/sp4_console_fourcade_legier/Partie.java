package sp4_console_fourcade_legier;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Partie {
    
    Joueur [] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    
    public Partie (Joueur joueur1 , Joueur joueur2){
        ListeJoueurs[0]=joueur1;
        ListeJoueurs[1]=joueur2;
        joueurCourant = ListeJoueurs[1];
        
    }
    
    public void attribueCouleursAuxJoueurs(){
        ListeJoueurs[0].affecterCouleur("jaune");
        ListeJoueurs[1].affecterCouleur("rouge");
    }
    
    
    public void initialiserPartie(){
        
        grilleJeu.viderGrille();
        
        Jeton jeton1 = new Jeton (ListeJoueurs[0].Couleur);
        ListeJoueurs[0].ajouterJeton(jeton1);
        Jeton jeton2 = new Jeton (ListeJoueurs[1].Couleur);
        ListeJoueurs[1].ajouterJeton(jeton2);          
    }
    
    
    public void debuterPartie(){
       
        Scanner sc = new Scanner(System.in);
        int colonne;
        grilleJeu.afficherGrilleSurConsole();
            
        while(grilleJeu.etreGagnantPourJoueur(joueurCourant) == false && grilleJeu.etreRemplie()== false) {
            
            if (joueurCourant == ListeJoueurs[0]){
            joueurCourant = ListeJoueurs[1];
            }
            else{                             //de mettre cet boucle en premier permet de verifier dès q'un joueur à joué
            joueurCourant = ListeJoueurs[0];  //au premier tour cest joueur1 qui joue
            }
            
            
            System.out.println("Saisissez la colonne :");
            colonne = sc.nextInt();
            
            while(colonne<1 || colonne >7 ||grilleJeu.colonneRemplie(colonne)==true){
                System.out.println("Saisissez la colonne :");
                colonne = sc.nextInt();
            }
            
            Jeton jetonCourant = null;
            for (int i=0;i<=20;i++){
               if (joueurCourant.ListeJetons[20-i] != null){
                   jetonCourant = joueurCourant.ListeJetons[20-i];
                   break;
               }
           }
           grilleJeu.ajouterJetonDansColonne(jetonCourant, colonne);
           grilleJeu.afficherGrilleSurConsole();
            
        }
     
        System.out.println("La partie est terminée !");
    }      
  
    
    
    
    
    
    
}
