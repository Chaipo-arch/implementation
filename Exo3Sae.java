// Exercice 3 question 3
// En cours

/*
 * Le programme affiche la première lettre d'un mot saisi par l'utilisateur.
 * 																20 oct. 2021
 * GroupeAnnagramme, pas de copyright
 * StringRLettre.java                                       
 */

package sae.exossupp;

import java.util.Scanner;

/**
 * @version 1.0
 * @author SrtaJulie
 */

public class StringRLettre {
    
    /**
     * Le programme demande à l’utilisateur de saisir un mot.
     * Si le mot n’est pas vide le programme affichera la 1er lettre 
     * (ou le 1er caractère, car on ne vérifiera pas qu’il s’agit d’un mot) 
     * du mot.
     *
     * @param args  argument non utilisé
     */
       
	public static void main(String[] args) { 

		String motEntre; 
		Char caractere1;
		Char caractereCh;
		int rang;

        	Scanner saisieClavier = new Scanner(System.in);
		System.out.print("Entrez un mot :");
		motEntre = saisieClavier.nextLine();
			
		if (motEntre.isEmpty()){
			System.out.println("Vous n'avez pas entré de mot. Recommencez.");				
				
		} else {
			caractere1 = motEntre.charAt(0);
			
			System.out.print("Entrez le rang de la lettre à consulter (de 1 à " + motEntre.length() + ") :");
			rang = saisieClavier.nextInt();
			
			if (rang.isEmpty OR rang>motEntre.length()){
				System.out.println("Ce rang est invalide. Relancez le programme.");
				

			} else {
				caractereCh = motEntre.charAt(rang);
			
				System.out.println("Le mot " + motEntre + " commence par la lettre " + caractere1 + " . ");
				System.out.println("La lettre située au rang " + rang + " est " + caractereCh + " . ");
			}

		}	
	}
		

}
