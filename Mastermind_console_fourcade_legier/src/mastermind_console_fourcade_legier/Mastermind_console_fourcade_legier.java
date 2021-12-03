/**
 * TP4 console
 * Axel FOURCADE , Noa LEGIER
 * 30/11/2021
 */
package mastermind_console_fourcade_legier;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Axel
 */
public class Mastermind_console_fourcade_legier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Partie partie = new Partie();
        partie.initialiserPartie();
         new fenetreMastermind().setVisible(true);
        //JFrame frame = new JFrame ("MASTERMIND");
        //frame.setPreferredSize(new Dimension(800,1200));
        //frame.pack();
        //frame.setVisible(true);







    }
    
}
