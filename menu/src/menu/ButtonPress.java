package menu;

import java.util.Scanner;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class ButtonPress {
	
		public ButtonPress() {
			Init();
		}
	
	Scanner myScanner = new Scanner(System.in);

		
	public void  main(String[] args) throws Exception
	{
		JFrame f=new JFrame();
		f.addKeyListener(new KeyAdapter() {
			public void KeyPressed(KeyEvent e) {
		int KeyCode=e.getKeyCode();
		System.out.println(KeyCode);
		if(KeyCode==65) {
			System.out.println("A is pressed... ");
		}
			};
		});
		
		f.setVisible(true);
	}

}
