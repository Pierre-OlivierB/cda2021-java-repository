package javaGit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class suite {

	public static void main(String[] args) {
		System.out.println("Aujourd'hui nous sommes le:");
		String dateAujourdhui;
		dateAujourdhui=Journee.aujourdhui();
		System.out.println(dateAujourdhui);
		
		System.out.println("Quelle heure est-il?");	
		String heureAujourdhui;
		heureAujourdhui=Journee.maintenant();
		System.out.println(heureAujourdhui);
		
		System.out.println("Pour vous, quel jour sommes-nous?");	
		Journee.saisirDate(10,12,2021);
		/*duJour.maintenant();
		duJour.saisirDate();*/
		}
	
	}
	/*
	public static void testGrandeur() {
		int i;
		int j;
		i=Clavier.lireInt();
		j=Clavier.lireInt2();
		if (i>j) {
			System.out.println("Le chiffre: "+i +" est le plus grand chiffre!");
		}
		else if (j>i) {
			System.out.println("Le chiffre: "+j +" est le plus grand chiffre!");
		}
		else {
			System.out.println("Les deux chiffres sont �gaux!");
		}
		//System.out.println(i>j ? "Le chiffre: "+i +" est le plus grand chiffre!":"Le chiffre: "+j +" est le plus grand chiffre!");
	}*/

		// TODO Auto-generated method stub
		/*
		System.out.println("Algo : RESULTAT \n DEBUT");
		int i;
		System.out.println("Veuillez saisir la note:");
		i=Clavier.lireInt();
		if(i>=10) {
			System.out.println("Vous �tes admis.");
			if(i<12) {
				System.out.println("Votre mention est assez bien");
			}
			else {
				if (i<14) {
					System.out.println("Votre mention est bien");
				} 
				else if(i<16) {
					System.out.println("Votre mention est tr�s bien");
				}
				else if(i<=20) {
					System.out.println("Vous avez les f�licitations du juri!");
				}
			}
		}
		else{
		if (i>=8) {
			System.out.println("Vous �tes sur liste d'attente.");
		}
		else {
			System.out.println("Vous �tes refus�.");
		}
		}
		System.out.println("FIN");
		}
*/
	


