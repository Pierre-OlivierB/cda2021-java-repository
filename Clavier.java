package javaGit;

import java.util.Scanner;

public class Clavier {

	public static Integer lireInt() {
		Scanner choice= new Scanner(System.in);
		int test = choice.nextInt();
	    return test;
	}

}
