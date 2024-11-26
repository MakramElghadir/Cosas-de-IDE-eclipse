package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Menu {
	
	public Menu() {
		Init();
	}
	
	
	List<String> choosenName = new ArrayList<>();
	int choosenNameSize = 0;
	boolean isNumber = false;
	
	Scanner Input = new Scanner(System.in);
	
	
	
	public void Init() {
		System.out.println("///////////////");
		System.out.println("//");
		System.out.println("//");
		System.out.println("//");
		System.out.println("///////////////");
		System.out.println("//");
		System.out.println("// 1: Monstar los nombres ");
		System.out.println("//");
		System.out.println("// 2: Insertar nombre");
		System.out.println("//");
		System.out.println("///////////////");
		System.out.println(" ");
		System.out.println(" ");
		int choice = Input.nextInt();
		System.out.println(choice);
		
		if (choice == 1) {
			System.out.println("///////////////");
			System.out.println("//");
			System.out.println("// " + choosenName );
			System.out.println("//");
			System.out.println("///////////////");
			System.out.println("//");
			System.out.println("// toca el clave para regressar");
			System.out.println("//");
			System.out.println("///////////////");
			System.out.println(" ");
			System.out.println(" ");
			int regresso = Input.nextInt();
			
			if (regresso == 0) {
				Init();
			}
		}
		
		if (choice == 2) {
			System.out.println("///////////////");
			System.out.println("//");
			System.out.println("Insertar nombre");
			System.out.println("//");
			System.out.println("///////////////");
			System.out.println(" ");
			System.out.println(" ");
			Input.nextLine();
			String newName = Input.nextLine();
			
			
			if (newName.matches(".*\\d.*")) {

				
				System.out.println("///////////////");
				System.out.println("//");
				System.out.println("No Acceptamos numeroses");
				System.out.println("//");
				System.out.println("///////////////");
				System.out.println(" ");
				System.out.println(" ");
				
				newName = "";
				Init();				
				
			}
			
			else {
				
				if (newName != "" ) {
					System.out.println("///////////////");
					System.out.println("//");
					System.out.println(newName + " Insertado");
					System.out.println("//");
					System.out.println("///////////////");
					System.out.println(" ");
					System.out.println(" ");
					choosenName.add(newName);
					
					newName = "";
					Init();
				
				}
				
			}
			
			
				
		}
		
		else {
			System.out.println(" ");
			System.out.println(" ");
			Init();
		}
		
	}




	
	
	
}