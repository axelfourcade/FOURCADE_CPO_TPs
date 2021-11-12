/**
 * TP2 exercice 3
 * Axel FOURCADE , Noa LEGIER
 * 10/11/2021
 */
package tp2_manip_fourcade_legier;

/**
 *
 * @author Axel
 */
public class TP2_manip_FOURCADE_LEGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;  
    
    Tartiflette assiette3 = assiette2 ; 
    
    // 3 assiette2 et assiette3 sont 2 tartiflettes différentes
    
    System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
    
    assiette2 = assiette1;
    assiette1 = assiette3;
    
    //Moussaka assiette666 = assiette1 ;            
    //Moussaka assiette667 = new Tartiflette() ;
    //Non,Non
    
    Moussaka [] tab = new Moussaka [10];
    
    for (int i=1;i<=10;i++){
        tab[i-1] = new Moussaka(1);
    }
    

    
    }
    
}
