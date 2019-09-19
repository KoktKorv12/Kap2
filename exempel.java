/*
	Hallå!
*/

import javax.swing.*;
import java.util.Scanner;

public class exempel {
	public static void main (String[] args) {
		// varibeldeklaration
		String msg;
		// tilldelning
		msg = "Nu har variabeln ett värde";
		JOptionPane.showMessageDialog(null,msg);
		
		// I terminalen
		System.out.println("Skriv ett meddelande");
		Scanner tgb = new Scanner(System.in);
		msg = tgb.nextLine();
		System.out.println(msg);
	}
}