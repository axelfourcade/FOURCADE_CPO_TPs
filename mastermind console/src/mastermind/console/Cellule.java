package mastermind.console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Cellule {
    
    Boule bouleCourante;
    
    public Cellule(){
        bouleCourante = null ;   
    }
    
    public boolean affecterBoule(Boule boule){
        if (bouleCourante ==null){
            bouleCourante = boule;
            return true ;
        }
        else {
            return false;
        }
    }
    
    public Boule recupererBoule(){
    
        return bouleCourante;
    }
    
    public String lireCouleurBoule(){
        if (bouleCourante !=null){
            return bouleCourante.lireCouleur();
        }
        else
            return "vide";
    }
}
