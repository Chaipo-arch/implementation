
/*
 * Le programme calcule et affiche la puissance d'un nombre donné
 * ConversionString.java                                       06/10/2021
 */

package co;

import java.util.Scanner;

/**
 * 
 *
 * @author   Julie
 * @version 1.0
 */

public class ConversionString {
    
    /**
     * Programme principal
     * @param args  argument non utilisé
     */
        
        public static void main(String[] args) { 

			String chaine; 
			int longeur;

            Scanner entree = new Scanner(System.in);

			System.out.print("Entrez un texte :");
			chaine = entree.nextLine();
			
			if (chaine.isEmpty()){
				System.out.println("Vous avez entré une chaîne vide.");				
				
			} else {
				longeur = chaine.length();
				System.out.println("La chaîne " + chaine + " comporte " + longeur + " caractères ");
				System.out.println("Son equivalent en maj est : " + chaine.toUpperCase());
				System.out.println("Son equivalent en maj est : " + chaine.toLowerCase());
			}	 
		}
		

}
