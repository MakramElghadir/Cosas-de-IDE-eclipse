package myPackage;

import java.util.Scanner;

public class Amabish {
	static Scanner myScanner = new Scanner(System.in);
	
	public static void Init() {
		System.out.println("///////////////");
		System.out.println("//");
		System.out.println("//COLLAPSING CALCULATOR OF DEATH");
		System.out.println("//");
		System.out.println("///////////////");
		System.out.println("//");
		System.out.println("// 1 ADDITION");
		System.out.println("//");
		System.out.println("// 2 SUBSTRACTION");
		System.out.println("//");
		System.out.println("///////////////");
		
		int aux = myScanner.nextInt();
		myScanner.close();
		
		switch (aux) {
		case 1:
			
			break;
		case 2:
			break;
			
		default:
			System.out.println("//");
			System.out.println("//PUT SOME OF THE NUMBERS I GAVE TO YOU FUCKING COCKSUCKER!");
			System.out.println("//");
			Init();
			break;
	
		}
		
	}
	
}