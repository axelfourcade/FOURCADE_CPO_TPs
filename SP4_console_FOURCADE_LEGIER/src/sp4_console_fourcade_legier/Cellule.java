package sp4_console_fourcade_legier;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axel
 */
public class Cellule {

    
    
    
Jeton jetonCourant;
boolean trouNoir;
boolean desintegrateur;

public Cellule(){
    jetonCourant = null ;
    trouNoir = false ;
    desintegrateur = false ;
}
    
public boolean affecterJeton(Jeton jeton){
    if (jetonCourant ==null){
        jetonCourant = jeton;
        return true ;
    }
    else {
        return false;
    }
}    
    
public Jeton recupererJeton(){
    return jetonCourant;
}    
    
public boolean supprimerJeton(){
    if (jetonCourant !=null){
        jetonCourant =null;
        return true;
    }
    else {
        return false ;
    }
}
    
public boolean placerTrouNoir(){
    if (trouNoir == false){
        trouNoir = true;
        return true ;
    }
    else {
        return false;
    }
}
    

public boolean placerDesintegrateur(){
    if (desintegrateur == false){
        desintegrateur = true;
        return true ;
    }
    else {
        return false;
    }
}













}
