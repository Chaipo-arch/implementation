/*
 * 
 */
package anagramme;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * 
 * @author MrBribach
 * @author Julie
 */
public class MenuAnagramme {
	/**
	 * 
	 * @param args non utilisé
	 */
    public static void main(String[]args) {
    	String[] motFacile  = {"ONCLE","GUIDE","LASER","GRIVE","RECIT","REJET","BRAVE","ORGUE","RECUL","BETON"};
		String[] anagrammeDeMotFacile  = {"CLONE","DIGUE","SALER","GIVRE","ECRIT","JETER","BRAVE","ROUGE","CRUEL","BONTE"};
		String[] motDificile = {"REVERS","AUDACE","NECTAR","PIRATE","IVOIRE","DROGUE","GITANE"};
		String[] anagrammeDeMotDificile = {"SEVRER","CADEAU","ENCART","PATRIE","VOIRIE","GOURDE","TAGINE"};
		// TODO Finir de Remplir les tableaux
		
		String repJoueur1;
		String repJoueur2;
		
		String motAffiche;
		String motATrouver;
		
		String pseudoUn, pseudoDeux;
		
		double choixCommencer = 0;
		
    	int numero = 0;
    	int sauvegardeNumero = 2 ;
		
		int choixIndex;
		int pointJoueur1 = 0;
		int pointJoueur2 = 0;
		
		
		
		int nbTour = 4 ;
		int niveauDifficulte = 1;
		
		boolean anagrameTrouve = false;
		boolean correct ;
		boolean verificationSaisie;
		
		boolean bonneLettre ;
		

    	Scanner saisie = new Scanner(System.in);
    	
    	/* réitére le menu tant que l'utilisateur ne veut pas quittez ou n'a pas fait une mauvaise saisie*/
    	do {
	    System.out.println("*******************************************************************");
	    System.out.println("                       MENU ANAGRAMME");
	    System.out.println("*******************************************************************");
	    System.out.println("Option 1 : Affichez les régle du jeu");
	    System.out.println("Option 2 : Preparé une partie pour 2 joueur");
	    System.out.println("Option 3 : Preparé une partie pour 1 joueur");
	    System.out.println("Option 4 : Lancer le jeu");
	    System.out.println("Option 5 : quittez le jeu");
	    System.out.println("tapez le numéro de ce que vous souhaitez afficher :");
	    
	    /* message si ce l'utilisateur n'a pas saisie un entier */
	    if ( !saisie.hasNextInt() ) {
	    	System.err.println("veuillez entrez un entier de 1 à 5");
	    	
	    } else {
	        numero = saisie.nextInt();
	        saisie.nextLine();
	        if (numero<1 && numero >5) {
	    	    System.err.println("l'entier entré doit être compris entre 1 et 5");
	        }
    	    switch (numero) {
    	    	/* affichage de l'aide*/
    	        case 1:
    	    	    final String AIDE = "Au lancement du jeu, un mot est choisi de manière"
			                            +" aléatoire. Il est aussitôt donné au joueur qui"
			                            +" doit trouver l'anagramme de ce mot. \n\n"
			                            +"Plusieurs cas de figure sont ensuite possibles"
			                            +" :\n- Si le joueur n'a pas de réponse, il passe"
			                            +" son tour, et donc ne marque pas de point.\n"
			                            +" - Le joueur a une proposition, mais commet une"
			                            +"erreur : son mot n'est pas construit avec les"
			                            +" lettres\n du mot initial. Un message lui"
			                            +" indiquera qu'il a utilisé une lettre au moins"
			                            +" non autorisée, ou bien qu'une lettre manque. \n"
			                            +" Il ne marque pas de point. Ce sera ensuite au"
			                            +" joueur suivant de continuer la partie.\n"            
			                            + "- Si le joueur a une proposition qui n'est pas la bonne réponse, le"
 			                            +"programme lui indiquera que ce mot n'est pas dans le dictionnaire\n"
                                        +" ou n'est pas la réponse attendue. En effet, il se peut qu'un mot"
                                        + "possède plusieurs anagrammes, mais l'application ne gèrera pas ce"
                                        +"cas \n particulier. Pour ce type d'erreur également, le joueur ne"
                                        +"marque pas de point, et c'est au joueur suivant de continuer la partie."
                                        +"\n \n Le joueur trouve l'anagramme. Il marque un point. C'est ensuite "
                                        +"au joueur suivant de continuer.\n\n"
                                        +"A chaque tour, les deux joueurs jouent successivement. Le score est "
                                        +"affiché en permanence.\n"
                                        +"En fin de partie, l'application affiche le score des deux joueurs et le"
                                        +"nom du gagnant, ou bien indique \n"
                                        +"que les deux joueurs sont ex aequo.\n";
    	    	    System.out.print(AIDE);
    	    	    break;
    	    	    
    	    	/* preparation partie 2 Joueur*/
			    case 2:
				    correct = true;
				    System.out.print("veuillez entrez le pseudo du joueur 1 : ");
				    pseudoUn = saisie.nextLine();

				if (pseudoUn.isBlank()) {
					System.err.println("Erreur, vous devez entrer le pseudo du joueur 1. ");
					// pseudoUn = entree.nextLine();
					// entree.nextLine();
				}
				System.out.print("veuillez entrez le pseudo du joueur 2 : ");
				pseudoDeux = saisie.nextLine();
				if (pseudoDeux.isBlank()) {
					System.err.println("Erreur, vous devez entrer le pseudo du joueur 2.");
					correct = false;
					// pseudoDeux = entree.next();
					// entree.nextLine();
				}
				if (correct) {
					System.out.print("veuillez entrez le nombre de tour : ");
					verificationSaisie = saisie.hasNextInt();

					if (verificationSaisie == false) {
						System.out.println("Erreur, entrez un entier supérieur ou égal à 4.");
						correct = false;
					} else {
						nbTour = saisie.nextInt();
						if (nbTour < 4) {
							System.out.println("Erreur, entrez un entier supérieur ou égal à 4.");
						}
					}
				}
				if (correct) {
					System.out.print("veuillez entrer le niveau de difficulté "
							+ "(rappel : 1 pour le niveau facile et 2 pour le niveau difficile) : ");
					verificationSaisie = saisie.hasNextInt();

					if (verificationSaisie == true) {
						niveauDifficulte = saisie.nextInt();
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
					sauvegardeNumero = numero;
					if (Math.random() < 50) {
						System.out.print(pseudoUn + " veuillez commencez");

					} else {
						System.out.print(pseudoDeux + " veuillez commencez");
					}
				}
				break;
				
			/* Preparation partie 1 joueur*/
			case 3:
				correct = true;
				System.out.print("Veuillez entrez le pseudo du joueur 1 : ");
				pseudoUn = saisie.nextLine();

				if (pseudoUn.isBlank()) {
					System.out.println("Erreur, vous devez entrer le pseudo du joueur 1. ");
					correct = false;
				}

				if (correct) {
					System.out.println("Le deuxieme joueur est l'ordinateur.");
					pseudoDeux = "Ordinateur";

				}

				if (correct) {
					System.out.print("Veuillez entrez le nombre de tour : ");
					verificationSaisie = saisie.hasNextInt();

					if (verificationSaisie == true) {
						nbTour = saisie.nextInt();

						if (nbTour < 4) {
							System.out.println("Erreur, entrez un entier superieur ou egal a 4.");
							correct = false;
						}
					} else {
						correct = false;
						System.out.println("Erreur, entrez un entier superieur ou egal a 4.");
					}
				}

				if (correct) {
					System.out.print("Veuillez entrer le niveau de difficulté "
							+ "(rappel : 1 pour le niveau facile et 2 pour le niveau difficile) : ");
					verificationSaisie = saisie.hasNextInt();

					if (verificationSaisie == true) {
						niveauDifficulte = saisie.nextInt();

						if (niveauDifficulte != 1 && niveauDifficulte != 2) {
							System.out.println("Erreur, entrez 1 ou 2 pour choisir le niveau " + "de difficulte. ");
							correct = false;
						}
					} else {
						correct = false;
						System.out.println("Erreur, entrez 1 ou 2 pour choisir le niveau " + "de difficulte. ");
					}
				}

				if (correct) {
					System.out.println(
							"Merci, toutes les informations ont ete prises" + " en compte. La partie va commencer.");
					sauvegardeNumero = numero ;
				}
				break;
				
			/* Lancez partie*/
			case 4:
				
				/*  partie pour 2 Joueur avec le niveau de difficulté a 1 */
				if (sauvegardeNumero == 2 && niveauDifficulte == 1) {
					if (choixCommencer > 0.5) {
						System.out.println("Le joueur 1 commence.\n");
						choixCommencer = 1;

					} else {
						System.out.println("Le joueur 2 commence.\n");
						choixCommencer = 2;
					}

					for (int incrementation = 0; incrementation < nbTour; incrementation++) {
						// TODO Créer un if qui choisi entre les deux paires de tableaux selon la
						// difficulté choisie par les joueurs
						choixIndex = (int) (Math.random() * motFacile.length);
						motAffiche = motFacile[choixIndex];
						System.out.println("Voici le mot dont vous devez trouver l'anagrame : " + motAffiche);

						motATrouver = anagrammeDeMotFacile[choixIndex];
						System.out.println("Aide testeur : " + motATrouver); // TODO A supprimer quand le jeu est fini

						do {
							if (choixCommencer == 1) {
								System.out.print("Joueur 1, veuillez entrer votre reponse : ");
								repJoueur1 = saisie.nextLine();
								repJoueur1 = repJoueur1.toUpperCase();
								choixCommencer = 2;

								if (repJoueur1.length() != motATrouver.length()) {
									for (int i = 0; i < repJoueur1.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
										}
									}

									System.out.println(
											"\nVous avez utilise au moins une lettre non autorisee, ou bien une lettre manque");
								} else if ((repJoueur1.length() == motATrouver.length())
										&& !repJoueur1.equals(motATrouver)) {
									for (int i = 0; i < repJoueur1.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
										}
									}
									System.out.println(
											"\nCe n'est pas la bonne reponse désolee ! Ce mot n'est pas dans notre dictionnaire.");
								} else {
									System.out.println("Bravo !\n");
									pointJoueur1 += 1;
									System.out.println("Le joueur 1 a " + pointJoueur1 + " points ");
									System.out.println("Le joueur 2 a " + pointJoueur2 + " points ");
									anagrameTrouve = true;
								}

							} else {
								System.out.print("Joueur 2, veuillez entrer votre reponse : ");
								repJoueur2 = saisie.nextLine();
								repJoueur2 = repJoueur2.toUpperCase();
								choixCommencer = 1;

								if (repJoueur2.length() != motATrouver.length()) {
									for (int i = 0; i < repJoueur2.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur2.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur2.charAt(i) + " est non autorisé");
										}
									}
									System.out.println(
											"\nVous avez utilise au moins une lettre non autorisee, ou bien une lettre manque");
								} else if ((repJoueur2.length() == motATrouver.length())
										&& !repJoueur2.equals(motATrouver)) {
									System.out.println(
											"\nCe n'est pas la bonne reponse désolee ! Ce mot n'est pas dans notre dictionnaire.");
									for (int i = 0; i < repJoueur2.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur2.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur2.charAt(i) + " est non autorisé");
										}
									}
								} else {
									System.out.println("Bravo !\n");
									pointJoueur2 += 1;
									System.out.println("Le joueur 2 a " + pointJoueur2 + " points ");
									System.out.println("Le joueur 1 a " + pointJoueur1 + " points ");
									anagrameTrouve = true;
								}
							}
						} while (!anagrameTrouve);
					}

					if (pointJoueur1 > pointJoueur2) {
						System.out.println("Avec ces " + pointJoueur1 + " points, le joueur 1 gagne !");
					} else if (pointJoueur1 < pointJoueur2) {
						System.out.println("Avec ces " + pointJoueur2 + " points, le joueur 1 gagne !");
					} else {
						System.out.println("Les deux joueurs sont a egalite !");
					}
					/*  partie pour 2 Joueur avec le niveau de difficulté a 2 */
					if (sauvegardeNumero == 2 && niveauDifficulte == 1) {
						if (choixCommencer > 0.5) {
							System.out.println("Le joueur 1 commence.\n");
							choixCommencer = 1;

						} else {
							System.out.println("Le joueur 2 commence.\n");
							choixCommencer = 2;
						}

						for (int incrementation = 0; incrementation < nbTour; incrementation++) {
							// TODO Créer un if qui choisi entre les deux paires de tableaux selon la
							// difficulté choisie par les joueurs
							choixIndex = (int) (Math.random() * motFacile.length);
							motAffiche = motDificile[choixIndex];
							System.out.println("Voici le mot dont vous devez trouver l'anagrame : " + motAffiche);

							motATrouver = anagrammeDeMotDificile[choixIndex];
							System.out.println("Aide testeur : " + motATrouver); // TODO A supprimer quand le jeu est fini

							do {
								if (choixCommencer == 1) {
									System.out.print("Joueur 1, veuillez entrer votre reponse : ");
									repJoueur1 = saisie.nextLine();
									repJoueur1 = repJoueur1.toUpperCase();
									choixCommencer = 2;

									if (repJoueur1.length() != motATrouver.length()) {
										for (int i = 0; i < repJoueur1.length(); i++) {
											bonneLettre = false;
											for (int a = 0; a < motATrouver.length(); a++) {
												if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
													bonneLettre = true;
												}
											}
											if (!bonneLettre) {
												System.out
														.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
											}
										}

										System.out.println(
												"\nVous avez utilise au moins une lettre non autorisee, ou bien une lettre manque");
									} else if ((repJoueur1.length() == motATrouver.length())
											&& !repJoueur1.equals(motATrouver)) {
										for (int i = 0; i < repJoueur1.length(); i++) {
											bonneLettre = false;
											for (int a = 0; a < motATrouver.length(); a++) {
												if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
													bonneLettre = true;
												}
											}
											if (!bonneLettre) {
												System.out
														.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
											}
										}
										System.out.println(
												"\nCe n'est pas la bonne reponse désolee ! Ce mot n'est pas dans notre dictionnaire.");
									} else {
										System.out.println("Bravo !\n");
										pointJoueur1 += 1;
										System.out.println("Le joueur 1 a " + pointJoueur1 + " points ");
										System.out.println("Le joueur 2 a " + pointJoueur2 + " points ");
										anagrameTrouve = true;
									}

								} else {
									System.out.print("Joueur 2, veuillez entrer votre reponse : ");
									repJoueur2 = saisie.nextLine();
									repJoueur2 = repJoueur2.toUpperCase();
									choixCommencer = 1;

									if (repJoueur2.length() != motATrouver.length()) {
										for (int i = 0; i < repJoueur2.length(); i++) {
											bonneLettre = false;
											for (int a = 0; a < motATrouver.length(); a++) {
												if (repJoueur2.charAt(i) == motATrouver.charAt(a)) {
													bonneLettre = true;
												}
											}
											if (!bonneLettre) {
												System.out
														.println("la lettre " + repJoueur2.charAt(i) + " est non autorisé");
											}
										}
										System.out.println(
												"\nVous avez utilise au moins une lettre non autorisee, ou bien une lettre manque");
									} else if ((repJoueur2.length() == motATrouver.length())
											&& !repJoueur2.equals(motATrouver)) {
										System.out.println(
												"\nCe n'est pas la bonne reponse désolee ! Ce mot n'est pas dans notre dictionnaire.");
										for (int i = 0; i < repJoueur2.length(); i++) {
											bonneLettre = false;
											for (int a = 0; a < motATrouver.length(); a++) {
												if (repJoueur2.charAt(i) == motATrouver.charAt(a)) {
													bonneLettre = true;
												}
											}
											if (!bonneLettre) {
												System.out
														.println("la lettre " + repJoueur2.charAt(i) + " est non autorisé");
											}
										}
									} else {
										System.out.println("Bravo !\n");
										pointJoueur2 += 1;
										System.out.println("Le joueur 2 a " + pointJoueur2 + " points ");
										System.out.println("Le joueur 1 a " + pointJoueur1 + " points ");
										anagrameTrouve = true;
									}
								}
							} while (!anagrameTrouve);
						}

						if (pointJoueur1 > pointJoueur2) {
							System.out.println("Avec ces " + pointJoueur1 + " points, le joueur 1 gagne !");
						} else if (pointJoueur1 < pointJoueur2) {
							System.out.println("Avec ces " + pointJoueur2 + " points, le joueur 1 gagne !");
						} else {
							System.out.println("Les deux joueurs sont a egalite !");
						}

					
				/* La partie pour 1 joueur avec un niveau de difficulté a 1*/
				}
				if(sauvegardeNumero == 3 && niveauDifficulte == 1) {
					for (int incrementation = 0; incrementation < nbTour; incrementation++) {
						// TODO Créer un if qui choisi entre les deux paires de tableaux selon la
						// difficulté choisie par les joueurs
						choixIndex = (int) (Math.random() * motFacile.length);
						motAffiche = motFacile[choixIndex];
						System.out.println("Voici le mot dont vous devez trouver l'anagrame : " + motAffiche);

						motATrouver = anagrammeDeMotFacile[choixIndex];
						System.out.println("Aide testeur : " + motATrouver); // TODO A supprimer quand le jeu est fini

						do {
								System.out.print("Joueur 1, veuillez entrer votre reponse : ");
								repJoueur1 = saisie.nextLine();
								repJoueur1 = repJoueur1.toUpperCase();
								choixCommencer = 2;

								if (repJoueur1.length() != motATrouver.length()) {
									for (int i = 0; i < repJoueur1.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
										}
									}

									System.out.println(
											"\nVous avez utilise au moins une lettre non autorisee, ou bien une lettre manque");
								} else if ((repJoueur1.length() == motATrouver.length())
										&& !repJoueur1.equals(motATrouver)) {
									for (int i = 0; i < repJoueur1.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
										}
									}
									System.out.println(
											"\nCe n'est pas la bonne reponse désolee ! Ce mot n'est pas dans notre dictionnaire.");
								} else {
									System.out.println("Bravo !\n");
									pointJoueur1 += 1;
									System.out.println("Le joueur 1 a " + pointJoueur1 + " points ");
									anagrameTrouve = true;
								}
							} while (!anagrameTrouve);
					    }
				    }
				}
				
				/* 1joueur avec le niveau de difficulté 2 */
				if(sauvegardeNumero == 3 && niveauDifficulte == 2) {
					for (int incrementation = 0; incrementation < nbTour; incrementation++) {
						// TODO Créer un if qui choisi entre les deux paires de tableaux selon la
						// difficulté choisie par les joueurs
						choixIndex = (int) (Math.random() * motDificile.length);
						motAffiche = motDificile[choixIndex];
						System.out.println("Voici le mot dont vous devez trouver l'anagrame : " + motAffiche);

						motATrouver = anagrammeDeMotDificile[choixIndex];
						System.out.println("Aide testeur : " + motATrouver); // TODO A supprimer quand le jeu est fini

						do {
								System.out.print("Joueur 1, veuillez entrer votre reponse : ");
								repJoueur1 = saisie.nextLine();
								repJoueur1 = repJoueur1.toUpperCase();
								choixCommencer = 2;

								if (repJoueur1.length() != motATrouver.length()) {
									for (int i = 0; i < repJoueur1.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
										}
									}

									System.out.println(
											"\nVous avez utilise au moins une lettre non autorisee, ou bien une lettre manque");
								} else if ((repJoueur1.length() == motATrouver.length())
										&& !repJoueur1.equals(motATrouver)) {
									for (int i = 0; i < repJoueur1.length(); i++) {
										bonneLettre = false;
										for (int a = 0; a < motATrouver.length(); a++) {
											if (repJoueur1.charAt(i) == motATrouver.charAt(a)) {
												bonneLettre = true;
											}
										}
										if (!bonneLettre) {
											System.out
													.println("la lettre " + repJoueur1.charAt(i) + " est non autorisé");
										}
									}
									System.out.println(
											"\nCe n'est pas la bonne reponse désolee ! Ce mot n'est pas dans notre dictionnaire.");
								} else {
									System.out.println("Bravo !\n");
									pointJoueur1 += 1;
									System.out.println("Le joueur 1 a " + pointJoueur1 + " points ");
									anagrameTrouve = true;
								}
							} while (!anagrameTrouve);
					}
				}
				break;
			case 5:
				for (int i = 0; i < 100; i++) {
					System.out.println("");
				}
				System.out.print("Aurevoir");
				break;
			}
			for (int i = 0; i < 10; i++) {
				System.out.println("");
			}
		}
	} while (numero != 4 && numero != 5);
}
}
