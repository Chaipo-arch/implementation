// Exercice 3 question 2
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

        	Scanner saisieClavier = new Scanner(System.in);
		System.out.print("Entrez un mot :");
		motEntre = saisieClavier.nextLine();
			
		if (motEntre.isEmpty()){
			System.out.println("Vous avez entré une chaîne vide. Recommencez.");				
				
		} else {
			caractere1 = motEntre.charAt(0);
			System.out.println("Le mot " + motEntre + " commence par la lettre " + caractere1 + " . ");

		}	
	}
		

}
