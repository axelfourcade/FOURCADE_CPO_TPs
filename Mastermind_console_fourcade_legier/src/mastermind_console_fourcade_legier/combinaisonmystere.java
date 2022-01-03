package mastermind_console_fourcade_legier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class combinaisonmystere {
    
    Boule [] tableauCombinaison = new Boule [4];  //on stock la combinaison mystere dans un tableau
    
    
    public combinaisonmystere(){
    
    int var1 ;
    int var2 ;
    int var3 ;
    int var4 ;
    String couleur = null;
    
    var1 = (int)(Math.random() * 6);
    switch (var1) {
        case 1 -> couleur = "jaune";
        case 2 -> couleur = "bleu";
        case 3 -> couleur = "rouge";
        case 4 -> couleur = "vert";
        case 5 -> couleur = "rose";
        case 0 -> couleur = "cyan";
        default -> {
        }
    }
        
    tableauCombinaison[0] = new Boule(couleur);
        
    var2=var1;
    
    while (var2==var1){                        //pour avoir 4 couleurs différentes
        var2 = (int)(Math.random() * 6);
    }    
        
    switch (var2) {
        case 1 -> couleur = "jaune";
        case 2 -> couleur = "bleu";
        case 3 -> couleur = "rouge";
        case 4 -> couleur = "vert";
        case 5 -> couleur = "rose";
        case 0 -> couleur = "cyan";
        default -> {
        }
    }
    tableauCombinaison[1] = new Boule(couleur);
        
    var3=var2;
    
    while (var3==var2 || var3==var1){    
        var3 = (int)(Math.random() * 6);
    }    
        
    switch (var3) {
        case 1 -> couleur = "jaune";
        case 2 -> couleur = "bleu";
        case 3 -> couleur = "rouge";
        case 4 -> couleur = "vert";
        case 5 -> couleur = "rose";
        case 0 -> couleur = "cyan";
        default -> {
        }
    }
    tableauCombinaison[2] = new Boule(couleur);
    
    var4=var3;
    
    while (var4==var1 || var4==var2 || var4==var3 ){    
        var4 = (int)(Math.random() * 6);
    }    
        
    switch (var4) {
        case 1 -> couleur = "jaune";
        case 2 -> couleur = "bleu";
        case 3 -> couleur = "rouge";
        case 4 -> couleur = "vert";
        case 5 -> couleur = "rose";
        case 0 -> couleur = "cyan";
        default -> {
        }
    }
    tableauCombinaison[3] = new Boule(couleur);
    
    }
}
