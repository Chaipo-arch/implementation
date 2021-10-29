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
	while (pseudoUn.isBlank()==False) {
		System.out.println("Erreur, entrez de nouveau le pseudo du joueur 2 : ");
		pseudoUn = entree.next();
		entree.nextLine();

	}
	    
	System.out.print("veuillez entrez le pseudo du joueur 2 : ");
	pseudoDeux = entree.next();
	entree.nextLine();
	 
	while (!pseudoDeux.isBlank()) {
		System.out.println("Erreur, entrez le pseudo du joueur 1 : ");
		pseudoDeux = entree.next();
		entree.nextLine();
	}
	    
	System.out.print("veuillez entrez le nombre de tour : ");
	nbTour = entree.nextInt();
	entree.nextInt();
	    
	while (entree.hasNextInt() || entree.nextInt() < 4) {
		System.out.println("Erreur, entrez un entier supérieur ou égal à 4. Recommencez :");
		nbTour = entree.nextInt();
		entree.nextInt();
					
	}
	System.out.print("veuillez entrer le niveau de difficulté "
			 + "(rappel : entrez 1 pour le niveau facile et 2 pour le niveau difficile)");
	niveauDifficulte = entree.nextInt();
	entree.nextInt();
	
	while (entree.hasNextInt() || entree.nextInt() == 1 || entree.nextInt() == 2) {
		System.out.println("Erreur, entrez 1 ou 2 pour choisir le niveau de difficulté. Recommencez : ");
		niveauDifficulte = entree.nextInt();
	        entree.nextInt();
					
		
	}
    }
}
