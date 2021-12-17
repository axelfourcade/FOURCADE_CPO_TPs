package mastermind.console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Partie {
    
    Boule [] tableauOrdi = new Boule [4];
    int [] tableauRes = new int [2];
    
    public Partie(){
        for (int i=0;i<=3;i++){
            tableauOrdi[i]=null;
        }
    }
    
    public void initialiserPartie(){
        
        int var ;
        
        for (int i=0;i<=3;i++){
            var = (int)(Math.random() * 6);
            tableauOrdi[i]= Boule.affecter
        }
    }
    
}
