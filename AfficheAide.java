/*
 * Groupe TP1 Anagramme             20/10/2021
 * Pas de copyright
 * AfficheAide.java
 */
package Anagramme;
/**
 * 
 * @author MrBribach
 * @author Julie
 */
public class AfficheAide {
    /*
     * ici on va ecrire l'Etape 1 du sujet 
     * Anagramme
     */
    /**
     * 
     * @param args non utilisé
     */
    public static void main(String[] args){
        final String AIDE = "Au lancement du jeu, un mot est choisi de manière"
							+" aléatoire. Il est aussitôt donné au joueur qui"
							+" doit trouver l'anagramme de ce mot. /n/n/n"
							+"Plusieurs cas de figure sont ensuite possibles"
							+" :/n- Si le joueur n'a pas de réponse, il passe"
							+" son tour, et donc ne marque pas de point./n
							+" - Le joueur a une proposition, mais commet une"
							+"erreur : son mot n'est pas construit avec les
							+" lettres/n du mot initial. Un message lui"
							+" indiquera qu'il a utilisé une lettre au moins"
							+" non autorisée, ou bien qu'une lettre manque. /n"
							+" Il ne marque pas de point. Ce sera ensuite au"
							+" joueur suivant de continuer la partie./n/n"
            
- Si le joueur a une proposition qui n'est pas la bonne réponse, le programme lui indiquera que ce mot n'est pas dans le dictionnaire/n
 ou n'est pas la réponse attendue. En effet, il se peut qu'un mot possède plusieurs anagrammes, mais l'application ne gèrera pas ce cas /n
particulier. Pour ce type d'erreur également, le joueur ne marque pas de point, et c'est au joueur suivant de continuer la partie. /n/n
- Le joueur trouve l'anagramme. Il marque un point. C'est ensuite au joueur suivant de continuer./n/n
A chaque tour, les deux joueurs jouent successivement. Le score est affiché en permanence./n
En fin de partie, l'application affiche le score des deux joueurs et le nom du gagnant, ou bien indique /n
que les deux joueurs sont ex aequo./n";
        System.out.print(AIDE);
        
} 
