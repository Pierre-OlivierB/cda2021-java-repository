package javaGit;

import java.awt.print.Paper;
import java.rmi.server.RemoteStub;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class suite {

	public static void main(String[] args) {
		/*boolean test = true;
		do {*/
			
			game();
			System.out.println("Voulez-vous Continuer? yes/no");
			String reponse=Clavier.lireString();
			System.out.println("Your choice: "+reponse);
			if (reponse.equals("yes")) {
				main(args);
			}
			else {
				/*test = false;*/
				System.out.println("Your score: "+ j);
				System.out.println("Merci d'avoir joué à la prochaine!");
				System.out.println("End!");
			}
			
		/*} 
		while (test);*/
	}
	
	public static void game() {
		int n ,m ,r ,p ,s;
		int score=0;
		m=0;
		r=1;
		p=2;
		s=3;
		do {
			System.out.println("Rock(1), Paper(2), Scisors(3)");
			System.out.println("Your choice: 1 or 2 or 3");
			n=Clavier.lireInt();
			for(int i=1; i<=3;i++) {
				m=(int)(Math.random()*3)+1;
			}
			System.out.println("Computer choice: "+m);
			if (n==m) {
				System.out.println("Same choice, try again!");
			}
		}
		while(n==m);
			
		if(n==r) {
				if (m==p) {
					System.out.println("Computer choice : Paper");
					System.out.println("You loose");
					--j;
					gameScore();
				}
					
				else if (m==s) {
					System.out.println("Computer choice : Scisors");
					System.out.println("You win");
					gameScore();
				}
			}
					
		else if(n==p) {
					if (m==r) {
						System.out.println("Computer choice : Rock");
						System.out.println("You win");
						gameScore();
					}
						
					else if (m==s) {
						System.out.println("Computer choice : Scisors");
						System.out.println("You loose");
						--j;
						gameScore();
					}	
				
			}
		else if(n==s) {
				if (m==p) {
					System.out.println("Computer choice : Paper");
					System.out.println("You win");
					gameScore();
				}
					
				else if (m==r) {
					System.out.println("Computer choice : Scisors");
					System.out.println("You loose");
					--j;
					gameScore();
				}	
			
			}
		System.out.println("Your score: "+ j);
		
	
	}
	static int j =0;
	public static void gameScore(){
		++j;
		System.out.println("Your score is at : "+j);
	}
}	
		/*int i, n, som;
        som = 0;
        i=0;
        for (i = 0; i < 4; i++) {
            System.out.println(i+"-Donnez une notez sur 20");
            n = Clavier.lireInt();
            som += n;
        }
        System.out.println("Moyenne = " + (som/4)+ "/20.");
        if((som/4)>=10) {
        	System.out.println("admis");
        }
        else if((som/4)<10) {
        	if((som/4)>=8) {
        		System.out.println("admissible");
        	}
        	else if ((som/4)<8) {
				System.out.println("recalé");
			}
        	
        }*/
		
	        /*int i, n, som;
	        som = 0;
	        i=0;*/
	        /*for (i = 0; i < 4; i++) {
	            System.out.println(i+"-Donnez un entier");
	            n = Clavier.lireInt();
	            som += n;
	        }*/
	        
	        /*while (i<4) {
	        	System.out.println(i+"-Donnez un entier");
	            n = Clavier.lireInt();
	            som += n;
				i++;
			}*/
	        /*do {
	        	System.out.println(i+"-Donnez un entier");
	        	n = Clavier.lireInt();
	        	som += n;
	        	i++;
	        }
	        while(i<4);
	        System.out.println("Somme = " + som);*/

/*for (int i = 0; i < 12; i++) {
		      switch (i) {
		        case 9:
		          System.out.println("Neuf");
		          break;
		        case 8:
		          System.out.print("Huit");
		          System.out.println("");
		          break;
		        case 7:
		          {
		            System.out.print("Sept");
		            System.out.println("");
		          }
		          break;
		        case 6:
		          System.out.print("Six ");
		        case 5:
		          System.out.println("Cinq");
		          break;
		        case 4:
		        case 3:
		          System.out.print("Quatre Trois ");
		        case 2:
		          System.out.println("Deux");
		          break;
		        case 1:
		          System.out.println("Un");
		          break;
		        default:
		          System.out.println("Zero");
		          break;
		      }
		    }
		 System.out.println("Fin");*/


/*int x = 1; 
		double a = 0;
		for( x = 1; x <= 10; x++){
		     a = x - 7;
		     if (a == 0){
		         System.out.println("Division par 0");
		         break; 
		       }
		     System.out.println(1/a);
		    }*/	

/*int x = 1;
	    float a;
	    while (x <= 10) {
	      x++;
	      System.out.print("x = " + x);
	      if (x == 7) {
	        System.out.println("\tDivision par zero!");
	        continue;
	      }
	      a = (float) 1 / (x - 7);
	      System.out.println(" \ta = " + a);
	    }*/

		/*Scanner sc = new Scanner(System.in);
		int valeur;
		String chaine_lue;
		try {
		    do {
		         // Lecture d'une ligne au clavier
		         chaine_lue = sc.nextLine();
		         //Conversion de la chaine en entier
		         valeur=Integer.parseInt(chaine_lue);
		       }
		    while ((valeur < 5) || ( valeur > 10));
		} 
		catch (Exception e) {
		    System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
		}*/		
		
		/*final int fin =10;
		int somme = 0;
		int i =0;
		while(i<fin) {
			somme+=i;
			System.out.println(somme);
			System.out.println(i);
			i++;
			System.out.println("La somme vaut :"+ somme);
		}*/

/*for (int i = 5; i <= 10; i=i+2) {
            System.out.println(i);
            }*/
/*
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
		*/
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
			System.out.println("Les deux chiffres sont égaux!");
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
*/
	


