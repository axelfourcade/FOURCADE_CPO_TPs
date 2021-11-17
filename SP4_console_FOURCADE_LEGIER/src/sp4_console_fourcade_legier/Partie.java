package sp4_console_fourcade_legier;

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
    Grille grilleJeu;
    
    public Partie (Joueur joueur1 , Joueur joueur2){
        ListeJoueurs[0]=joueur1;
        ListeJoueurs[1]=joueur2;
        joueurCourant = joueur1;
        
    }
    
    public void attribueCouleursAuxJoueurs(){
        ListeJoueurs[0].affecterCouleur("jaune");
        ListeJoueurs[1].affecterCouleur("rouge");
    }
    
    
    public void initialiserPartie(){
        grilleJeu.viderGrille();
        
        for (int i=1;i<=21;i++){
            Jeton jeton1 = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterJeton(jeton1);
            Jeton jeton2 = new Jeton(ListeJoueurs[0].Couleur);
            ListeJoueurs[0].ajouterJeton(jeton2);
        }
        
    }
    
    
}
