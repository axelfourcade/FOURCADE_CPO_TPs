/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_console_fourcade_legier;

/**
 *
 * @author Legier
 */
public class fenetreMastermind extends javax.swing.JFrame {

    Grille grilleDeJeu = new Grille();
    Grille grilleOrdi = new Grille();
    Boule bouleCourant = new Boule("vide");


    public fenetreMastermind() {
        initComponents();
        grille.setVisible(false);
        

        for (int k = 0; k < 4; k++) {
            CelluleGraphique cellResultat = new CelluleGraphique(grilleOrdi.BouleJeu[1][k]);

            cellResultat.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Boule bouleOrdi = cellResultat.bouleAssociee;
                    grilleResultat.repaint();

                }
            });
            grilleResultat.add(cellResultat);
            grilleResultat.repaint();
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleDeJeu.BouleJeu[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                        Boule b = cellGraph.bouleAssociee;
                        grille.repaint();

                        

                    }
                });
                grille.add(cellGraph);
                grille.repaint();

            }
        }
        
        
        
        
        
        
    }

    
    
    public void Initialiser(){
        start.setVisible(false);
        grille.setVisible(true);
        courant.setText( bouleCourant.Couleur);
        
        
       
        int var1 = (int)(Math.random() * 6);
        String couleur1 =AffecterCouleur(var1);
        Boule bouleResultat1 = new Boule(couleur1);
        
        int var2 = (int)(Math.random() * 6);
        String couleur2 =AffecterCouleur(var2);
        Boule bouleResultat2 = new Boule(couleur2);
        
        int var3 = (int)(Math.random() * 6);
        String couleur3 =AffecterCouleur(var3);
        Boule bouleResultat3 = new Boule(couleur3);
       
        int var4 = (int)(Math.random() * 6);
        String couleur4 =AffecterCouleur(var4);
        Boule bouleResultat4 = new Boule(couleur4);
        
        String [] tabResultat = new String [4];
        tabResultat[0]=couleur1;
        tabResultat[1]=couleur2;
        tabResultat[2]=couleur3;
        tabResultat[3]=couleur4;
        
       // grilleOrdi.BouleJeu[1][0]= bouleResultat1;
        //grilleOrdi.BouleJeu[1][1]= bouleResultat2;
        //grilleOrdi.BouleJeu[1][2]= bouleResultat3;
        //grilleOrdi.BouleJeu[1][3]= bouleResultat4;
        
    }
    
    public String AffecterCouleur (int nb){
        String couleur="vide";
        if (nb==1){
            couleur = "jaune";  
        }
        else if (nb==2){
            couleur = "bleu";
        }
        else if (nb==3){
            couleur = "rouge";
        }
        else if (nb==4){
            couleur = "vert";
        }
        else if (nb==5){
            couleur = "rose";
        }
        else if (nb==6){
            couleur = "cyan";
        }
        
        return couleur;
    }
    
    
    
    
    public void unePartie(){
        int compteur =0;
        
    }
    
    
    
    
    
    
    
    
    
    /**
     * Creates new form fenetreMastermind
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grille = new javax.swing.JPanel();
        boutonCyan = new javax.swing.JButton();
        boutonRose = new javax.swing.JButton();
        boutonRouge = new javax.swing.JButton();
        boutonJaune = new javax.swing.JButton();
        boutonVert = new javax.swing.JButton();
        boutonBleu = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        grilleResultat = new javax.swing.JPanel();
        boutonVerif = new javax.swing.JButton();
        courant = new javax.swing.JLabel();
        couleurBoule = new javax.swing.JTextField();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grille.setBackground(new java.awt.Color(204, 204, 255));
        grille.setForeground(new java.awt.Color(153, 153, 255));
        grille.setLayout(new java.awt.GridLayout(10, 4));
        getContentPane().add(grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 390, 610));

        boutonCyan.setBackground(new java.awt.Color(0, 255, 255));
        boutonCyan.setText("Cyan");
        boutonCyan.setBorder(null);
        boutonCyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonCyanActionPerformed(evt);
            }
        });
        getContentPane().add(boutonCyan, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 40, 20));

        boutonRose.setBackground(new java.awt.Color(255, 0, 255));
        boutonRose.setText("Rose");
        boutonRose.setBorder(null);
        boutonRose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRoseActionPerformed(evt);
            }
        });
        getContentPane().add(boutonRose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 40, 20));

        boutonRouge.setBackground(new java.awt.Color(255, 0, 51));
        boutonRouge.setText("Rouge");
        boutonRouge.setBorder(null);
        boutonRouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRougeActionPerformed(evt);
            }
        });
        getContentPane().add(boutonRouge, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 40, 20));

        boutonJaune.setBackground(new java.awt.Color(255, 255, 0));
        boutonJaune.setText("Jaune");
        boutonJaune.setBorder(null);
        boutonJaune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonJauneActionPerformed(evt);
            }
        });
        getContentPane().add(boutonJaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 40, 20));

        boutonVert.setBackground(new java.awt.Color(102, 255, 51));
        boutonVert.setText("Vert");
        boutonVert.setBorder(null);
        boutonVert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonVertActionPerformed(evt);
            }
        });
        getContentPane().add(boutonVert, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 40, 20));

        boutonBleu.setBackground(new java.awt.Color(0, 0, 204));
        boutonBleu.setText("Bleu");
        boutonBleu.setBorder(null);
        boutonBleu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonBleuActionPerformed(evt);
            }
        });
        getContentPane().add(boutonBleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 40, 20));

        jTextField1.setBackground(new java.awt.Color(51, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jTextField1.setText("MASTERMIND");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Choisir un pion et le placer sur la grille :");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 260, 30));

        jTextField3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTextField3.setText("R??sultat ordinateur :");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, 30));

        grilleResultat.setBackground(new java.awt.Color(204, 204, 255));
        grilleResultat.setLayout(new java.awt.GridLayout(1, 4));
        getContentPane().add(grilleResultat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 330, 80));

        boutonVerif.setText("VERIFIER");
        boutonVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonVerifActionPerformed(evt);
            }
        });
        getContentPane().add(boutonVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 260, 40));

        courant.setText("bouleCourant.Couleur");
        getContentPane().add(courant, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, 20));

        couleurBoule.setText("Couleur choisie :");
        couleurBoule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couleurBouleActionPerformed(evt);
            }
        });
        getContentPane().add(couleurBoule, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        start.setBackground(new java.awt.Color(204, 255, 255));
        start.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        start.setText("--> START <--");
        start.setBorder(null);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 300, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void boutonVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonVerifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonVerifActionPerformed

    private void boutonRoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRoseActionPerformed
        // TODO add your handling code here:
        
        bouleCourant.Couleur = "rose";
        courant.setText( bouleCourant.Couleur);
        courant.repaint();
        Boule bouleChoisie = new Boule(bouleCourant.Couleur);
        
        

    }//GEN-LAST:event_boutonRoseActionPerformed

    private void boutonCyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonCyanActionPerformed
        // TODO add your handling code here:
        bouleCourant.Couleur = "cyan";
        courant.setText( bouleCourant.Couleur);
        Boule bouleChoisie = new Boule(bouleCourant.Couleur);
       
        courant.repaint();
       
    }//GEN-LAST:event_boutonCyanActionPerformed

    private void boutonRougeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRougeActionPerformed
        // TODO add your handling code here:
       bouleCourant.Couleur = "rouge";
       courant.setText( bouleCourant.Couleur);
       Boule bouleChoisie = new Boule(bouleCourant.Couleur);
       
       courant.repaint();
    }//GEN-LAST:event_boutonRougeActionPerformed

    private void boutonJauneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonJauneActionPerformed
        // TODO add your handling code here:
        bouleCourant.Couleur = "jaune";
        courant.setText( bouleCourant.Couleur);
        Boule bouleChoisie = new Boule(bouleCourant.Couleur);
       
        courant.repaint();
    }//GEN-LAST:event_boutonJauneActionPerformed

    private void boutonVertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonVertActionPerformed
        // TODO add your handling code here:
        bouleCourant.Couleur = "vert";
        courant.setText( bouleCourant.Couleur);
        Boule bouleChoisie = new Boule(bouleCourant.Couleur);
        
        courant.repaint();
    }//GEN-LAST:event_boutonVertActionPerformed

    private void boutonBleuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonBleuActionPerformed
        // TODO add your handling code here:
        bouleCourant.Couleur ="bleu";
        courant.setText( bouleCourant.Couleur);
        Boule bouleChoisie = new Boule(bouleCourant.Couleur);
        
        courant.repaint();
    }//GEN-LAST:event_boutonBleuActionPerformed

    private void couleurBouleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couleurBouleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_couleurBouleActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        Initialiser();
        
    }//GEN-LAST:event_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreMastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreMastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreMastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreMastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreMastermind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonBleu;
    private javax.swing.JButton boutonCyan;
    private javax.swing.JButton boutonJaune;
    private javax.swing.JButton boutonRose;
    private javax.swing.JButton boutonRouge;
    private javax.swing.JButton boutonVerif;
    private javax.swing.JButton boutonVert;
    private javax.swing.JTextField couleurBoule;
    private javax.swing.JLabel courant;
    private javax.swing.JPanel grille;
    private javax.swing.JPanel grilleResultat;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
