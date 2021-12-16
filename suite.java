package javaGit;


public class suite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Algo : RESULTAT \n DEBUT");
		int i;
		System.out.println("Veuillez saisir la note:");
		i=Clavier.lireInt();
		if(i>=10) {
			System.out.println("Vous êtes admis.");
			if(i<12) {
				System.out.println("Votre mention est assez bien");
			}
			else {
				if (i<14) {
					System.out.println("Votre mention est bien");
				} 
				else if(i<16) {
					System.out.println("Votre mention est très bien");
				}
				else if(i<=20) {
					System.out.println("Vous avez les félicitations du juri!");
				}
			}
		}
		else{
		if (i>=8) {
			System.out.println("Vous êtes sur liste d'attente.");
		}
		else {
			System.out.println("Vous êtes refusé.");
		}
		}
		System.out.println("FIN");
		}

}
