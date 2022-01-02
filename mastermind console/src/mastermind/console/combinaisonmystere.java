package mastermind.console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class combinaisonmystere {
    
    Boule [] tableauCombinaison = new Boule [4];
    
    
    public combinaisonmystere(){
    
    int var ;
    String couleur = null;
        
    for (int i=0;i<=3;i++){
        var = (int)(Math.random() * 6);
        switch (var) {
            case 1 -> couleur = "jaune";
            case 2 -> couleur = "bleu";
            case 3 -> couleur = "rouge";
            case 4 -> couleur = "vert";
            case 5 -> couleur = "rose";
            case 0 -> couleur = "cyan";
            default -> {
            }
        }
        tableauCombinaison[i] = new Boule(couleur);
        }
    }
}
