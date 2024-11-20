package menu;

import java.util.Scanner;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Menu {
	
	public Menu() {
		Init();
	}
	
	String choosenName = "ikik";
	
	Scanner myScanner = new Scanner(System.in);
	
	public void Init() {
		System.out.println("///////////////");
		System.out.println("//");
		System.out.println("// " + choosenName );
		System.out.println("//");
		System.out.println("///////////////");
		System.out.println("//");
		System.out.println("// 1: Insertar nombre ");
		System.out.println("//");
		System.out.println("// 2 Monstar los nombres");
		System.out.println("//");
		System.out.println("///////////////");
	}
	
	
	
}