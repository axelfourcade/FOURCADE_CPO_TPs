/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console_fourcade_legier;

import java.util.Scanner;

/**
 *
 * @author Legier
 */
public class Grille {
    
    Cellule [][] tabJeu = new Cellule[12][4];
    Cellule [] tabVerif = new Cellule [4];        //on utilise un second tableau pour verifier la combinaison 
    combinaisonmystere Combinaison = new combinaisonmystere();
    
    public Grille() {
        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <= 3; j++) {
                tabJeu[i][j] = new Cellule ();
            }
        }
        for (int j=0;j<=3;j++){
            tabVerif [j]= new Cellule();
        }
    }
    
    public void viderGrille(){
        for(int i =0;i<=11;i++){
            for(int j =0;j<=3;j++){
                tabJeu[i][j].bouleCourante = null;
            }
        }
        for (int j=0;j<=3;j++){
            tabVerif [j].bouleCourante = null;
        }
    }
    
    public void choisirCombinaison(int ligne){
        
        Scanner sc = new Scanner(System.in);
        
        int choix =-1;
        String couleur = null;
        
        for (int i=0;i<=3;i++){
            
            
            //System.out.println(Combinaison.tableauCombinaison[i].Couleur);
            System.out.println("Veuillez choisir la couleur de la prochaine boule pour votre combinaison :");
            System.out.println("Rappel : La combinaison est composée de 4 couleures DIFFERENTES");
            System.out.println("0) cyan\n1) jaune\n2) bleu\n3) rouge\n4) vert\n5) rose");
            choix = sc.nextInt();
            
            switch (choix) {
                case 1 -> couleur = "jaune";
                case 2 -> couleur = "bleu";    //selon le choix de couleur on creer une nouvelle boule que l'on place dans notre grille de jeu 
                case 3 -> couleur = "rouge";
                case 4 -> couleur = "vert";
                case 5 -> couleur = "rose";
                case 0 -> couleur = "cyan";
                default -> {
                }
            }
            
            Boule boule = new Boule(couleur);
            tabJeu[ligne][i].affecterBoule(boule);
            tabVerif[i].affecterBoule(boule);   //a chaque tour le tableau de verification prend la combinaison du joueur
        }
    }
    
    public void afficherGrilleSurConsole() {
        
        for (int i=0;i<=11;i++){
            System.out.println("-------------");
            
            for(int j =0;j<= 3;j++){
                if(tabJeu[i][j].bouleCourante == null){
                    System.out.print("|  ");
                }
                else if ("rouge".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| R");
                }
                else if ("jaune".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| J");
                }
                else if ("bleu".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| B");
                }
                else if ("vert".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| V");
                }
                else if ("cyan".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| C");
                }
                else if ("rose".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| P");
                }
            }
        System.out.println("|");
        }
        System.out.println("-------------");
    }
      
    
    public String lireCouleurBoule (int ligne , int colonne){
        if (tabJeu[ligne][colonne].bouleCourante == null){
            return "vide";
        }
        return tabJeu[ligne][colonne].bouleCourante.lireCouleur();
    }
    
    
    public int [] etreGagnant (int ligne){
        
        int cpt1 = 0;  //ce compteur permet de savoir combien de boule sont exactement placées
        int cpt2 = 0;  //celui ci compte le nombre de boule de la bonne couleur mal placées 
        int [] tab = new int [2];
        
        for (int j = 0; j <= 3; j++) {        //dans un premier temps on verifie les boules placées correctement 
            if(tabVerif[j].lireCouleurBoule()==Combinaison.tableauCombinaison[j].lireCouleur()){
                cpt1 += 1;
                tabVerif[j].bouleCourante=null;  //on supprime les boules correct pour ne pas les compter en double
            }
        }
        
        if (tabVerif[0].bouleCourante!=null){  //dans un second temps on verifie les boules mal placées qui sont de la bonne couleur
            if(tabVerif[0].lireCouleurBoule()==Combinaison.tableauCombinaison[1].lireCouleur()){
                cpt2 += 1;
                tabVerif[0].bouleCourante=null;
            }
            else if (tabVerif[0].lireCouleurBoule()==Combinaison.tableauCombinaison[2].lireCouleur()){
                cpt2 += 1;
                tabVerif[0].bouleCourante=null;
            }
            else if (tabVerif[0].lireCouleurBoule()==Combinaison.tableauCombinaison[3].lireCouleur()){
                cpt2 += 1;
                tabVerif[0].bouleCourante=null;
            }
        }
        if (tabVerif[1].bouleCourante!=null){
            if(tabVerif[1].lireCouleurBoule()==Combinaison.tableauCombinaison[0].lireCouleur()){
                cpt2 += 1;
                tabVerif[1].bouleCourante=null;
            }
            else if (tabVerif[1].lireCouleurBoule()==Combinaison.tableauCombinaison[2].lireCouleur()){
                cpt2 += 1;
                tabVerif[1].bouleCourante=null;
            }
            else if (tabVerif[1].lireCouleurBoule()==Combinaison.tableauCombinaison[3].lireCouleur()){
                cpt2 += 1;
                tabVerif[1].bouleCourante=null;
            }
        }
        if (tabVerif[2].bouleCourante!=null){
            if(tabVerif[2].lireCouleurBoule()==Combinaison.tableauCombinaison[0].lireCouleur()){
                cpt2 += 1;
                tabVerif[2].bouleCourante=null;
            }
            else if (tabVerif[2].lireCouleurBoule()==Combinaison.tableauCombinaison[1].lireCouleur()){
                cpt2 += 1;
                tabVerif[2].bouleCourante=null;
            }
            else if (tabVerif[2].lireCouleurBoule()==Combinaison.tableauCombinaison[3].lireCouleur()){
                cpt2 += 1;
                tabVerif[2].bouleCourante=null;
            }
        }
        if (tabVerif[3].bouleCourante!=null){
            if(tabVerif[3].lireCouleurBoule()==Combinaison.tableauCombinaison[0].lireCouleur()){
                cpt2 += 1;
                tabVerif[3].bouleCourante=null;
            }
            else if (tabVerif[3].lireCouleurBoule()==Combinaison.tableauCombinaison[1].lireCouleur()){
                cpt2 += 1;
                tabVerif[3].bouleCourante=null;
            }
            else if (tabVerif[3].lireCouleurBoule()==Combinaison.tableauCombinaison[2].lireCouleur()){
                cpt2 += 1;
                tabVerif[3].bouleCourante=null;
            }
        }
        
        for (int i=0;i<=3;i++){
            tabVerif[i].bouleCourante=null;  //on vide le tableau de verification completement pour le reremplir avec la prochaine combinaison 
        }
        
        tab[0]=cpt1;
        tab[1]=cpt2;
        
        return tab;
           
    
    }
    
    public void afficherGrilleSurConsoleVdifficile() {
        
        for (int i=0;i<=5;i++){                    //dans le mode hardcore la grille est plus courte
            System.out.println("-------------");
            
            for(int j =0;j<= 3;j++){
                if(tabJeu[i][j].bouleCourante == null){
                    System.out.print("|  ");
                }
                else if ("rouge".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| R");
                }
                else if ("jaune".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| J");
                }
                else if ("bleu".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| B");
                }
                else if ("vert".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| V");
                }
                else if ("cyan".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| C");
                }
                else if ("rose".equals(tabJeu[i][j].lireCouleurBoule())){
                        System.out.print("| P");
                }
            }
        System.out.println("|");
        }
        System.out.println("-------------");
    }
    
}
