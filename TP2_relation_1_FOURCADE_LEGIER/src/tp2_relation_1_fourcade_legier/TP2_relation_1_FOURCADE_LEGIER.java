/**
 * TP2 exercice 4
 * Axel FOURCADE , Noa LEGIER
 * 10/11/2021
 */
package tp2_relation_1_fourcade_legier;

/**
 *
 * @author Axel
 */
public class TP2_relation_1_FOURCADE_LEGIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;

Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");

System.out.println("liste des voitures disponibles\n"+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

bob.liste_voitures[0] = uneClio ;
bob.nbVoitures = 1 ;
uneClio.Proprietaire = bob ;

System.out.println("la premiere voiture de Bob est une " + bob.liste_voitures[0] ) ;

bob.liste_voitures[1] = une2008 ;
bob.nbVoitures = 2 ;
uneClio.Proprietaire = bob ;

System.out.println("la deuxième voiture de Bob est une " + bob.liste_voitures[1] ) ;

reno.liste_voitures[0] = uneAutreClio ;
reno.nbVoitures = 1 ;
uneClio.Proprietaire = reno ;

System.out.println("la premiere voiture de Reno est une " + reno.liste_voitures[0] ) ;

reno.liste_voitures[1] = uneMicra ;
reno.nbVoitures = 2 ;
uneClio.Proprietaire = reno ;

System.out.println("la deuxième voiture de Reno est une " + reno.liste_voitures[1] ) ;



    }
    
}
