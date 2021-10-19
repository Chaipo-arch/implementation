/*
 * exerciceSAE.java			19/10/2021
 * Groupe JeuAnagramme 
 * pas de copyright
 */
package entrainement;
import java.util.Scanner;
/**
 * la classe exerciceSAe
 * @author MrBribach
 * 
 */
public class ExerciceSAe {
    /**
     * 
     * 
     */
    public static void main(String[] args) {
    	String chaineUn,chaineDeux;
	Scanner saisie = new Scanner(System.in);
	
	
	System.out.print("veuillez saisir une 1ére chaine non vide : ");
	chaineUn = saisie.nextLine();
	System.out.print("veuillez saisir une 2éme chaine non vide : ");
	chaineDeux = saisie.nextLine();
	if(chaineUn.isEmpty() && chaineDeux.isEmpty()) {
	    System.out.print("les 2 chaine sont vide");
	}
	if(chaineUn.isEmpty() && !chaineDeux.isEmpty() ) {
	    System.out.println("la 1ére chaine est vide");
	}
	if(!chaineUn.isEmpty() && chaineDeux.isEmpty() ) {
	    System.out.println("la 2éme chaine est vide");
	}
	if( !chaineUn.isEmpty() && !chaineDeux.isEmpty() ) {
	    if(chaineUn.equals(chaineDeux)) {
	       System.out.println("les 2 chaine sont identiques");
	    }
	     else {
 	         System.out.print("les 2 chaines sont différentes");
	    	 if(chaineUn.charAt(0) == chaineDeux.charAt(0)) {
	    	    System.out.println("la premiére lettre est identique : " + chaineUn.charAt(0));
	    	    }
	    	 if(chaineUn.charAt(chaineUn.length() - 1) == chaineDeux.charAt(chaineDeux.length() - 1)) {
	    	    System.out.println("la derniére lettre est identique :" + chaineUn.charAt(chaineUn.length()-1));
	    	 }
	    }
	}
    }
}
