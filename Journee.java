package javaGit;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Journee {
	public static String aujourdhui() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String time = simpleDateFormat.format(new Date());
        return time;
	}
	public static String maintenant() {
		 SimpleDateFormat mon_heure = new SimpleDateFormat("hh:mm:ss");
	     String heureActuelle = mon_heure.format(new Date());
	     return heureActuelle;
	}
	public static Integer saisirDate(int jour, int mois, int annee) {
		System.out.println("Quel jour sommes-nous? "+jour);
		System.out.println("Quel mois sommes-nous? "+mois);
		System.out.println("Quelle année sommes-nous? "+annee);
		System.out.println("D'après vous nous sommes le: "+jour+" "+mois+ " "+annee);
		return 0;
	}
}
