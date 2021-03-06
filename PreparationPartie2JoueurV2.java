/*
 * Le programme effectue la préparation d'une partie entre 2 joueurs.
 * PreparationPartieV2.java								08/11/2021
 * Groupe anagramme  
 */
package anagramme;

import java.util.Scanner;

/**
 * Le programme effectue la préparation d'une partie entre 2 joueurs : Il
 * demande de saisir les noms, le nombre de tours souhaités (minimum 4) et le
 * niveau de difficulté (1 ou 2). Si l'une des entrées est incorrecte, le
 * programme en informe l'utilisateur, sinon un message de confirmation
 * s'affiche.
 * 
 * @author Julie
 * @author MrBribach
 * @version 1.0
 */

public class PreparationPartie2JoueurV2 {
	/**
	 * Programme principal.
	 * 
	 * @param args argument non utilisé
	 */
	public static void main(String[] args) {
		int nbTour, niveauDifficulte;

		String pseudoUn, pseudoDeux;

		boolean verificationSaisie, correct;
		correct = true;

		Scanner entree = new Scanner(System.in);

		System.out.print("veuillez entrez le pseudo du joueur 1 : ");
		pseudoUn = entree.nextLine();

		if (pseudoUn.isBlank()) {
			System.err.println("Erreur, vous devez entrer le pseudo du joueur 1. ");
			// pseudoUn = entree.nextLine();
			// entree.nextLine();
		}
		System.out.print("veuillez entrez le pseudo du joueur 2 : ");
		pseudoDeux = entree.nextLine();
		if (pseudoDeux.isBlank()) {
			System.err.println("Erreur, vous devez entrer le pseudo du joueur 2.");
			correct = false;
			// pseudoDeux = entree.next();
			// entree.nextLine();
		}
		if (correct) {
			System.out.print("veuillez entrez le nombre de tour : ");
			verificationSaisie = entree.hasNextInt();

			if (verificationSaisie == false) {
				System.out.println("Erreur, entrez un entier supérieur ou égal à 4.");
				correct = false;
			} else {
				nbTour = entree.nextInt();
				if (nbTour < 4) {
					System.out.println("Erreur, entrez un entier supérieur ou égal à 4.");
				}
			}
		}
		if (correct) {
			System.out.print("veuillez entrer le niveau de difficulté "
					+ "(rappel : 1 pour le niveau facile et 2 pour le niveau difficile) : ");
			verificationSaisie = entree.hasNextInt();

			if (verificationSaisie == true) {
				niveauDifficulte = entree.nextInt();
				if (niveauDifficulte != 1 && niveauDifficulte != 2) {
					System.out.println("Erreur, entrez 1 ou 2 pour choisir le niveau " + "de difficulté. ");
					correct = false;
				}
			} else {
				correct = false;
				System.out.println("veuillez entrer un entier entre 1 ou 2 ");
			}

		}

		if (correct) {
			System.out.println("Merci, toutes les informations ont été prises" + " en compte");
			if(Math.random()<50) {
				System.out.print(pseudoUn +" veuillez commencez");
				
			}else {
				System.out.print(pseudoDeux +" veuillez commencez");
			}
		}
	}
}
