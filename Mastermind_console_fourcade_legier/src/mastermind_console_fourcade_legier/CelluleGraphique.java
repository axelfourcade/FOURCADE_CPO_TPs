/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console_fourcade_legier;

/**
 *
 * @author Legier
 */

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class CelluleGraphique extends JButton {
    
    ImageIcon pionsachoisir = new javax.swing.ImageIcon(getClass().getResource("/images/pionsachoisir.png")) ;
    ImageIcon bouleBleu = new javax.swing.ImageIcon(getClass().getResource("/images/bouleBleu.png")) ;
    ImageIcon bouleCyan = new javax.swing.ImageIcon(getClass().getResource("/images/bouleCyan.png")) ;
    ImageIcon bouleJaune = new javax.swing.ImageIcon(getClass().getResource("/images/bouleJaune.png")) ;
    ImageIcon bouleRose = new javax.swing.ImageIcon(getClass().getResource("/images/bouleRose.png")) ;
    ImageIcon bouleRouge = new javax.swing.ImageIcon(getClass().getResource("/images/bouleRouge.png")) ;
    ImageIcon bouleVide = new javax.swing.ImageIcon(getClass().getResource("/images/bouleVide.png")) ;
    ImageIcon bouleVert = new javax.swing.ImageIcon(getClass().getResource("/images/bouleVert.png")) ;
    
    
    
    
    
    Boule bouleAssociee;
    
    
    public CelluleGraphique (Boule uneBoule) {
        bouleAssociee = uneBoule ;
    }
    
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        
        //String couleur_boule = bouleAssociee.Couleur;
        String couleur_boule = "vide";
            switch (couleur_boule){
               case "vide":
                    setIcon(bouleVide);
                    break;
                
                case "Rose":
                    setIcon(bouleRose);
                    break;
                case "Rouge":
                    setIcon(bouleRouge);
                    break;
                case "Bleu" :
                    setIcon(bouleBleu);
                    break;
                case "Jaune": 
                    setIcon(bouleJaune);
                    break;
                case "Cyan" :
                    setIcon(bouleCyan);
                    break;
                case "Vert" :
                    setIcon(bouleVert);
                    break;
                    
            }
    }    
        
    
}
