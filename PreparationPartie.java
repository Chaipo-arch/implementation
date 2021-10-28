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
 * @author Julie
 * @author MrBribach
 */
public class PreparationPartie{
    /**
     *
     *
     * @param args non utilisé
     */
    public static void main(String[] args){
        int nbTour,
            niveauDifficulte;
      
        String pseudoUn,
               pseudoDeux;
        Scanner saisie = Scanner(System.in);
        
        System.out.print("veuillez entrez le pseudo du joueur1 : ");
        pseudoUn = saisie.next() ;
        saisie.nextLine();
        System.out.print("veuillez entrez le pseudo du joueur2 : ");
        pseudoDeux = saisie.next() ;
        saisie.nextLine();
        System.out.print("veuillez entrez le nombre de tour : ");
        nbTour = saisie.nextInt();
        System.out.print("veuillez entrez le niveau de difficulté "
                         + "(rappel entrez 1 pour le niveau facile et 2 pour le niveau difficile)");
        niveauDifficulte = saisie.nextInt();
        //TODO verifiez que les pseudo entrez ne sont pas des chaine vide si chaine vide il faut que l'uttilisateur retape son pseudo
        //TODO verifiez que le nb de tour entrez est bien un int et que c'est supérieur a 4 sinon l'utilisateur doit retaper
        //TODO verifiez que le niveau de difficulté entre est bien un entier entre 1 et 2 sinon l'utilisateur doit retaper.
  }
}
