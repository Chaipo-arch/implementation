/*
 *  Ecrire un programme qui effectue la préparation d’une partie entre 2 joueurs, en saisissant les 
 * noms, le nombre de tours souhaités et le niveau de difficulté. Si l’une des informations entrées est 
 * incorrecte, le programme en informera l’utilisateur. Si par contre, elles sont toutes correctes, un message 
 * de confirmation sera affiché.
 */
package implementation;

import java.util.Scanner;
/**
 *
 *
 *
 */
public class PreparationPartie{
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
// 4 variables 2 String 2 int 
// 2 pseudo + 1 nbTour (minimum 4) + 1 niveauDifficultée (soit valeur 1 ou 2)
  }
}
