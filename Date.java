package javaGit;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Date {
	public static void aujourdhui() {
		Date ma_date = new Date();
        long time = ma_date.getTime();
		afficheDate(ma_date);

	}
	private long getTime() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void afficheDate(Date uneDate) {
        SimpleDateFormat mon_format = new SimpleDateFormat("dd MM yyyy");
        System.out.println(mon_format.format(uneDate));
    }
	public static void maintenant(Date localTime) {
		 SimpleDateFormat mon_heure = new SimpleDateFormat("hh:mm:ss");
	     System.out.println(mon_heure.format(localTime));
	}
	public static void saisirDate() {
		int i;
		int j;
		int k;
		System.out.println("Quel jour sommes-nous? ");
		i=Clavier.lireInt();
		System.out.println("Quel mois sommes-nous? ");
		j=Clavier.lireInt2();
		System.out.println("Quelle année sommes-nous? ");
		k=Clavier.lireInt3();
		System.out.println("D'après vous nous sommes le: "+i+" "+j+ " "+k);
	}
}
