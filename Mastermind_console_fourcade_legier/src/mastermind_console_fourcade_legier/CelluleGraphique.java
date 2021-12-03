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
     Boule bouleAssociee;
    
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        
        //case couleur6:
          //  setIcon(pionsachoisir);
        
        
        //String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
          //  switch (couleur_jeton){
            //    case "vide": 
              //      setIcon(img_vide);
                //    break ;
                //case "" :
                   // setIcon(img_vide);
                    //break;
                //case"rouge" :
                  //  setIcon(img_jetonRouge);
                    //break;
                //case "jaune" :
                  //  setIcon(img_jetonJaune);
                    //break ;
            }
        
    public CelluleGraphique (Boule uneBoule) {
        bouleAssociee = uneBoule ;
    }
}
