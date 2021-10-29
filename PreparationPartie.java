/*
 *  Ecrire un programme qui effectue la préparation d’une partie entre 2 joueurs, en saisissant les 
 * noms, le nombre de tours souhaités et le niveau de difficulté. Si l’une des informations entrées est 
 * incorrecte, le programme en informera l’utilisateur. Si par contre, elles sont toutes correctes, un message 
 * de confirmation sera affiché.
 */
/*
 * Groupe anagramme  
 * 
 * PreparationPartie.java
 */
package implementation;

import java.util.Scanner;

/**
 *
 *
 *
 * @author Julie
 * @author MrBribach
 */
public class PreparationPartie{
    /**
     *
     *
     *
     * @param args non utilisé
     */
    public static void main(String[] args){
        int nbTour,
            niveauDifficulte;
      
        String pseudoUn,
               pseudoDeux;
			   
        Scanner entree = Scanner(System.in);
        
        System.out.print("veuillez entrez le pseudo du joueur 1 : ");
	pseudoUn = entree.next();
	entree.nextLine();
		if (pseudoUn.isBlank()==False) {
		
			System.out.print("veuillez entrez le pseudo du joueur 2 : ");
			pseudoDeux = entree.next();
			entree.nextLine();
			if (pseudoDeux.isBlank()False) {
				
		
			} else {
				System.out.println("Erreur, entrez le pseudo du joueur 2");
			}
		} else {
			System.out.println("Erreur, entrez le pseudo du joueur 1");
		}
	}
}
