package mastermind.console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Boule {
    String Couleur;
    
    public Boule (String couleur){
        Couleur = couleur;
    }
    
    public String lireCouleur(){
        return Couleur;
    }
    
    public String AffecterCouleur (int nb){
        if (nb==1){
            Couleur = "jaune";  
        }
        else if (nb==2){
            Couleur = "bleu";
        }
        else if (nb==3){
            Couleur = "rouge";
        }
        else if (nb==4){
            Couleur = "vert";
        }
        else if (nb==5){
            Couleur = "rose";
        }
        else if (nb==6){
            Couleur = "cyan";
        }
        
        return Couleur;
    }
}